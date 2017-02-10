
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('admin', 'admin', '남', '서울 강남구', '20170208', 0, shopno);
  
insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude) VALUES('서울 강남구 ', '서초대로', '파리바게트', '1234-5678', 'picture_01.jpg', '파리파게트', 37.495175, 127.028454);
insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude) VALUES('서울 강남구 ', '서초대로', 'GS편의점', '1234-5678', 'picture_02.jpg', '파리파게트', 37.500040, 127.024890);
   
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('test', '1', '여', '서울 강남구', '20170208', 0, 1);
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
