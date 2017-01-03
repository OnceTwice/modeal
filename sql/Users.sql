commit;

INSERT INTO USERS VALUES(users_seq.nextval, 'admin', 'admin', 'man', 'none', 'none', 0, null);
INSERT INTO USERS VALUES(users_seq.nextval, 'kkkk', 'kkkk', 'woman', 'kkkk', 'none', 1, null);
commit;

SELECT * FROM USERS u;

UPDATE USERS SET MANAGER_IDENTIFIED=0 WHERE NO=2;

select * FROM USERS WHERE USERS.ID='admin' AND USERS.PASSWORD='admin';

select c.no, content, rank, s.name
			from comments c, shop s
			where usersNo=1; 
			
insert INTO COMMENTS VALUES(comments_seq.nextval, 'aaaa', 3, 1, 1);

insert into SHOP VALUES(shop_seq.nextval, '서울', '파리', '01', 'ㅇㅇ', 'ㅇㅇ');



select no, id, gender, location, birth, managerIdentified, shopNo 
from users
where id like '%s%' or location like '%s%'
order by managerIdentified;



