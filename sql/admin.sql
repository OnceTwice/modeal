SELECT *
  FROM SHOP s;

DELETE FROM SHOP;

INSERT INTO shop(address,
                 newaddress,
                 name,
                 phone,
                 picture,
                 introduce,
                 longitude,
                 latitude)
     VALUES ('11',
             '11',
             '11',
             '11',
             '11',
             '11',
             127.0260215767454,
             37.49256429671521);
			 
			 INSERT INTO shop(address,
                 newaddress,
                 name,
                 phone,
                 picture,
                 introduce,
                 longitude,
                 latitude)
     VALUES ('11',
             '11',
             '11',
             '11',
             '11',
             '11',
             127.0270215767454,
             37.49356429671521);
			 
INSERT INTO shop(address,
                 newaddress,
                 name,
                 phone,
                 picture,
                 introduce,
                 longitude,
                 latitude)
     VALUES ('11',
             '11',
             '11',
             '11',
             '11',
             '11',
             127.0280215767454,
             37.49456429671521);
			 
INSERT INTO shop(address,
                 newaddress,
                 name,
                 phone,
                 picture,
                 introduce,
                 longitude,
                 latitude)
     VALUES ('11',
             '11',
             '11',
             '11',
             '11',
             '11',
             127.0290215767454,
             37.49556429671521);
			 
			 INSERT INTO shop(address,
                 newaddress,
                 name,
                 phone,
                 picture,
                 introduce,
                 longitude,
                 latitude)
     VALUES ('11',
             '11',
             '11',
             '11',
             '11',
             '11',
             127.0300215767454,
             37.49656429671521);

COMMIT;

SELECT * FROM shop ;

INSERT INTO users(id,
                  password,
                  gender,
                  location,
                  birth,
                  `managerIdentified`)
     VALUES ('admin',
             'admin',
             'null',
             'null',
             'null',
             0);

COMMIT;

SELECT *
  FROM users
 WHERE id = 'admin' AND password = 'admin';

select * 
	  FROM users 
	 WHERE ID=#{id} AND PASSWORD=#{password}