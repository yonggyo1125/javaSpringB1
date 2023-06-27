package exam04;

public class JoinService {

    private static JoinService instance;

    private JoinService() {}

    public static JoinService getInstance() {
        if (instance == null) {
            instance = new JoinService();
        }

        return instance;
    }
}
