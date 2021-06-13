package com.example.loanpoc.service;

import com.example.loanpoc.entity.LoanDetails;
import com.example.loanpoc.entity.LoanType;

import java.util.List;

public interface LoanService {
    String applyLoan(LoanDetails loanDetails);

    List<LoanDetails> getLoanDetails(Integer userId);

    String saveLoanType(LoanType loanType);

    public List<LoanType> getALlLoanTypes();
}
