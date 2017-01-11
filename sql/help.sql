-- 고객센터 sql문 (	2017.01.11 oracle에서 mysql로 변경했음) --

-- seq 생성 --
CREATE SEQUENCE help_seq
START WITH 1
INCREMENT BY 1
MAXVALUE 9999999999;
commit;

-- seq 삭제 --
drop sequence help_seq;
commit;

-------------------------------------------------- mysql문

-- 현재 날짜 String 출력 --
select date_format(now(), '%Y-%m-%d %H:%i:%s');

-- 리스트 생성 ( exerd : no, title, complain, regDate, usersNo(id) ) -- 
INSERT INTO help (title, complain, `regDate`, `usersNo`) 
	 VALUES ('title', 'complain', DATE_FORMAT(now(), '%Y-%m-%d %H:%i:%s'), 1);
COMMIT;

-- 테이블 조회 --
SELECT * FROM help;
COMMIT;

-- 리스트 삭제 --
DELETE help;
DELETE FROM help WHERE no = 0;
COMMIT;

-- rollback --
ROLLBACK;

-- commit --
COMMIT;

-------------------------------------------------- 테스트해보기

/* 글쓴이 번호를 아이디로 받아오기 */
select h.NO, h.TITLE, h.COMPLAIN, h.REGDATE, u.ID
from help h, users u
where h.USERSNO = u.NO
and h.USERSNO = 2;

-------------------------------------------------- oracle sql문
/* seq 생성 */
CREATE SEQUENCE help_seq
START WITH 1
INCREMENT BY 1
MAXVALUE 9999999999;
commit;

/* seq 삭제 */
drop sequence help_seq;
commit;

/* 리스트 생성 ( no, title, complain, regdate, userno(id) */ 
insert into help(no, title values(help_seq.nextval, '사용자 가입 문의', '비번을 까먹어서 찾으려고 하는데 임시 비번 메일이 안와요;;', sysdate, 1);
insert into help values(help_seq.nextval, '앱 실행이 안돼요', '모딜 앱 실행했는데 즐겨찾기 추가가 안돼요ㅜㅜ', sysdate, 2);
commit;

/* 테이블 조회 */
select * from help;
commit;

/* 리스트 삭제 */
delete help;
delete from help where no = 0;
commit;

/* rollback */
rollback;

/* commit */
commit;
