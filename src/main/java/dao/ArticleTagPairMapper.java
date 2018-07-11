package dao;

import model.ArticleTagPairKey;

public interface ArticleTagPairMapper {
    int deleteByPrimaryKey(ArticleTagPairKey key);

    int insert(ArticleTagPairKey record);

    int insertSelective(ArticleTagPairKey record);
}