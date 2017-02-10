select *
from shop;

insert
into shop (address, newaddress, name, phone, picture, introduce, longitude, latitude)
VALUES ('지번주소', '도로명주소', '빠리', '010-245-4842', 'http://www', '소개입니당', 38, 145);

delete
from shop;

alter table shop AUTO_INCREMENT = 1;

commit;