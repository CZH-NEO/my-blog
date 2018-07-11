package service;

import dao.ArticleMapper;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articeService")
public class ArticleService {
    @Autowired
    @Qualifier("articleMapper")
    private ArticleMapper dao;

    public void setDao(ArticleMapper dao) {
        this.dao = dao;
    }
    public void addArticle(Article article)
    {
        dao.insert(article);
    }
    public void deleteArticleById(Integer id)
    {
        dao.deleteByPrimaryKey(id);
    }
    public void selectArticleById(Integer id)
    {
        dao.selectByPrimaryKey(id);
    }
    public void updateArticle(Article article)
    {
        dao.updateByPrimaryKeyWithBLOBs(article);
    }
    public List<Article> selectAllArticle()
    {
        return dao.selectAllArticle();
    }
}
