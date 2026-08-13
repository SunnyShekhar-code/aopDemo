package in.strikes.aopDemo.service;

import org.springframework.stereotype.Service;

import in.strikes.aopDemo.dto.Student;

@Service
public class StudentService {

    public Student createStudent(Student student){
        String s="Saved Student";
        System.out.println(s);
        throw new RuntimeException("Execution failed");
        // return student;
    }
    
}
