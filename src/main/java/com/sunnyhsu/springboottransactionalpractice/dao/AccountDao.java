package com.sunnyhsu.springboottransactionalpractice.dao;

public interface AccountDao {
    void addmoney(Integer id, Integer money);

    void deductMoney(Integer id, Integer money);
}
