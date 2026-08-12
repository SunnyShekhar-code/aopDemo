package in.strikes.aopDemo.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String createStudent(){
        String s="Student Created Successfully";
        System.out.println(s);
        // throw new RuntimeException("runtime exception occur in StudentService classs");
        return s;
    }
    
}
