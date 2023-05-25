package com.kodlamaio.paymentservice.business.dto.requests;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePaymentRequest {
    @NotEmpty(message = "Card number is required")
    @Size(min = 16, max = 16, message = "Card number must be 16 charachters long")
    private String cardNumber;
    @NotBlank(message = "card holder is required")
    private String cardHolder;
    @Min(value = 2023, message = "Card expiration year must be at least current year")
    private int cardExpirationYear;
    @Min(value = 1, message = "Card expiration month must be between 1 and 12")
    @Max(value = 12, message = "Card expiration month must be between 1 and 12")
    private int cardExpirationMonth;
    @NotEmpty(message = "Card CVV is required")
    @Size(min = 3, max = 3, message = "Card CVV must be 3 characthers long")
    private String cardCvv;
    @Min(value = 1, message = "Balance must be at least 1")
    private double balance;
}
