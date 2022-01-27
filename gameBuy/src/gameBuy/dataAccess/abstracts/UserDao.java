package gameBuy.dataAccess.abstracts;

import gameBuy.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
}
