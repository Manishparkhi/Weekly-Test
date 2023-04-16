package com.WeeklyTest2.Test.Studentt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    private String firstNAme;
    private String lastName;
}
