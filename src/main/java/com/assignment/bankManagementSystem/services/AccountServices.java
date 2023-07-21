package com.assignment.bankManagementSystem.services;

import com.assignment.bankManagementSystem.dto.AccountWriteDto;
import com.assignment.bankManagementSystem.entities.Accounts;

import javax.validation.Valid;
import java.util.List;

public interface AccountServices {



    AccountWriteDto openAccount(@Valid AccountWriteDto accountWriteDto);

    public Accounts getAccountByAccountNumber(String accountNumber);
    public Accounts deposit(String accountID,double depositAmount);
    public Accounts withdraw(String accountID,double withdrawAmount);
    public Double balanceEnquiry(String accountID);
    public void deleteAccount(String accountID);

    List<Accounts> getAccountsByUserId(int userId);
    //List<Accounts> getAccountsByUserId(int user_id);
}
