package com.mycompany.kata1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        
        Person person = new Person ("Carlos Santana", LocalDate.of(2000, Month.MARCH, 21));
        System.out.println("La persona se llama " + person.getName()+ " y tiene " + person.getAge() + " años");
        
    }
    
}
