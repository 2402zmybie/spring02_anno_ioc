package com.hr.dao.impl;

import com.hr.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {



    public void saveAccount() {
        System.out.println("AccountDao保存了账户11111111111111");
    }
}
