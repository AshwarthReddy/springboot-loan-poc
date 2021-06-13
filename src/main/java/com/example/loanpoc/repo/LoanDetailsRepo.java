package com.example.loanpoc.repo;

import com.example.loanpoc.entity.LoanDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanDetailsRepo  extends JpaRepository<LoanDetails, Integer> {
    List<LoanDetails> findByUserUserId(Integer userId);
}
