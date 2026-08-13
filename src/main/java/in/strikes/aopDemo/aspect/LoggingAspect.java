package in.strikes.aopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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

    // @After(value="execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))")
    // public void logAfterMethod(JoinPoint joinPoint){
    //     System.out.println("log from After");
        
    // }

    // @Around(value="execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))")
    // public Student logAfterMethod(ProceedingJoinPoint joinPoint)throws Throwable{

    //     try{
    //         System.out.println("Started execution"+" "+joinPoint.getSignature().getName());
    //         Student result=(Student)joinPoint.proceed();
    //         System.out.println("finished execution"+" "+joinPoint.getSignature().getName());
    //         result.setName(result.getName().toUpperCase());
            
    //         return result;

    //     }catch(Exception e){
    //         System.out.println("Exception occured :"+e.getMessage());
    //         // return null;
    //         throw new RuntimeException("Exception thrown");
    //     }finally{
    //         System.out.println("Execution Completed Successfully");
    //     }

    // }

    @Around(value="execution(* in.strikes.aopDemo.service.StudentService.dummyMethod(..))")
    public String logAfterMethod(ProceedingJoinPoint joinPoint)throws Throwable{

        try{
            Object []arr=joinPoint.getArgs();
            String originalarg=(String)arr[0];

            String modifiedarg=originalarg.toUpperCase();

            Object [] finalarg={
                modifiedarg
            };

            System.out.println("target method called 1-------");
            String result1=(String)joinPoint.proceed(finalarg);

            System.out.println("target method called 2-------");
            String result2=(String)joinPoint.proceed(finalarg);
           
            
            return result2;

        }catch(Exception e){
            System.out.println("Exception occured :"+e.getMessage());
            throw new RuntimeException("Exception thrown");
        }finally{
            System.out.println("Execution Completed Successfully");
        }

    }


}
