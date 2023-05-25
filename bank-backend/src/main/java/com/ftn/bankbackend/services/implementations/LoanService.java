package com.ftn.bankbackend.services.implementations;

import com.ftn.bankbackend.services.interfaces.ILoanService;
import com.ftn.bankbackend.web.dtos.loans.CalculateLoanRequestDto;
import com.ftn.bankbackend.web.dtos.loans.CalculatedLoanResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoanService implements ILoanService {

    private static final double ADMIN_FEE = 0.0295;

    @Override
    public CalculatedLoanResponseDto calculateLoanInquiry(CalculateLoanRequestDto calculateLoanRequestDto) {
        double interestRate = getInterestRate(calculateLoanRequestDto.months);
        double ownedAmount = calculateOwnedAmount(calculateLoanRequestDto.amount, interestRate);
        double monthlyPaymentAmount = calculateMonthlyPayment(ownedAmount, calculateLoanRequestDto.months);

        CalculatedLoanResponseDto calculatedLoanResponse = new CalculatedLoanResponseDto(
                calculateLoanRequestDto.amount,
                calculateLoanRequestDto.months,
                ownedAmount,
                monthlyPaymentAmount,
                interestRate,
                LocalDateTime.now().plusMonths(calculateLoanRequestDto.months)
        );

        return calculatedLoanResponse;
    }

    private double getInterestRate(int months) {
        double interestRate;

        if (months >= 13 && months <= 24) {
            interestRate = 0.0995;
        } else if (months >= 25 && months <= 36) {
            interestRate = 0.1095;
        } else if (months >= 37 && months <= 48) {
            interestRate = 0.1195;
        } else if (months >= 49 && months <= 60) {
            interestRate = 0.1295;
        } else {
            throw new IllegalArgumentException("Invalid loan term!");
        }

        return interestRate;
    }

    private double calculateOwnedAmount(double requestedAmount, double interestRate) {
        double interest = requestedAmount * interestRate;
        double adminFee = requestedAmount * ADMIN_FEE;
        return requestedAmount + interest + adminFee;
    }

    private double calculateMonthlyPayment(double amount, int months) {
        return amount / months;
    }


}
