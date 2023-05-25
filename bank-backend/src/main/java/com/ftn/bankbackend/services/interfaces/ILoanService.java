package com.ftn.bankbackend.services.interfaces;

import com.ftn.bankbackend.web.dtos.loans.CalculateLoanRequestDto;
import com.ftn.bankbackend.web.dtos.loans.CalculatedLoanResponseDto;

public interface ILoanService {

    CalculatedLoanResponseDto calculateLoanInquiry(CalculateLoanRequestDto calculateLoanRequestDto);

}
