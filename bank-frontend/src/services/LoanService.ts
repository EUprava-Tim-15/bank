import axios from 'axios';
import { CalculateLoanRequestDto} from "../models/loan/CalculateLoanRequestDto";
import { CalculatedLoanResponseDto } from "../models/loan/CalculatedLoanResponseDto";

const BASE_SERVICE_URL = `${process.env.REACT_APP_EUPRAVA_BACKEND_SERVER}/loans`;

export const calculateLoan = async (request: CalculateLoanRequestDto): Promise<CalculatedLoanResponseDto> => {
    const response = await axios.get<CalculatedLoanResponseDto>(`${BASE_SERVICE_URL}/calculate-loan`, {
        params: request,
    });
    return response.data;
};