package cn.phil.service.impl;

import cn.phil.service.Calculate;
import org.springframework.aop.framework.AopContext;

/**
 * @author phil
 * @date 2021/7/2 10:24
 */
public class SimpleCalculate implements Calculate {
    @Override
    public int add(int numA, int numB) {
        ((Calculate)AopContext.currentProxy()).reduce(numA, numB);
        return numA + numB;
    }

    @Override
    public int reduce(int numA, int numB) {
        return numA - numB;
    }

    @Override
    public int div(int numA, int numB) {
        return numA / numB;
    }

    @Override
    public int multi(int numA, int numB) {
        return numA * numB;
    }
}
