export interface CalculatedLoanResponseDto {
    requestedAmount: number;
    requestedMonths: number;
    ownedAmount: number;
    monthlyPaymentAmount: number;
    interestRate: number;
    lastLoanPaymentDate: string;
}