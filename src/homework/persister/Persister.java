package homework.persister;

import homework.User;

public class Persister implements Persisterable{

    @Override
    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
