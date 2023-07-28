package exam03.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.Arrays;


@Aspect
@Order(1)
public class ProxyCalculator {
    /*
    @Pointcut("execution(* exam03.aopex..*(..))")
    public void publicTarget() {}
    */

    //@Around("publicTarget()")
    @Around("exam03.aopex.CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        // proceed() // 핵심 기능 수행

        long stime = System.nanoTime(); // 공통 추가 기능

        try {
            /*
            Signature sig = joinPoint.getSignature();
            System.out.println(sig.toLongString());

            Object target = joinPoint.getTarget();
            System.out.println(target);

            Object[] args = joinPoint.getArgs();
            System.out.println(Arrays.toString(args));
            */
            Object result = joinPoint.proceed(); // factorial(..); // 핵심 기능 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 추가 기능
            System.out.println("걸린시간 : " + (etime - stime));
        }
    }
}
