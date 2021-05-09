package nLayerExample.dataAccess.abstracts;
import java.util.List;


import nLayerExample.entites.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	
	User getUser(int id);
	List<User> getAllUser();
}
