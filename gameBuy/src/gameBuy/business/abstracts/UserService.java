package gameBuy.business.abstracts;



import gameBuy.entities.concretes.User;

public interface UserService {
	void add(User user) ;
	void update(String userIdNumber,String toUpdateUserName, String toUpdateEMailAddress);//g�ncelleme i�in
	void update(User user);//oyun eklendi�inde bakiye eksiltmek ve oyunu eklemek i�in
	void delete(String toDeleteId);
	void getAll();
}
