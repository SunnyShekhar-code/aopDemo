package in.strikes.aopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(String in.strikes.aopDemo.service.StudentService.createStudent())")
    public void logBeforeMethod(JoinPoint joinPoint){

        Object [] arr=joinPoint.getArgs();
        System.out.println("Student creation is going to happen"+" "+arr[0]);

        // try{
        //     throw new RuntimeException("runtime exception occur in aspect class");
        // }catch (Exception e) {
        //     // TODO: handle exception
        // }
        
    }
    
}
