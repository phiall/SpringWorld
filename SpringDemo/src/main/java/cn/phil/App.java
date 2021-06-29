package cn.phil;

import cn.phil.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author phil
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(context.getBean("userService"));
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        System.out.println(context.getBean("orderService"));
    }
}
