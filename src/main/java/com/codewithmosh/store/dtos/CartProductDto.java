package com.codewithmosh.store.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class CartProductDto {
    private Long id;
    private String name;
    private BigDecimal price;

}
