-- 코드를 입력하세요
SELECT
    BOARD_ID
    , WRITER_ID
    , TITLE
    , PRICE
    , DECODE(STATUS, 'SALE', '판매중', 'RESERVED', '예약중', '거래완료') AS STATUS
FROM    
    USED_GOODS_BOARD 
WHERE
    TO_CHAR(CREATED_DATE, 'YYYYMMDD') = '20221005'
ORDER BY
    BOARD_ID DESC