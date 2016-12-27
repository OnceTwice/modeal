DROP USER modeal CASCADE ;

create USER modeal IDENTIFIED BY modeal;

grant RESOURCE , CONNECT to modeal;

commit;