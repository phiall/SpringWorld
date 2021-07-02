package cn.phil.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author phil
 * @date 2021/7/1 18:21
 */
public class ProductService {
    @Autowired
    private UserService userService;
    public String getProduct(String name) {
        return "product name :" + name;
    }
}
