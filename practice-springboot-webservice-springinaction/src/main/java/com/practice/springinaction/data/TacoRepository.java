package com.practice.springinaction.data;

import com.practice.springinaction.domain.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
