
-------------------- /* USER 사용자  (매장보유자 1, 일반사용자 2) */
select * from users;

insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) 
		   values ('11111@mail.com', '11111', 'male', 'seoul', now(), 1, shopno);
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) 
		   values ('22222@mail.com', '22222', 'female', 'seoul', now(), 2, shopno);	
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) 
		   values ('33333@mail.com', '33333', 'male', 'seoul', now(), 1, 1);		   	   

delete from users;
delete from users where no=숫자; 

rollback;
commit;


-------------------- /* SHOP 매장 */
select * from shop;

insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude)
		  values ('서울시 강남구 서초2동', '서울시 강남구 서초대로', 'CU 편의점', '02-111-1111', 'shop1.jpg', '안녕하세요. CU 삼성전자본점 입니다.', 37.497056, 127.027196);
insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude)
		  values ('서울시 강남구 역삼동', '서울시 강남구 테헤란로', '파리바게트', '02-222-2222', 'shop2.jpg', '안녕하세요. 파리바게트 역삼특허청점 입니다.', 37.497584, 127.031670);
insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude)
		  values ('서울시 강남구 서초4동', '서울시 사평대로', '이마트에브리데이', '02-333-3333', 'shop3.jpg', '안녕하세요.이마트에브리데이 서초동점 입니다.', 37.502422, 127.021807);		  		   

delete from shop;

rollback;
commit;


-------------------- /* ITEMCATEGORY 상품카테고리 */
select * from itemcategory;

insert into itemcategory (content) values ('생수/음료/커피');
insert into itemcategory (content) values ('유제품/냉장ㆍ동');
insert into itemcategory (content) values ('과자/초콜렛/빵');
insert into itemcategory (content) values ('라면/통조림/장');
insert into itemcategory (content) values ('과일/견과/채소');

delete from itemcategory;
delete from itemcategory where no=숫자;

rollback;
commit;


-------------------- /* ITEM 상품 */
select * from item;

insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, showItem, `shopNo`, `itemCategoryNo`)
		  values ('라면', 1, 1000, 900, 10, now(), 'item1.jpg', 1, 3, 4);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, showItem, `shopNo`, `itemCategoryNo`)
		  values ('오렌지 쥬스', 1, 2000, 1600, 20, now(), 'item2.jpg', 1, 2, 1);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, showItem, `shopNo`, `itemCategoryNo`)
		  values ('초콜렛', 1, 1000, 700, 30, now(), 'item3.jpg', 1, 1, 3);		  		  
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, showItem, `shopNo`, `itemCategoryNo`)
		  values ('바나나', 1, 2000, 1200, 40, now(), 'item4.jpg', 1, 3, 5);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, showItem, `shopNo`, `itemCategoryNo`)
		  values ('도시락', 1, 3000, 1500, 50, now(), 'item5.jpg', 1, 1, 2);
insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, showItem, `shopNo`, `itemCategoryNo`)
		  values ('빵', 1, 4000, 2000, 50, now(), 'item6.jpg', 1, 2, 3);		  		  

-- insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) values (#{name }, #{count }, #{oriPrice }, #{price }, #{discount }, #{expDate }, 'picture', 1, 1, 1) -- 		  

delete from item;	  		  
delete from item where no=숫자;

rollback;
commit;


-------------------- /* COMMENTS 평가(댓글,평점) */
select * from comments c;

insert into comments (content, grade, `shopNo`, `usersNo`)
			  values ('좋아요', 5, 1, 1); 

delete from comments;

rollback;
commit;


-------------------- /* TEST 테스트 */
insert into users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) 
			VALUES('1@1', '12345', 'female', 'seoul', now(), 1, shopno);

insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude)
		   VALUES('서울시 관악구 신림동', '서울시 관악구 신림로66길', 'GS25', '02-123-4567', 'shop2.jpg', '안녕하세요. GS25 신림로점입니다.', 30, 38);

insert INTO itemcategory (content) VALUES('밥');
insert INTO itemcategory (content) VALUES('빵');
insert INTO itemcategory (content) VALUES('음료');

select i.*, s.name shopName, c.grade 
from item i left outer join shop s 
on i.`shopNo` = s.no right outer join (select avg(grade) as grade, shopNo
										from comments
										group by shopNo
										order by shopNo) c on s.no = c.shopNo where i.no = 1;

/* insert INTO item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES(#{name }, #{count }, #{oriPrice }, #{price }, #{discount }, #{expDate }, 'picture', 1, 1, 1) */										
