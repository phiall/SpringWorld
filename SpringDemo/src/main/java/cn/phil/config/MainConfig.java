package cn.phil.config;

import cn.phil.aspect.LogAspect;
import cn.phil.service.Calculate;
import cn.phil.service.ProductService;
import cn.phil.service.UserService;
import cn.phil.service.impl.SimpleCalculate;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author px
 * @date 2021/3/3 14:50
 */
@Configuration
@EnableTransactionManagement
public class MainConfig implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, BeanDefinitionRegistryPostProcessor,
        BeanFactoryPostProcessor, BeanPostProcessor, InitializingBean {
    @Bean
    public UserService userService() {
        return new UserService();
    }
    @Bean
    public ProductService productService() {
        return new ProductService();
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("set bean name");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("set bean factory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("set application context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("当前Bean定义总数" + configurableListableBeanFactory.getBeanDefinitionCount());
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("bean definition post process");
    }
}
