import React, {useState} from "react";
import {CalculateLoanRequestDto} from "../models/loan/CalculateLoanRequestDto";
import LoanForm from "../components/LoanForm";

const Loan = () => {
    const [loan, setLoan] = useState<CalculateLoanRequestDto>(
        {
            amount: 100, months: 15
        }
    );

    const [showForm, setShowForm] = useState<boolean>(true);

    return(
        <LoanForm showForm={true} message={"Hello World"}/>
    );
}


export default Loan;
