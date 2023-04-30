package com.kodlamaio.inventoryservice.business.dto.requests.create;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequest {
    @NotNull
    @NotBlank
    private UUID modelId;
    @Min(value = 2000)
    // TODO: NotFuture custom annotation
    private int modelYear;
    @NotNull
    @NotBlank
    // TODO: Add Regex
    private String plate;
    @Min(value = 1)
    private double dailyPrice;
}
