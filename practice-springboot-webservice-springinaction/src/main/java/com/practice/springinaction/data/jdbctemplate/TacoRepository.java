package com.practice.springinaction.data.jdbctemplate;

import com.practice.springinaction.domain.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
