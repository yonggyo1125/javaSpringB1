package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class ProxyCalculator {

    @Pointcut("execution(* exam02.aopex..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        /** 메서드 정보 */
        /*
        Signature sig = joinPoint.getSignature();
        System.out.println("호출한 메서드 정보 : " + sig.toLongString());
        */
        /** 매개변수로 사용된 값 */
        /*
        Object[] args = joinPoint.getArgs();
        long num = (Long)args[0];
        System.out.println("num=" + num);
        */
        long stime = System.nanoTime(); // 공통 기능(추가)
        try {
            Object result = joinPoint.proceed(); // factorial 핵심 기능 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 기능(추가)
            System.out.println("걸린시간 : " + (etime - stime));
        }
    }
}
