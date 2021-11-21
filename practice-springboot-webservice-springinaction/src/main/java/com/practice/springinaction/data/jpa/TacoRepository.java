package com.practice.springinaction.data.jpa;

import com.practice.springinaction.domain.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
