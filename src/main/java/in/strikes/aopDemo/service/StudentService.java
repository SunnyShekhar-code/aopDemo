package in.strikes.aopDemo.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonKey;

import in.strikes.aopDemo.dto.Student;

@Service
public class StudentService {

    public Student createStudent(Student student){
        String s="Student Saved";
        System.out.println(s);
        // throw new RuntimeException("Execution failed");
        return student;
    }

    public String dummyMethod(String s){
        System.out.println("dummy method called");
        return s;
    }
    
}
