package ie.gmit.single;

public class UserPersistanceService {
    private Store store = new Store();

    public void saveUser(User user)
    {
        store.store(user);
    }
}
