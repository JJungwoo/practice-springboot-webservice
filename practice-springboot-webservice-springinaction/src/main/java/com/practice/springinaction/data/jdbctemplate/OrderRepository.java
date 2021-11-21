package com.practice.springinaction.data.jdbctemplate;

import com.practice.springinaction.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
