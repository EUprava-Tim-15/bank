package com.ftn.bankbackend.web.dtos.loans;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalculateLoanRequestDto {
    @Min(value = 1, message = "Loan amount must be >= 1")
    public Double amount;
    @Min(value = 1, message = "Loan request duration must be >= 1 month")
    public int months;

}
