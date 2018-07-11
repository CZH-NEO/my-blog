package service;


import dao.ArticleTagPairMapper;
import model.ArticleTagPair;
import model.ArticleTagPairKey;

public class ArticleTagPairService {
    private ArticleTagPairMapper dao;

    public void setDao(ArticleTagPairMapper dao) {
        this.dao = dao;
    }

    public void addArticleTagPair(ArticleTagPairKey pairKey)
    {
        dao.insert(pairKey);
    }
    public void deleteArticleTagPair(ArticleTagPairKey pairKey)
    {
        dao.deleteByPrimaryKey(pairKey);
    }
}
