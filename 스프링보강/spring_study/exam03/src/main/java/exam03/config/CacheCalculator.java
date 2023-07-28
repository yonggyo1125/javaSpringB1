package exam03.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class CacheCalculator {

    private Map<Long,Object> cache = new HashMap<>();

    @Pointcut("execution(* exam03.aopex..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();
        Long num = (Long)args[0];
        if (cache.containsKey(num)) { // 캐시에 num으로 계산된 결과가 이미 있는 경우
            System.out.println("캐시된 값 사용!");
            return cache.get(num);
        }

        Object result = joinPoint.proceed(); // factorial 프록시
        cache.put(num, result);
        System.out.println("캐시값 저장!");

        return result;
    }
}
