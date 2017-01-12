-- seq 생성 및 삭제
drop sequence notice_seq;

CREATE SEQUENCE notice_seq
START WITH 1
INCREMENT BY 1
MAXVALUE 9999999999;

drop sequence categoryno_seq;

CREATE SEQUENCE categoryno_seq
START WITH 1
INCREMENT BY 1
MAXVALUE 9999999999;

-- 검색 및 삭제
select *
from categoryno;

delete from categoryno where no=4;
delete from categoryno;

select *
from notice;

delete from notice;

commit;

-- mock data 삽입(categoryno삽입 후 notice 삽입/순서역전시 무결성제약조건발생)
insert
into categoryno
values(categoryno_seq.nextval, 'Total Notify');

insert
into categoryno
values(categoryno_seq.nextval, 'User Notify');

insert
into categoryno
values(categoryno_seq.nextval, 'Shop Notify');

insert
into notice
values(notice_seq.nextval, '공지1입니다', '공지1내용입니다', sysdate, 1);

insert
into notice
values(notice_seq.nextval, '공지2입니다', '공지2내용입니다', sysdate, 2);

insert
into notice
values(notice_seq.nextval, '공지3입니다', '공지3내용입니다', sysdate, 3);

insert
into notice
values(notice_seq.nextval, '공지1 불만입니다', '공지1 불만내용입니다', sysdate, 1);

insert
into notice
values(notice_seq.nextval, '공지1 배송입니다', '공지1 배송내용입니다', sysdate, 2);

insert
into notice
values(notice_seq.nextval, '공지1 상품입니다', '공지1 상품내용입니다', sysdate, 3);

select n.no, c.category, n.title, to_char(n.regDate, 'yyyy-mm-dd hh:mi:ss') as regDate
from categoryno c, notice n
where c.no=n.categoryno;

select no, category, title, regDate
from (	select n.no, c.category, n.title, to_char(n.regDate, 'yyyy-mm-dd hh:mi:ss') as regDate
		from categoryno c, notice n
		where c.no=n.categoryno);
		
-- insert로 만든 categoryno 테이블에 있는 mock data 수정
select *
from categoryno;

update categoryno
set category='Total Notify'
where no=1;

update categoryno
set category='User Notify'
where no=2;

update categoryno
set category='Shop Notify'
where no=3;

commit;

-- mySQL 시작
-- 현재 날짜 검색
select now();
select sysdate();

-- 현재 날짜 String 출력
select date_format(now(), '%Y-%m-%d %H:%i:%s');

-- insert
insert into notice (title, content, `regDate`, `saveFileName`, `categoryNo`)
VALUES('title', 'content', DATE_FORMAT(now(), '%Y-%m-%d %H:%i:%s' ), 'savefilename', 1);

insert
into categoryno
values(1, 'Total Notify');

-- table insert
select *
from notice;

select *
from categoryno;

commit;
-- 
select *
from (select no, category, title, regDate, FORMAT(@ROWNUM:=@ROWNUM+1,0) AS rn
		from (	select n.no, c.category, n.title, DATE_FORMAT(now(), '%Y-%m-%d %H:%i:%s' ) as regDate
				from categoryno c, notice n
				where c.no=n.categoryno
				order by no desc )k, (select @ROWNUM:=0) b )j;
				
insert into categoryno values(1, 'Total Notify');
insert into categoryno values(2, 'User Notify');
insert into categoryno values(3, 'Shop Notify');