package com.example.loanpoc.service.impl;

import com.example.loanpoc.entity.LoanDetails;
import com.example.loanpoc.entity.LoanType;
import com.example.loanpoc.repo.LoanDetailsRepo;
import com.example.loanpoc.repo.LoanTypeRepo;
import com.example.loanpoc.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanDetailsRepo loanDetailsRepo;
    @Autowired
    private LoanTypeRepo loanTypeRepo;

    @Override
    public String applyLoan(LoanDetails loanDetails) {

        Integer loanId = loanDetailsRepo.save(loanDetails).getLoanId();
        return "loan applied successfully, your loan id is :" + loanId;
    }

    @Override
    public List<LoanDetails> getLoanDetails(Integer userId) {
        List<LoanDetails> loanDetails = Optional.ofNullable(loanDetailsRepo.findByUserUserId(userId))
                .orElseThrow(() -> new RuntimeException("loan details are not present , please apply a new loan"));
        return loanDetails;
    }

    @Override
    public String saveLoanType(LoanType loanType) {
        String type = loanTypeRepo.save(loanType).getLoanType();
        return "loan type saved successfully, loanType is :" + type;
    }

    public List<LoanType> getALlLoanTypes(){
        return loanTypeRepo.findAll();
    }
}
