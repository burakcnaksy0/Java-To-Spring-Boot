package business;

import java.util.ArrayList;
import java.util.List;

import core.logger.Logger;
import dataAccess.UserDao;
import entities.User;

public class UserManager {
	private UserDao userDao;
	private List<Logger> listLogger = new ArrayList<Logger>();
	
	public UserManager(UserDao userDao , List<Logger> listLogger) {
		this.userDao = userDao;
		this.listLogger = listLogger;
	}

	public void register(User user) {
		// İş kuralı: Aynı email'le kayıt olunamaz
		List<User> users = userDao.getAll();
		for (User u : users) {
			if (u.getEmail().equals(user.getEmail())) {
				throw new RuntimeException("Bu email zaten kullanılıyor.");
			}
		}
		userDao.add(user);
		
		for (Logger logs : listLogger) {
			logs.log(user.getName() + " : " + user.getEmail());
		}
	}

	public List<User> getAllUsers() {
		return userDao.getAll();
	}
}
