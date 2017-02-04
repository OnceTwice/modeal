insert
into users
(id, password, gender, location, birth, `managerIdentified`, `shopNo`)
values('아이디', '패스패스', '젠더', '위치치치', '생일', 1, null);

select *
from users;

delete
from users;

alter table users AUTO_INCREMENT = 1;

commit;

