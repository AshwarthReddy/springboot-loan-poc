package com.example.loanpoc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Collection;

@Entity
public class LoanType {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer loanTypeId;
    private String loanType;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private Integer createdBy;
    private Integer updatedBy;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoanTypeId() {
        return loanTypeId;
    }

    public void setLoanTypeId(Integer loanTypeId) {
        this.loanTypeId = loanTypeId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @OneToMany(mappedBy = "loanType")
    private Collection<LoanDetails> loanDetails;

    public Collection<LoanDetails> getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(Collection<LoanDetails> loanDetails) {
        this.loanDetails = loanDetails;
    }
}
