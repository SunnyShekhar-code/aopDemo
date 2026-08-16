package in.strikes.aopDemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {

    @Pointcut("within(in.strikes.aopDemo.controller..*)")
    public void controllerLayer(){

    } 
    
    @Pointcut("within(in.strikes.aopDemo.service..*)")
    public void serviceLayer(){

    }

    @Pointcut("execution(public * *(..))")
    public void publicMethod(){

    }


    @Pointcut("serviceLayer() && publicMethod()")
    public void publicServiceMethod(){

    }




    
}
