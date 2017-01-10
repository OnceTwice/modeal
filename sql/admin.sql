SELECT * FROM SHOP s; 

DELETE FROM SHOP;

INSERT INTO SHOP VALUES(shop_seq.nextval, '11', '11','11', '11', '11', '11', 37.29456429671521, 126.8280215767454);
INSERT INTO SHOP VALUES(shop_seq.nextval, '11', '11','11', '11', '11', '11', 37.39456429671521, 126.9280215767454);
INSERT INTO SHOP VALUES(shop_seq.nextval, '11', '11','11', '11', '11', '11', 37.49456429671521, 127.0280215767454);
INSERT INTO SHOP VALUES(shop_seq.nextval, '11', '11','11', '11', '11', '11', 37.59456429671521, 127.1280215767454);
INSERT INTO SHOP VALUES(shop_seq.nextval, '11', '11','11', '11', '11', '11', 37.69456429671521, 127.2280215767454);
COMMIT ;

INSERT INTO users (id, password, gender, location, birth, `managerIdentified`) VALUES('admin', 'admin', 'null', 'null', 'null', 0);
commit;
SELECT * FROM users WHERE id ='admin' AND password = 'admin';

select * 
	  FROM users 
	 WHERE ID=#{id} AND PASSWORD=#{password}