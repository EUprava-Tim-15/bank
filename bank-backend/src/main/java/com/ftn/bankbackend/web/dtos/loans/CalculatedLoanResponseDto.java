package com.ftn.bankbackend.web.dtos.loans;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class CalculatedLoanResponseDto {

    public Double requestedAmount;
    public Integer requestedMonths;
    public Double ownedAmount;
    public Double monthlyPaymentAmount;
    public Double interestRate;
    public LocalDateTime lastLoanPaymentDate;

}
