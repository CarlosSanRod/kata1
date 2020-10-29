package com.mycompany.kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Carlos Santana Rodriguez
 */
public class Main {
    
    public static void main(String[] args) {
        
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person person = new Person ("Carlos Santana", date);
        System.out.println("La persona se llama " + person.getName()+ " y tiene " + person.getAge() + " años");
        
    }
    
}
