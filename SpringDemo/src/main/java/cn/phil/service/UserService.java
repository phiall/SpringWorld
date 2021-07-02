package cn.phil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author px
 * @date 2021/3/3 14:59
 */
public class UserService {
    @Autowired
    private ProductService productService;
    public UserService() {
        System.out.println("new UserService()");
    }
    @Transactional(rollbackFor = Exception.class)
    public String getUser(Long id) {
        return "Jack";
    }
}
