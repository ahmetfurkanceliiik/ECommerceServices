package nLayerExample.business.abstracts;

import java.util.List;

import nLayerExample.entites.concretes.User;

public interface UserService {
	
	void add(User user);
	List<User> getAll();
}
