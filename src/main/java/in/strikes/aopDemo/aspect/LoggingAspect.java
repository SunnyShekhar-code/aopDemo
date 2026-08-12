package in.strikes.aopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import in.strikes.aopDemo.dto.Student;

@Component
@Aspect
public class LoggingAspect {

    // @Before("execution(String in.strikes.aopDemo.service.StudentService.createStudent())")
    // public void logBeforeMethod(JoinPoint joinPoint){
    //     Object [] arr=joinPoint.getArgs();
    //     System.out.println("Student creation is going to happen");



    //     try{
    //         throw new RuntimeException("runtime exception occur in aspect class");
    //     }catch (Exception e) {
    //         // TODO: handle exception
    //     }
// }
        


    // @AfterReturning(value= "execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))", returning ="result")
    // public void  logAfterReturningMethod( Student result){

    //     result.setName("Aditya");
    //     result.setAge(21);

        
    //     System.out.println("Returned target : "+ result.toString());

         
    // }

    // @AfterThrowing(value="execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))", throwing="exception")
    // public void logAfterThrowingMethod(Throwable exception){
    //     System.out.println(exception.getClass().getName()+" message :"+exception.getMessage());
    //     System.out.println("log from AfterThrowing");
        
    // }

    @After(value="execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))")
    public void logAfterMethod(JoinPoint joinPoint){
        System.out.println("log from After");
        
    }


}
