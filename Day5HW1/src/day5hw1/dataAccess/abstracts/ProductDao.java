package day5hw1.dataAccess.abstracts;

import java.util.List;
import day5hw1.entities.concretes.Users;

public interface ProductDao {

	void add(Users user);	
	void update(Users user);
	void delete(Users user);
	Users get(int id);
	List<Users> getAll();
	
	
	
}
