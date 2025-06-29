package com.codewithmosh.store.carts;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateItemRequest {
    @NotNull(message = "Quantity must be provided.")
    @Min(message = "Quantity must be greater than zero.", value = 1)
    @Max(message = "Quantity must be less than or equal to 100.", value = 100)
    private Integer quantity;
}
