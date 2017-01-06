/* 매장 목록 보기*/

SELECT count(*) FROM shop;

/* 매장 생성 */

INSERT INTO shop
     VALUES (shop_seq.NEXTVAL,
             '지번주소',
             '도로명주소',
             '매장명',
			 '매장전화번호',
             '매장사진',
             '매장소개',
			 27,
			 140);

/* 매장 삭제 */

DELETE FROM shop
      WHERE no = 9;

/* COMMIT */
COMMIT;

/* 매장정보와 댓글정보, 글쓴사람 불러오기 (매장 상세정보 뷰) */

/* 이전 조인 방식은 교집합이라고 한다면... 다른 방식(outer)은 합집합 같다. 그 말은 이전 방식은 조인했을 경우 값이 다 있을때만 출력 하지만 다른방식(outer)는 값이 없는 것은 null으로 뜨면서 모든 select 컬럼을 가져온다 */

/* 이전 방식*/

SELECT c.*, s.*, u.id
  FROM shop s, comments c, users u
 WHERE s.no = c.shopNo AND u.no = c.usersNo AND s.no > 0;

/* 다른 방식(outer) */

SELECT c.*, s.*, u.id
  FROM shop s
       LEFT OUTER JOIN comments c ON s.no = c.shopno
       LEFT OUTER JOIN users u ON u.no = c.usersno
 WHERE s.no > 0;

/* [쿼리수정]분류 추가한 검색 시스템 */

/* 검색기능인 where(upper... 의 위치를 한칸 괄호 밖으로 이동했다 nvl과 같은 괄호 안에서는 0을 검색해도 검색이 되지 않기 때문이다 */

  SELECT *
    FROM (SELECT ROWNUM rn, a.*
            FROM (  SELECT s.*, NVL (RANK, 0) AS RANK
                      FROM shop s
                           LEFT OUTER JOIN (  SELECT AVG (RANK) AS RANK, shopNo
                                                FROM comments
                                            GROUP BY shopNo
                                            ORDER BY shopNo) c
                              ON s.no = c.shopNo
                  ORDER BY no DESC) a
           WHERE (   UPPER (name) LIKE '%' || UPPER ('0') || '%'
                  OR LOWER (RANK) LIKE '%' || LOWER ('0') || '%'))
   WHERE rn > (1 - 1) * 20 AND rn <= 1 * 20
ORDER BY rn ASC;

/* 검색 게시물 개수 */

SELECT COUNT (*)
  FROM (  SELECT s.name, NVL (AVG (RANK), 0) RANK
            FROM shop s LEFT OUTER JOIN comments c ON s.no = c.shopNo
        GROUP BY s.name)
 WHERE (   UPPER (name) LIKE '%' || UPPER ('') || '%'
        OR LOWER (RANK) LIKE '%' || LOWER ('') || '%');


/* 정리하기엔 너무 먼 길을 와버렸다...*/

/* 누군가 대신 걸어주길 바란다 */

SELECT *
  FROM shop s, comments c, users u
 WHERE s.no = c.shopNo AND u.no = c.USERSNO;

SELECT *
  FROM comments c;

SELECT *
  FROM shop s, comments c
 WHERE s.no = c.shopNo AND s.no = 4;

SELECT *
  FROM shop s;

SELECT c.*, s.*, u.id
  FROM shop s, comments c, users u
 WHERE s.no = c.shopNo AND u.no = c.usersNo AND s.no = 2;

  SELECT *
    FROM (  SELECT s.*, ROWNUM rn
              FROM shop s
          ORDER BY no DESC)
   WHERE rn > (4 - 1) * 2 AND rn <= 4 * 2
ORDER BY rn ASC;

SELECT *
  FROM comments c, shop s
 WHERE s.no = c.shopno AND s.no = 3;

SELECT c.*, s.*, u.id
  FROM shop s, comments c, users u
 WHERE s.no = c.shopNo AND u.no = c.usersNo AND s.no = 3;

SELECT c.*, s.*, u.id
  FROM shop s, comments c, users u
 WHERE s.no = c.shopNo AND u.no = c.usersNo;

SELECT c.RANK
  FROM comments c, shop s
 WHERE s.no = c.shopno AND s.no = 4;

-- Inner Join1

SELECT *
  FROM shop s INNER JOIN comments c ON s.no = c.shopno;

-- Inner Join2 (위와 동일)

SELECT *
  FROM shop s, comments c
 WHERE s.no = c.shopno;

-- left outer join

SELECT *
  FROM shop s LEFT OUTER JOIN comments c ON s.no = c.shopno;

SELECT s.no
  FROM shop s LEFT OUTER JOIN comments c ON s.no = c.shopno;

SELECT * FROM shop;


  SELECT s.no,
         s.name,
         s.address,
         s.phone,
         NVL (AVG (RANK), 0)
    FROM shop s LEFT OUTER JOIN comments c ON s.no = c.shopno
GROUP BY s.no,
         s.name,
         s.address,
         s.phone
ORDER BY s.no;

SELECT s.*, NVL (RANK, 0)
  FROM shop s
       LEFT OUTER JOIN (  SELECT AVG (RANK) AS RANK, SHOPNO
                            FROM comments
                        GROUP BY SHOPNO
                        ORDER BY SHOPNO) c
          ON s.no = c.shopno;

SELECT * FROM comments;

SELECT c.*, s.*, u.id
  FROM shop s, comments c, users u
 WHERE s.no = c.shopNo AND u.no = c.usersNo AND s.no = 2;

SELECT c.*, s.*, u.id
  FROM shop s
       LEFT OUTER JOIN comments c ON c.shopno = s.no
       LEFT OUTER JOIN users u ON c.usersno = s.no
 WHERE s.no = 2;

SELECT s.no
  FROM shop s LEFT OUTER JOIN comments c ON s.no = c.shopno;

SELECT c.*, s.*, u.id
  FROM shop s, comments c, users u
 WHERE s.no = c.shopNo AND u.no = c.usersNo AND s.no = 2;

  SELECT *
    FROM (  SELECT ROWNUM rn, s.*, NVL (RANK, 0)
              FROM shop s
                   LEFT OUTER JOIN (  SELECT AVG (RANK) AS RANK, shopNo
                                        FROM comments
                                    GROUP BY shopNo
                                    ORDER BY shopNo) c
                      ON s.no = c.shopNo
             WHERE (   UPPER (name) LIKE '%' || UPPER ('') || '%'
                    OR LOWER (address) LIKE '%' || LOWER ('') || '%')
          ORDER BY no DESC)
ORDER BY rn ASC;

  SELECT AVG (RANK) AS RANK, shopNo
    FROM comments
GROUP BY shopNo
ORDER BY shopNo;

SELECT *
  FROM (SELECT ROWNUM rn, a.*
          FROM (  SELECT s.*, NVL (RANK, 0) AS RANK
                    FROM shop s
                         LEFT OUTER JOIN (  SELECT AVG (RANK) AS RANK, shopNo
                                              FROM comments
                                          GROUP BY shopNo
                                          ORDER BY shopNo) c
                            ON s.no = c.shopNo
                   WHERE (   UPPER (name) LIKE '%' || UPPER ('') || '%'
                          OR LOWER (address) LIKE '%' || LOWER ('') || '%')
                ORDER BY no DESC) a)
 WHERE rn > (1 - 1) * 5 AND rn <= 1 * 5;

  SELECT *
    FROM (  SELECT s.*, ROWNUM rn
              FROM shop s
             WHERE (   UPPER (name) LIKE '%' || UPPER ('') || '%'
                    OR LOWER (address) LIKE '%' || LOWER ('') || '%')
          ORDER BY no DESC)
   WHERE rn > (1 - 1) * 2 AND rn <= 1 * 2
ORDER BY rn ASC;


  SELECT s.no,
         s.name,
         s.address,
         s.phone,
         NVL (AVG (RANK), 0)
    FROM shop s LEFT OUTER JOIN comments c ON s.no = c.shopno
GROUP BY s.no,
         s.name,
         s.address,
         s.phone
ORDER BY s.no;

SELECT s.*, NVL (RANK, 0)
  FROM shop s
       LEFT OUTER JOIN (  SELECT AVG (RANK) AS RANK, SHOPNO
                            FROM comments
                        GROUP BY SHOPNO
                        ORDER BY SHOPNO) c
          ON s.no = c.shopno;

--map range to location

SELECT *
  FROM shop
 WHERE range > SQRT (POWER ( (myx - coodix), 2) + POWER ( (myy - coodiy), 2));