package nLayerExample;

import nLayerExample.business.abstracts.LoginService;
import nLayerExample.business.abstracts.UserService;
import nLayerExample.business.concretes.LoginManager;
import nLayerExample.business.concretes.UserManager;

import nLayerExample.dataAccess.concretes.GoogleUserDao;
import nLayerExample.entites.concretes.User;
import nLayerExample.jEmail.jEmailManager;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new GoogleUserDao(), new jEmailManager());
		
		User user = new User(1, "Furkan", "Çelik", "ahmetfurkanceliiik@gmail.com", "123456");
		userService.add(user);
			
		
	//LoginService loginService = new LoginManager(new User(1, "Furkan", "Çelik", "ahmetfurkanceliiik@gmail.com", "123456"));
		LoginService loginService = new LoginManager(user);
		loginService.login("ahmetfurkanceliiik@gmail.com", "123456");

	}

}
