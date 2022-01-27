package gameBuy.business.abstracts;



import gameBuy.entities.concretes.User;

public interface UserService {
	void add(User user) ;
	void update(String userIdNumber,String toUpdateUserName, String toUpdateEMailAddress);//güncelleme için
	void update(User user);//oyun eklendiðinde bakiye eksiltmek ve oyunu eklemek için
	void delete(String toDeleteId);
	void getAll();
}
