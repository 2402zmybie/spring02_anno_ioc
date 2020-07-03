package com.hr;

import com.hr.dao.IAccountDao;
import com.hr.service.IAccountService;
import com.hr.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = (IAccountService) applicationContext.getBean("accountServiceImpl");
//        as.saveAccount();
//        System.out.println(as);

        applicationContext.close();


    }
}
