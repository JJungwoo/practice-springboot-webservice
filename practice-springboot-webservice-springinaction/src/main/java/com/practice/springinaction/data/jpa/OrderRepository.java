package com.practice.springinaction.data.jpa;

import com.practice.springinaction.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
