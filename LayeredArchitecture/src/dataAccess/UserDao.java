package dataAccess;

import java.util.List;
import entities.User;

public interface UserDao {
	
    void add(User user);
    void delete(int id);
    void update(User user);
    List<User> getAll();
    User getById(int id);
}

