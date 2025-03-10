SELECT
    IT.ITEM_ID
    , II.ITEM_NAME
    , II.RARITY
FROM
    ITEM_INFO II, ITEM_TREE IT
WHERE 1=1
    AND II.ITEM_ID = IT.ITEM_ID
    AND PARENT_ITEM_ID IN (SELECT ITEM_ID FROM ITEM_INFO WHERE RARITY = 'RARE')
ORDER BY
    ITEM_ID DESC