alter table users AUTO_INCREMENT = 1;

select *
from item;

select *
from users;

select *
from shop;

select *
from comments;

select *
from itemcategory;

commit;

insert INTO
item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`)
VALUES('첼시', 1, 10000, 9000, 10, '2017/02/20 09:00', 'a.jpg', 1, 1, 1);

insert INTO
item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`)
VALUES('맨시티', 2, 10000, 9000, 10, '2017/02/20 09:00', 'b.jpg', 1, 2, 2);


insert INTO
item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`)
VALUES('토트넘', 3, 10000, 9000, 10, '2017/02/20 09:00', 'c.jpg', 1, 3, 3);


insert INTO
item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`)
VALUES('아스날', 4, 10000, 9000, 10, '2017/02/20 09:00', 'd.jpg', 1, 1, 4);


insert INTO
item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`)
VALUES('리버풀', 5, 10000, 9000, 10, '2017/02/20 09:00', 'e.jpg', 1, 2, 5);

insert INTO
item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`)
VALUES('맨유', 6, 10000, 9000, 10, '2017/02/20 09:00', 'f.jpg', 1, 3, 1);



insert into itemcategory (content) values ('생수/음료/커피');
insert into itemcategory (content) values ('유제품/냉장ㆍ동');
insert into itemcategory (content) values ('과자/초콜렛/빵');
insert into itemcategory (content) values ('라면/통조림/장');
insert into itemcategory (content) values ('과일/견과/채소');



insert INTO comments (content, grade, `shopNo`, `usersNo`)
			  VALUES ('싸다구', 1, 1, 1);
insert INTO comments (content, grade, `shopNo`, `usersNo`)
			  VALUES ('많다', 2, 2, 2);
insert INTO comments (content, grade, `shopNo`, `usersNo`)
			  VALUES ('적다', 3, 3, 3);
insert INTO comments (content, grade, `shopNo`, `usersNo`)
			  VALUES ('비싸다', 4, 1, 4);
insert INTO comments (content, grade, `shopNo`, `usersNo`)
			  VALUES ('그냥그래', 5, 2, 2);
insert INTO comments (content, grade, `shopNo`, `usersNo`)
			  VALUES ('응끄래끄래', 4, 3, 3);