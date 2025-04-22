package presentation;

import java.util.ArrayList;
import java.util.List;

import business.UserManager;
import core.logger.FileLogger;
import core.logger.Logger;
import dataAccess.HibernateUserDao;
import entities.User;

public class Main {

	public static void main(String[] args) {
	
        User user = new User();
        user.setId(1);
        user.setName("Ali");
        user.setEmail("ali@gmail.com");
        
        List<Logger> listLoggers = new ArrayList<>();
        listLoggers.add(new FileLogger());
        
        UserManager userManager = new UserManager(new HibernateUserDao(), listLoggers);

        userManager.register(user);

        for (User u : userManager.getAllUsers()) {
            System.out.println(u.getName());
        }

	}

}
