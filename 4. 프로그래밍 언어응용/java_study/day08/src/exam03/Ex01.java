package exam03;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
       // try {
            service.login("user02", "1234");

        //} catch (UserIdIncorrectException | UserPwIncorrectException e) {
         //   System.out.println(e.getMessage());
        //}
    }
}
