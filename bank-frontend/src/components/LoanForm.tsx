import React, {HTMLProps, useState} from 'react';
import { CalculateLoanRequestDto} from "../models/loan/CalculateLoanRequestDto";
import { calculateLoan } from '../services/LoanService';

type LoanFormProps = {
    showForm: boolean,
    message: string
}

const LoanForm = ({showForm, message = "Default Message"} : LoanFormProps) => {
    if(showForm) {
        return (
            <form className='input'>
                <label htmlFor='requested-amount' >Amount</label>
                <input id='requested-amount' type='number' placeholder='test amount' min='100' step="100" />
                <br/>

                <label htmlFor='requested-months' >Duration (Months)</label>
                <input name='requested-months' type='number' placeholder='test month' min='13' max='60' step="1" />
                <br/>

                <label htmlFor='participation' >Participation</label>
                <input id='participation' type='number' placeholder='test amount' min='0' step="100" />
                <br/>
            </form>
        )
    }
    return (null);
}



export default LoanForm;