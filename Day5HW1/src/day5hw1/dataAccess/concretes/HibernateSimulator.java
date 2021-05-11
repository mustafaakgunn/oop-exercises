package day5hw1.dataAccess.concretes;

import java.util.List;
import day5hw1.dataAccess.abstracts.ProductDao;
import day5hw1.entities.concretes.Users;


public class HibernateSimulator implements ProductDao {

	@Override
	public void add(Users user) {
		System.out.println("Successfully added with Hibernate:" + user.getName());
	}

	@Override
	public void update(Users user) {
		System.out.println("Successfully updated:" + user.getName());
	}

	@Override
	public void delete(Users user) {
		
		System.out.println("Successfully deleted:" + user.getName());
	}

	@Override
	public Users get(int id) {		
		return null;
	}

	@Override
	public List<Users> getAll() {
		return null;
	}
	}

