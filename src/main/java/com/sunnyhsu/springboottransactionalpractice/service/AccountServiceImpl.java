package com.sunnyhsu.springboottransactionalpractice.service;

import com.sunnyhsu.springboottransactionalpractice.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    @Override
    public void transfer(Integer fromAccountId, Integer toAccountId, Integer amount) {
        accountDao.deductMoney(fromAccountId, amount);

        accountDao.addmoney(toAccountId, amount);
    }
}

