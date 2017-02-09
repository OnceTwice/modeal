select * from shop;

insert into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude)
			VALUES('서울시 관악구 신림동', '서울시 관악구 신림로66길', 'GS25', '02-123-4567', 'shop2.jpg', '안녕하세요. GS25 신림로점입니다.', 30, 38); 

delete FROM item WHERE no=3;

select * from item; 

insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, showItem, `shopNo`, `itemCategoryNo`)
VALUES('컵라면 신라면', 1, 1000, 800, 20, now(), 'item3.jpg', 1, 2, 1);

select * from itemcategory;

insert INTO itemcategory (content) VALUES('밥');
insert INTO itemcategory (content) VALUES('빵');
insert INTO itemcategory (content) VALUES('음료');

commit;