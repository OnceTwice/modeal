/* 웹 */
insert into categoryno values(1, 'Total Notify');
insert into categoryno values(2, 'User Notify');
insert into categoryno values(3, 'Shop Notify');

insert INTO users (id, password, gender, location, birth, `managerIdentified`, `shopNo`)
		    VALUES('admin', 'admin', 'man', '서울', '19901031', 0, null);
			
/* 앱 */
insert into itemcategory (content) values ('생수/음료/커피');
insert into itemcategory (content) values ('유제품/냉장ㆍ동');
insert into itemcategory (content) values ('과자/초콜렛/빵');
insert into itemcategory (content) values ('라면/통조림/장');
insert into itemcategory (content) values ('과일/견과/채소');

/* 통계용 User */
insert INTO users (id, password, gender, location, birth, `managerIdentified`, `shopNo`)
		    VALUES('0001@test', 'test', 'man', 'location', 'birth', manageridentified, shopno);