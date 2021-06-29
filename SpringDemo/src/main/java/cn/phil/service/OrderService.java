package cn.phil.service;

import cn.phil.entity.Order;

/**
 * @author px
 * @date 2021/3/3 15:21
 */
public class OrderService {
    public OrderService() {
        System.out.println("new OrderService()");
    }
    public Order getOrder(Long id) {
        return new Order(1L, "20210303001", 100L);
    }
}
