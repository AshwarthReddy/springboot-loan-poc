package com.example.loanpoc.repo;

import com.example.loanpoc.entity.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanTypeRepo extends JpaRepository<LoanType, Integer> {
}
