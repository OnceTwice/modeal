SELECT * FROM bookmark;

SELECT no
  FROM bookmark
 WHERE usersNo = 1 AND itemNo = 6;

SELECT * FROM users;

SELECT * FROM shop;

SELECT * FROM item;

SELECT u.*,
       s.address,
       s.newaddress,
       s.name,
       s.phone,
       s.picture,
       s.introduce
  FROM users u LEFT OUTER JOIN shop s ON u.`shopNo` = s.no
 WHERE u.id = '1@1';

INSERT INTO bookmark(`usersNo`,
                     `itemNo`,
                     `shopNo`,
                     `itemCategoryNo`)
     VALUES (1,
             6,
             shopno,
             itemcategoryno);

COMMIT;

DELETE FROM bookmark
      WHERE itemNo = 8 AND usersNo = 1;