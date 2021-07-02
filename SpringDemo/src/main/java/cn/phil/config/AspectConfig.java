package cn.phil.config;

import cn.phil.aspect.LogAspect;
import cn.phil.service.Calculate;
import cn.phil.service.impl.SimpleCalculate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author phil
 * @date 2021/7/2 10:56
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class AspectConfig {
    @Bean
    public Calculate calculate() {
        return new SimpleCalculate();
    }
    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
