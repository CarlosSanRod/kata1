package com.mycompany.kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Carlos Santana 
 */

public class Person {

    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    public Person(String name, Calendar birthdate) {
        
        this.name = name;
        this.birthdate = birthdate;

    }
    
    public String getName() {
        return name;
    }
    
    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }

    private int toYears(long days) {
        return (int) (days/365.25);
    }
    
    private long milliSecondsToYear (long milles) {
        return milles / MILLISECONDS_PER_YEAR;
    }
    
    @Override
    public String toString() {
        return "Person{"+"name="+name+", birthdate="+birthdate+"}";
    }
    
}
