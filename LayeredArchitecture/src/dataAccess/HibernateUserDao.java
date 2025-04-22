package dataAccess;

import java.util.ArrayList;
import java.util.List;
import entities.User;

public class HibernateUserDao implements UserDao {
	private List<User> users = new ArrayList<>();
    @Override
    public void add(User user) {
        System.out.println("Hibernate ile kullanıcı eklendi: " + users.add(user));
    }

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    
}

