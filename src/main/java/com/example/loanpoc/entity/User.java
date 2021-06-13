package com.example.loanpoc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String userName;
    private String address;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private Integer createdBy;
    private Integer updatedBy;
    private Integer id;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @OneToMany(mappedBy = "user")
    private Collection<LoanDetails> loanDetails;

    public Collection<LoanDetails> getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(Collection<LoanDetails> loanDetails) {
        this.loanDetails = loanDetails;
    }
}
