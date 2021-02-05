package com.springcore.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AutoWiring {
    public static void main(final String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("configAutoWiring.xml");
        final Employee employee =  (Employee) context.getBean("empA");
        System.out.println(employee);

        final Resource r=new ClassPathResource("configAutoWiring.xml");
        final BeanFactory factory= new XmlBeanFactory(r);
        final Employee employeeA=(Employee) factory.getBean("empA");
        System.out.println(employeeA.toString());
    }
}
