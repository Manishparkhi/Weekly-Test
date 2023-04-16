package com.WeeklyTest2.Test.Configration;

import com.WeeklyTest2.Test.Studentt.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration

public class Configration {


    @Bean("Manish")
    public Student getData1(){
        return  new Student("Manish","Parkhi");
    }

    @Bean("Prasad")
    @Lazy
    public Student getData2(){
        return  new Student("Prasad","ramteke");
    }
}
