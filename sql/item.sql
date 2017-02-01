select * from shop;

select * from item; 

insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `shopNo`, `itemCategoryNo`)
VALUES('딸기케이크', 1, 10000, 5000, 50, now(), 'im.jpg', 1, 2);

select * from itemcategory;
insert INTO itemcategory (content) VALUES('케이크');

commit;