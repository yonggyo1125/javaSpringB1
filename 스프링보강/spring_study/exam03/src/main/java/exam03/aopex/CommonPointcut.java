package exam03.aopex;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {

    @Pointcut("execution(* exam03.aopex..*(..))")
    public void publicTarget() {}
}
