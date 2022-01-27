package gameBuy.business.abstracts;


import gameBuy.entities.concretes.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user);
}
