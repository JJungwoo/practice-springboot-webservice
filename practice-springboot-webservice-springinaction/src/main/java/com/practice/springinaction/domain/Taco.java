package com.practice.springinaction.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;
    private Date createdAt;

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    // 책에는 NotNull 체크가 없는데 ingredients 리스트가 null 일 때 즉, 한개도 체크가 안되었을 때 valid 처리가 안된다.. 추가 필요.
    @NotNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
