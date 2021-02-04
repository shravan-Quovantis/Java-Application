//package com.springcore.dependencyInjection;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.*;
//
//public class DependencyInjection {
//    public static void main(final String[] args) {
//
//        //Using the IOC created objects
//        ApplicationContext context = new ClassPathXmlApplicationContext("configDependencyInjection.xml");
//        Student studentA = (Student) context.getBean("StudentA");
//        System.out.println(studentA.getAddress());
//
//        Student studentB = (Student) context.getBean("StudentB");
//        System.out.println(studentB);
//
////        //Another way
////        Resource r=new ClassPathResource("configDependencyInjection.xml");
////        BeanFactory factory= new XmlBeanFactory(r);
////        Student studentA1=(Student) factory.getBean("StudentA");
////        System.out.println(studentA1.toString());
//    }
//}
