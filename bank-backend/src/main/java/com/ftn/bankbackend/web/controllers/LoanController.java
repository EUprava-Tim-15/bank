package com.ftn.bankbackend.web.controllers;

import com.ftn.bankbackend.services.interfaces.ILoanService;
import com.ftn.bankbackend.web.dtos.loans.CalculateLoanRequestDto;
import com.ftn.bankbackend.web.dtos.loans.CalculatedLoanResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "loans")
public class LoanController {

    private final ILoanService loanService;

    @GetMapping("calculate-loan")
    public ResponseEntity<CalculatedLoanResponseDto> calculateLoan(@Valid CalculateLoanRequestDto calculateLoanRequestDto) {

        return new ResponseEntity<>(
                loanService.calculateLoanInquiry(calculateLoanRequestDto),
                HttpStatus.OK);
    }

}
