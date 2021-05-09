package nLayerExample.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayerExample.business.abstracts.UserService;
import nLayerExample.core.absracts.EmailService;
import nLayerExample.dataAccess.abstracts.UserDao;
import nLayerExample.entites.concretes.User;
import nLayerExample.jEmail.jEmailManager;

public class UserManager implements UserService{
	private UserDao userDao;
	private EmailService emailService;
	
	

	String regex="^(.+)@(.+)$";
	Pattern pattern =Pattern.compile(regex);
	
	public UserManager(UserDao userDao, jEmailManager jEmailManager) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}
	
	@Override
	public void add(User user) {
Matcher matcher = pattern.matcher(user.getEmail());
		
		if(user.getPassword().length() > 5 && user.getFirstName().length() > 2 &&
				user.getLastName().length() > 2 && matcher.matches() == true) {
			
			this.userDao.add(user);
			this.emailService.verificationMail("Dogrulama e-postasi : " + user.getEmail() + " mailine gonderdildi ");
			this.emailService.verificationLink("Merhaba : " + user.getFirstName() + " Lutfen dogrulama linkine tikla ");
			return;
			
		}
		
		System.out.println("Yanlis bilgi girildi kayit islemi basarisiz");
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
