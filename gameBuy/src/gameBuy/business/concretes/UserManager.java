package gameBuy.business.concretes;

import java.util.ArrayList;

import gameBuy.business.abstracts.UserCheckService;
import gameBuy.business.abstracts.UserService;
import gameBuy.dataAccess.abstracts.UserDao;
import gameBuy.entities.concretes.Game;
import gameBuy.entities.concretes.User;


public class UserManager implements UserService {
	private ArrayList<User> users= new ArrayList<User>();
	private UserCheckService userCheckService;
	private UserDao userDao;
	
	
	
	public UserManager() {
		super();
	}

	
	public UserManager(UserCheckService userCheckService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.userDao = userDao;
	}


	public UserManager(ArrayList<User> users, UserCheckService userCheckService, UserDao userDao) {
		super();
		this.users = users;
		this.userCheckService = userCheckService;
		this.userDao = userDao;
	}


	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if(this.userCheckService.checkIfRealPerson(user)) {
			this.users.add(user);
			System.out.println(user.getUserName()+" isimli kullan�c� kay�t edildi.");
			this.userDao.add(user);
		}
		else {
			System.out.println("Kullan�c� bilgileri do�ru de�il.");
		}
	}

	@Override
	public void update(String userIdNumber, String toUpdateUserName, String toUpdateEMailAddress) {
		// TODO Auto-generated method stub
		for(User userB : this.users) { //userB: eski bilgiler, userA: yeni bilgiler	
				if(Long.valueOf(userB.getIdentityNumber()).longValue()==Long.valueOf(userIdNumber).longValue()) {
					User userA = new User(userB.getId(),toUpdateUserName,toUpdateEMailAddress,userB.getFirstName(),userB.getLastName(), userB.getIdentityNumber(),
							userB.getDateOfBirth(),userB.getCash()); 
					this.users.set(this.users.indexOf(userB), userA);
					System.out.println("Kullan�c� ad�: "+ userA.getUserName());
					System.out.println("e-mail adresi: "+ userA.geteMailAddress()+" olarak de�i�tirildi.");
					this.userDao.update(userA);
					return;
			}
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		for(User userA : this.users) {
			if(user.getId()==userA.getId()) {
				this.users.set(users.indexOf(userA), user);
			}
		}
	}
	
	@Override
	public void delete(String toDeleteId) {
		// TODO Auto-generated method stub
		for(User userA : users) {
			if(Long.valueOf(userA.getIdentityNumber()).longValue()==Long.valueOf(toDeleteId).longValue()) {
				User userB = new User(userA.getId(),userA.getUserName(),userA.geteMailAddress(),userA.getFirstName(),userA.getLastName(),userA.getIdentityNumber(),userA.getDateOfBirth(),userA.getCash());
				this.users.remove(userB);
				System.out.println(userB.getUserName()+" isimli kullan�c� silindi.");
				this.userDao.delete(userB);
				return;
			}
		}
	}
	
	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for(User userA : this.users) {
			System.out.println("----------------------------------------");
			System.out.println("Kullan�c� ismi: " + userA.getUserName());
			System.out.println("Kullan�c� bakiyesi: " + userA.getCash());
			System.out.println("Sahip oldu�u oyunlar: ");
			for(Game gameA : userA.getGames()) {
				System.out.print(gameA.getGameName()+ " ");
			}
			System.out.println("\n");
		}
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

}

