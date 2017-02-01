select * from shop;

insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `shopNo`, `itemCategoryNo`)
VALUES('딸기케이크', 1, 10000, 5000, 50, now(), 'im.jpg', 1, 2);

insert INTO itemcategory (content) VALUES('케이크류');

select * from itemcategory;

select * from item; 

commit;