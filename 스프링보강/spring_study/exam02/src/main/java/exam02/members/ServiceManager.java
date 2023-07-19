package exam02.members;

public class ServiceManager {

    private static ServiceManager instance;

    private ServiceManager() {}

    public static ServiceManager getInstance() {
        if (instance == null) {
            instance = new ServiceManager();
        }

        return instance;
    }

    public UserDao userDao() {
        //return new UserDao();
        return new CachedUserDao();
    }

    public JoinService joinService() {
        return new JoinService(userDao());
    }

    public ListService listService() {
        ListService listService = new ListService();
        listService.setUserDao(userDao());

        return listService;
    }
}
