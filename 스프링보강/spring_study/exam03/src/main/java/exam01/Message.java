package exam01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {
    public void send(String name) {
        System.out.printf("%s님에게 메세지 전송..%n", name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 스프링 컨테이너 초기화 단계에서 호출
        System.out.println("afterPropertiesSet!");
    }

    @Override
    public void destroy() throws Exception {
        // 스프링 컨테이너 객체를 소멸 하기전에 호출
        System.out.println("destroy!");
    }
}
