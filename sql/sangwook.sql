/* 범위 내 상점 */
SELECT * FROM shop
 		 WHERE 0.009009 > SQRT (POWER ( (127.02 - longitude), 2) + POWER ( (37.49 - latitude), 2));

/* 상세 상품 페이지 */
select i.*, s.name shopName, s.no, c.grade 
			from shop s left outer join item i on i.`shopNo` = s.no 
							left outer join 
										(select avg(grade) as grade, shopNo
										from comments
										group by shopNo) c on s.no = c.shopNo 
			where i.no =  4;
			
/* 기초적인것 */
SELECT * FROM users;
SELECT * FROM shop;
SELECT * FROM item;
SELECT * FROM itemcategory;

update item SET picture = '도시락1.jpg' WHERE no = 7;

insert into comments (content, grade, `shopNo`, `usersNo`) VALUES('좋아요', 3, 1, 1);

/* 매장 위도 경도 변경 */
update shop SET latitude = 37.49, longitude = 127.02 where no = 1;

/* 범위내 상품 목록 */
SELECT i.*, s.name shopName, SQRT (POWER ( (127.027328 - longitude), 2) + POWER ( (37.494492 - latitude), 2))/0.001/0.009009 distance
  	 	  			FROM item i right outer join shop s on i.`shopNo` = s.no
 		 			WHERE 0.027009 > SQRT (POWER ( (127.027328 - longitude), 2) + POWER ( (37.494492 - latitude), 2)) and i.`showItem` = 1
					order by distance asc, no desc;
					
select i.*, s.name as shopName
			from item i left OUTER JOIN shop s ON s.no = i.`shopNo`
			where i.`shopNo` = 1;
					
select b.*, i.name iname, i.picture ipicture, s.name sname, s.picture spicture 
from bookmark b left outer join item i on b.itemNo = i.no 
						left outer join shop s on b.shopNo = s.no 
where b.usersNo = 4
order by no desc, itemNo asc;

commit;

insert INTO shop (address, newaddress, name, phone, picture, introduce, longitude, latitude) VALUES('역삼3132333242', '신역삼413233232', '씨유133233242', '02-1234-1234', '갓영조2.jpg', '헬헬헬', 127.036618, 37.504);

insert into item (name, count, `oriPrice`, price, discount, `expDate`, picture, `showItem`, `shopNo`, `itemCategoryNo`) 
VALUES('삼각김밥8', 10, 1000, 500,  50, '2017/02/20 09:00', '갓영조1.jpg', 1, 7, 1);

insert INTO users (id, password, gender, location, birth, `managerIdentified`, `shopNo`) VALUES('3@3', '12345', 'male', '역삼', '1990/10/31', 2, 2);
INSERT INTO itemcategory (content) VALUES('삼각김밥류'); 

update item SET `expDate` = '2017/02/21 16:33' WHERE no = 12;

select b.*, i.name iname, i.picture ipicture, s.name sname, s.picture spicture 
			from bookmark b left outer join item i on b.itemNo = i.no 
				  					left outer join shop s on b.shopNo = s.no 
			where b.usersNo = 4 
			order by no desc;	
			

