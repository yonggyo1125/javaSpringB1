package exam03;

public class LoginService {
    private static LoginService instance;

    private LoginService() {}

    public static LoginService getInstance() {
        if (instance == null) {
            instance = new LoginService();
        }

        return instance;
    }
}
