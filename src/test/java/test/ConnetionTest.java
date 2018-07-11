package test;

import model.Article;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ArticleService;

import java.util.Date;

public class ConnetionTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-*.xml");
//        Article article=new Article("hello",false,false,false,0,
//                0,new Date(0),"<p>");
//        System.out.println(article);
//         ArticleService service;
////         service=new ArticleService();
//        service=(ArticleService)ac.getBean("articleService");


//        service.addArticle(article);
    }
}
