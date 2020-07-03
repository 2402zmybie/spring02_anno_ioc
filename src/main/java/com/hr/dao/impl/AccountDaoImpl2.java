package com.hr.dao.impl;

import com.hr.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {

    public void saveAccount() {
        System.out.println("AccountDao保存了账户2222222222222");
    }
}
