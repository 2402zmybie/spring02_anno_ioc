package com.hr.service.impl;

import com.hr.dao.IAccountDao;
import com.hr.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
//@Scope("prototype")  //多例的
@Scope("singleton")  //单例的 默认值
public class AccountServiceImpl implements IAccountService {

//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao2")
    private IAccountDao accountDao;

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl创建了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }

    @PostConstruct
    private void init() {
        System.out.println("对象初始化了");
    }

    @PreDestroy
    private void destory() {
        System.out.println("对象销毁了");
    }
}
