package gameBuy.dataAccess.concretes;

import gameBuy.dataAccess.abstracts.UserDao;
import gameBuy.entities.concretes.User;

public class UserOracleDao implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName() + " isimli kullan�c� Oracle veritaban�na eklendi.");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName() + " isimli kullan�c� Oracle veritaban�nda g�ncellendi.");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName() + " isimli kullan�c� Oracle veritaban�ndan silindi.");
	}

}
