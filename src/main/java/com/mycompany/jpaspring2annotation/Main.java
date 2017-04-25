/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpaspring2annotation;


import com.mycompany.jpaspring2annotation.entities.ContactsInfo;
import com.mycompany.jpaspring2annotation.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.hibernate.engine.jndi.JndiNameException;

/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {
        try {
            ApplicationContext app = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
            System.out.println("file read successfully ");
            DaoCrud dao =  (DaoCrud) app.getBean("crud");
            System.out.println("" + dao.addUser(new User("shibooodsd;ls;dslooooooooo", "dskdsl", "dsjds", "dsdksl")));
            System.out.println("success");
        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
