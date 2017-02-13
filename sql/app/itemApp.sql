
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('admin', 'admin', '남', '서울 강남구', '20170208', 0, shopno);
  
insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude) VALUES('서울 강남구 ', '서초대로', '파리바게트', '1234-5678', 'picture_01.jpg', '파리파게트', 37.495175, 127.028454);
insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude) VALUES('서울 강남구 ', '서초대로', 'GS편의점', '1234-5678', 'picture_02.jpg', '파리파게트', 37.500040, 127.024890);
   
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('1@2', '123456', '여', '서울 강남구', '20070310', 0, 1);
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('test02', '1', '남', '서울 강남구', '20170208', 0, 1);
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('test03', '1', '남', '서울 강남구', '20170208', 0, 1);

insert INTO categoryno ( category) VALUES('베이커리'); 

select * from categoryno c; 

select * from shop;
select * from users;

select * from itemcategory i;

insert INTO itemcategory (content) VALUES('베이커리');
insert INTO itemcategory (content) VALUES('김밥');

commit;

insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES('마늘빵', 5, 2000, 1800, 10, '20170305', 'test_01.jpg', 1, 1, 1);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES('마빵', 5, 2000, 1800, 10, '20170305', 'test_02.jpg', 1, 1, 1);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES('늘빵', 5, 2000, 1800, 10, '20170305', 'test_03.jpg', 1, 1, 1);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES('식빵', 5, 2000, 1800, 10, '20170305', 'test_02.jpg', 1, 1, 1);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES('롤빵', 5, 2000, 1800, 10, '20170305', 'test_03.jpg', 1, 1, 1);



 SELECT CONCAT(floor((DATE_FORMAT(now(), '%Y') - SUBSTR(birth,1,4))/10)*10,'대') AS age ,count(*) as count FROM users group by age;

SELECT COUNT(CASE WHEN age < 10 THEN 1 END) "10down" 
, COUNT(CASE WHEN age BETWEEN 10 AND 19 THEN 1 END) "10" 
, COUNT(CASE WHEN age BETWEEN 20 AND 29 THEN 1 END) "20" 
, COUNT(CASE WHEN age BETWEEN 30 AND 39 THEN 1 END) "30" 
, COUNT(CASE WHEN age BETWEEN 40 AND 49 THEN 1 END) "40" 
, COUNT(CASE WHEN age BETWEEN 50 AND 59 THEN 1 END) "50" 
, COUNT(CASE WHEN age BETWEEN 60 AND 69 THEN 1 END) "60" 
, COUNT(CASE WHEN age BETWEEN 70 AND 79 THEN 1 END) "70" 
, COUNT(CASE WHEN age >= 80 THEN 1 END) "80up" 
FROM (SELECT DATE_FORMAT(now(), '%Y') - SUBSTR(birth,1,4) AS age FROM users) u;