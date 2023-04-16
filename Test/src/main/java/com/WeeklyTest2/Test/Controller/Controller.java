package com.WeeklyTest2.Test.Controller;

import com.WeeklyTest2.Test.Studentt.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class Controller {
    @Autowired
    @Qualifier("Manish")
    private Student student;

    @GetMapping("/student")
    public Student getData(){
        return student;
    }
}
