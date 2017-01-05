/* 고객센터 sql문 */

/* 고객센터  게시물 생성 ( no, title, complain, regdate, userno(id) */ 
insert into help VALUES(help_seq.nextval, '사용자 가입 문의', '비번을 까먹어서 찾으려고 하는데 임시 비번 메일이 안와요;;', sysdate, 22);
insert into help VALUES(help_seq.nextval, '앱 실행이 안돼요', '모딜 앱 실행했는데 즐겨찾기 추가가 안돼요ㅜㅜ', sysdate, 21);

/* 고객센터 게시물 삭제 */
delete from help;
delete from help where no = 23;

/* 테이블 조회 */
select * from notice;
select * from users;
select * from shop;
select * from help;

/* seq 생성 및 삭제 */
CREATE SEQUENCE help_seq
START WITH 1
INCREMENT BY 1
MAXVALUE 9999999999;

drop sequence help_seq;

/* commit */
commit;