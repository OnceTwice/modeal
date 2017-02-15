SELECT * FROM bookmark;
SELECT * FROM users;
SELECT * FROM shop;
SELECT * FROM item;
SELECT * FROM itemcategory;

update shop SET latitude = 37.49, longitude = 127.02 where no = 1;

SELECT i.*, s.name shopName, SQRT (POWER ( (127.027328 - longitude), 2) + POWER ( (37.494492 - latitude), 2))/0.001/0.009009 distance
  	 	  			FROM item i right outer join shop s on i.`shopNo` = s.no
 		 			WHERE 0.9009 > SQRT (POWER ( (127.027328 - longitude), 2) + POWER ( (37.494492 - latitude), 2)) and i.`showItem` = 1
					order by distance asc, no desc;

DELETE FROM users;

commit;

rollback;

select b.*, i.name iname, i.picture ipicture, s.name sname, s.picture spicture 
from bookmark b left outer join item i on b.itemNo = i.no 
						left outer join shop s on b.shopNo = s.no 
where b.usersNo = 1 
order by no desc, itemNo asc;

delete from bookmark where usersNo = 3;

commit;

insert INTO shop (address, newaddress, name, phone, picture, introduce, longitude, latitude) VALUES('역삼3132333242', '신역삼413233232', '씨유133233242', '02-1234-1234', '갓영조2.jpg', '헬헬헬', 127.036618, 37.504);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES('삼각김밥8', 10, 1000, 500,  50, '2017/02/20 09:00', '갓영조1.jpg', 1, 7, 1);
insert INTO users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('3@3', '12345', 'male', '역삼', '1990/10/31', 2, 2);
INSERT INTO itemcategory (content) VALUES('삼각김밥류'); 

COMMIT;

SELECT no
  FROM bookmark
 WHERE usersNo = 1 AND itemNo = 6;

SELECT u.*,
       s.address,
       s.newaddress,
       s.name,
       s.phone,
       s.picture,
       s.introduce
  FROM users u LEFT OUTER JOIN shop s ON u.`shopNo` = s.no
 WHERE u.id = '1@1';

INSERT INTO bookmark(`usersNo`, `itemNo`, `shopNo`, `itemCategoryNo`) VALUES (1, null, 7, itemcategoryno);


DELETE FROM bookmark
      WHERE itemNo = 8 AND usersNo = 1;
	  
update item SET name = '왕큰김밥' WHERE no = 7;