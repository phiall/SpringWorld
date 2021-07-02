package cn.phil;

import cn.phil.config.AspectConfig;
import cn.phil.config.MainConfig;
import cn.phil.service.Calculate;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.framework.AopContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author phil
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, AspectConfig.class);

        System.out.println(context.getBean("userService"));
        Calculate calculate = (Calculate) context.getBean("calculate");
        System.out.println(calculate.add(1, 2));
        System.out.println(calculate.multi(1, 0));
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean("orderService"));
    }
}
