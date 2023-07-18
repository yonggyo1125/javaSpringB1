package members;

public class JoinService {

    private JoinValidator joinValidator;

    public JoinService(JoinValidator joinValidator) {
        this.joinValidator = joinValidator;
    }

    public void join(Users user) {

        joinValidator.check(user);




    }
}
