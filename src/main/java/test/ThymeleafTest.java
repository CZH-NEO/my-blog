package test;

import model.Tag;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import service.TagService;

public class ThymeleafTest {
    public static void main(String[] args) {
//        PropertyConfigurator.configure("classpath:log4j.properties");
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-*.xml");
        SpringResourceTemplateResolver srtr;

        srtr=(SpringResourceTemplateResolver)ac.getBean("templateResolver");

        System.out.println(srtr.getTemplateMode());
        System.out.println(srtr);
    }
}
