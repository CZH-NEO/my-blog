package test;

import model.Tag;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TagService;

public class ConnetionTest2 {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-*.xml");
            Tag tag=new Tag("pricetag");

//        System.out.println(article);
         TagService service;
         service=new TagService();
//        service=(ArticleService)ac.getBean("articleService");
        service=(TagService)ac.getBean("tagService");

        service.addTag(tag);
    }
}
