package com.practice.springinaction.data;

import com.practice.springinaction.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
