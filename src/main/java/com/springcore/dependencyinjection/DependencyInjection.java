package com.springcore.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class DependencyInjection {
    public static void main(final String[] args) {

        //Using the IOC created objects
        final ApplicationContext context = new ClassPathXmlApplicationContext("configDependencyInjection.xml");
        final Student studentA = (Student) context.getBean("StudentA");
        System.out.println(studentA.getAddress());

        final Student studentB = (Student) context.getBean("StudentB");
        System.out.println(studentB);

        //Another way
        final Resource r=new ClassPathResource("configDependencyInjection.xml");
        final BeanFactory factory= new XmlBeanFactory(r);
        final Student studentA1=(Student) factory.getBean("StudentA");
        System.out.println(studentA1.toString());
    }
}
