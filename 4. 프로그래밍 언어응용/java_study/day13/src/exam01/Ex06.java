package exam01;

public class Ex06 {
    public static void main(String[] args) {
        LoginService service1 = LoginService.getInstance();
        LoginService service2 = LoginService.getInstance();
        System.out.println(service1 == service2);
    }
}
