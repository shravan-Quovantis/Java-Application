//package com.springcore.autowiring;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//
//public class AutoWiring {
//    public static void main(final String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("configAutoWiring.xml");
//        Employee employee =  (Employee) context.getBean("empA");
//        System.out.println(employee);
//
//        Resource r=new ClassPathResource("configAutoWiring.xml");
//        BeanFactory factory= new XmlBeanFactory(r);
//        Employee employeeA=(Employee) factory.getBean("empA");
//        System.out.println(employeeA.toString());
//    }
//}
