package in.strikes.aopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import in.strikes.aopDemo.dto.Student;

@Component
@Aspect
public class LoggingAspect {


    // @Before("execution(* in.strikes.aopDemo.service.*.*(..))")
    // public void logBeforeMethod(){
    //     System.out.println("Method intercepetd");
    // }


    // @Before("execution(* *.*(..)) && within(in.strikes.aopDemo.service.StudentService)")
    // public void logBeforeMethod(){
    //     System.out.println("Method intercepetd");
    // }

    

    // @Before("within(in.strikes.aopDemo.service.StudentService)")
    // public void logBeforeMethod(){
    //     System.out.println("Method intercepetd");
    // }


    // @Before("@annotation(com.fasterxml.jackson.annotation.JsonKey)")
    // public void logBeforeMethod(){
    //     System.out.println("Method intercepetd");
    // }

    // @Before("execution(in.strikes.aopDemo.dto.Student in.strikes.aopDemo.service.StudentService.createStudent(in.strikes.aopDemo.dto.Student))")
    // public void logBeforeMethod2(){
    //     System.out.println("Method intercepetd");
    // }

    @Pointcut("execution(* in.strikes.aopDemo.controller.*.*(..))")
    public void controllerLayer(){

    } 

    @Pointcut("execution(* in.strikes.aopDemo.service.*.*(..))")
    public void serviceLayer(){

    } 

    @Pointcut("within(in.strikes.aopDemo.service..*) && execution(* *(..))")
    public void logPublicServiceMethod(){

    }

    @Before("logPublicServiceMethod()")
    public void logBeforeMethod(){
        System.out.println("Method Intercepted");
    }

    // @Around("controllerLayer()")
    // public Object logaround(ProceedingJoinPoint jointpoint)throws Throwable{
    //     System.out.println("Method intercepted before service");
    //     try{
    //         return jointpoint.proceed();
    //     }catch(Exception e){

    //     }
    //     return null;

    // }









    // pointcut--> deginator returnType Method/classPath Arguments Exception

    // wildcard --> multiple method and having method of different arguments && 
    // class and different package and it's package using exection and withiin deginator

    // deginator--> execution , within, annotation, bean


    

    // @Around(value="execution(* in.strikes.aopDemo.service.StudentService.dummyMethod(..))")
    // public String logAfterMethod(ProceedingJoinPoint joinPoint)throws Throwable{

    //     try{
    //         Object []arr=joinPoint.getArgs();
    //         String originalarg=(String)arr[0];

    //         String modifiedarg=originalarg.toUpperCase();

    //         Object [] finalarg={
    //             modifiedarg
    //         };

    //         System.out.println("target method called 1-------");
    //         String result1=(String)joinPoint.proceed(finalarg);

    //         System.out.println("target method called 2-------");
    //         String result2=(String)joinPoint.proceed(finalarg);
           
            
    //         return result2;

    //     }catch(Exception e){
    //         System.out.println("Exception occured :"+e.getMessage());
    //         throw new RuntimeException("Exception thrown");
    //     }finally{
    //         System.out.println("Execution Completed Successfully");
    //     }

    }
