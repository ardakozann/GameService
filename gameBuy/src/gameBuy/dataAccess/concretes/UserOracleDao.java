package gameBuy.dataAccess.concretes;

import gameBuy.dataAccess.abstracts.UserDao;
import gameBuy.entities.concretes.User;

public class UserOracleDao implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName() + " isimli kullanıcı Oracle veritabanına eklendi.");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName() + " isimli kullanıcı Oracle veritabanında güncellendi.");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName() + " isimli kullanıcı Oracle veritabanından silindi.");
	}

}
