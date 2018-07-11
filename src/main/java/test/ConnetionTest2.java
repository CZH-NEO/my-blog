package test;

import model.Tag;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TagService;

public class ConnetionTest2 {
    public static void main(String[] args) {
//        PropertyConfigurator.configure("classpath:log4j.properties");
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-*.xml");
        Tag tag=new Tag("pricetag");
        TagService service;
        service=new TagService();
        service=(TagService)ac.getBean("tagService");
        service.addTag(tag);
    }
}
