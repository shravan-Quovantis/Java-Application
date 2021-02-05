package com.springcore.dependencyInjection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private String address;
}
