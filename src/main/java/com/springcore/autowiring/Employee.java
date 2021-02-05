package com.springcore.autowiring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Employee {
    private Address address;


    public Employee(final Address address) {
        System.out.println("Setting Values through Constructor");
        this.address = address;
    }

    public void setAddress(final Address address) {
        System.out.println("Setting values through Setter");
        this.address = address;
    }
}
