package in.strikes.aopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

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
        


    @AfterReturning(value= "execution(String in.strikes.aopDemo.service.StudentService.createStudent())", returning ="result")
    public String  logAfterReturningMethod(String result){

        
        System.out.println("Returned target : "+ result);

        return "Aditya Saved";

         
    }

    // @AfterThrowing("execution(String in.strikes.aopDemo.service.StudentService.createStudent())")
    // public void logAfterThrowingMethod(JoinPoint joinPoint){
        
    //     System.out.println("log from AfterThrowing");
        
    // }

    // @After("execution(String in.strikes.aopDemo.service.StudentService.createStudent())")
    // public void logAfterMethod(JoinPoint joinPoint){
    //     System.out.println("log from After");
        
    // }


}
