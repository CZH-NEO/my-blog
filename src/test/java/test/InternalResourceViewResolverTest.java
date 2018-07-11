package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class InternalResourceViewResolverTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-*.xml");
        InternalResourceViewResolver internalResourceViewResolver=
                (InternalResourceViewResolver)ac.getBean("internalResourceViewResolver");
        System.out.println(internalResourceViewResolver.toString());
    }
}
