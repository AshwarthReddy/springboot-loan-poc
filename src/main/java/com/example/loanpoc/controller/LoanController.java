package com.example.loanpoc.controller;

import com.example.loanpoc.entity.LoanDetails;
import com.example.loanpoc.entity.LoanType;
import com.example.loanpoc.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;


    @PostMapping
    private ResponseEntity<String> applyLoan(@RequestBody LoanDetails loanDetails){
        String response = loanService.applyLoan(loanDetails);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<LoanDetails>> getLoanDetails(@PathVariable Integer userId){
        List<LoanDetails> response = loanService.getLoanDetails(userId);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/loanType")
    public ResponseEntity<String> createLoanType(@RequestBody LoanType loanType){
       String response = loanService.saveLoanType(loanType);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("loanTypes")
    public ResponseEntity<List<LoanType>> loanTypes(){
        return ResponseEntity.ok().body(loanService.getALlLoanTypes());
    }


}
