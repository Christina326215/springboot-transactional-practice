package com.sunnyhsu.springboottransactionalpractice.service;

public interface AccountService {

    void transfer(Integer fromAccountId, Integer toAccountId, Integer amount);
}

