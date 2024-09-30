-- 코드를 입력하세요
SELECT
    A.ANIMAL_ID
    , A.NAME
FROM(
    SELECT
        A.ANIMAL_ID
        , A.NAME
    FROM 
        ANIMAL_INS A
        INNER JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
    ORDER BY
        TRUNC(B.DATETIME) - TRUNC(A.DATETIME) DESC
    ) A
WHERE 
    ROWNUM <=2

    