package aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* services.HelloService.hello(..))")
    public void before(){
        System.out.println("Before Hello Aspect !!");
    }

    @After("execution(* services.HelloService.hello(..))")
    public void after(){
        System.out.println("After Hello Aspect !!");
    }

    @AfterReturning("execution(* services.HelloService.hello(..))")
    public void afterReturning(){
        System.out.println("After Returning Hello Aspect !!");
    }

    @AfterThrowing("execution(* services.HelloService.hello(..))")
    public void afterThrowing(){
        System.out.println("After Throwing Hello Aspect !!");
    }
}
