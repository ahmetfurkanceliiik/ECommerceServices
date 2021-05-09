package nLayerExample.dataAccess.concretes;

import java.util.List;

import nLayerExample.dataAccess.abstracts.UserDao;
import nLayerExample.entites.concretes.User;

public class GoogleUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Google Hesabiyla Eklendi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
