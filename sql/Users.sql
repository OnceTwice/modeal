INSERT INTO USERS VALUES(users_seq.nextval, 'admin', 'admin', 'man', 'none', 'none', 1, null);
commit;

SELECT * FROM USERS u;

UPDATE USERS SET MANAGER_IDENTIFIED=0 WHERE NO=2;

select * FROM USERS WHERE USERS.ID='admin' AND USERS.PASSWORD='admin';