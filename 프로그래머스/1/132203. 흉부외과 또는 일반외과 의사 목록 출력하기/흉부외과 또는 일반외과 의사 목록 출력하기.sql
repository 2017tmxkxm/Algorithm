-- 코드를 입력하세요
SELECT
    DR_NAME
    , DR_ID
    , MCDP_CD
    , DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM 
    DOCTOR
WHERE 
    MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY 
    -- 고용일자 내림차순 -> 고용일자 같다면 이름 기준 오름차순
    HIRE_YMD DESC, DR_NAME ASC