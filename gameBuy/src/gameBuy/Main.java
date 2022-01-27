package gameBuy;


import gameBuy.business.concretes.CampaignManager;
import gameBuy.business.concretes.GameManager;
import gameBuy.business.concretes.SaleManager;
import gameBuy.business.concretes.UserCheckManager;
import gameBuy.business.concretes.UserManager;
import gameBuy.dataAccess.concretes.CampaignOracleDao;
import gameBuy.dataAccess.concretes.GameOracleDao;
import gameBuy.dataAccess.concretes.SaleOracleDao;
import gameBuy.dataAccess.concretes.UserOracleDao;
import gameBuy.entities.concretes.Campaign;
import gameBuy.entities.concretes.Game;
import gameBuy.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userManager = new UserManager(new UserCheckManager(),new UserOracleDao());
		GameManager gameManager = new GameManager(new GameOracleDao());
		SaleManager saleManager = new SaleManager(new SaleOracleDao());
		CampaignManager campaignManager = new CampaignManager(new CampaignOracleDao());

		//Game
		Game game1 = new Game(1,"Minecraft",20);
		Game game2 = new Game(2,"Sims",30);
		Game game3 = new Game(3,"GTA",80);
		Game game4 = new Game(4,"Mario",100);
		Game game5 = new Game(5,"Portal",400);
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		gameManager.add(game5);
		
		//Campaign
		Campaign campaign1 = new Campaign(1,"Kampanya25",0.25);
		Campaign campaign2 = new Campaign(2,"Kampanya50",0.5);
		Campaign campaign3 = new Campaign(3,"Kampanya60",0.6);
		Campaign campaign4 = new Campaign(4,"Kampanya80",0.8);
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		campaignManager.add(campaign4);
		/*campaign3 = */campaignManager.update(3, "Kampanya75", 0.75);
		campaignManager.delete(4);
		
		//User
		User user1 = new User(1,"Kozan23","ardakozan97@gmail.com","Arda","Kozan","11111111111",1997,500);
		User user2 = new User(2,"Mehmet233","mehmetmehmet@hotmail.com","Veli","Kozan","11111111111",1964,100);
		User user3 = new User(3,"asdaasd","ardakozan@gmail.com","Hakan","Kozan","11111111111",1960,100);
		User user4 = new User(4,"qwer1234","qwer1234@gmail.com","Ali","Keskin","11111111111",1989,200);
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		userManager.add(user4);
		userManager.update("11111111111", "hakan06","hakankozan@hotmail.com");
		userManager.delete("11111111111");
		
		//Sale
		userManager.update(saleManager.buy(user1, game5, campaign3));
		userManager.update(saleManager.buy(user1, game4));
		userManager.update(saleManager.buy(user1, game3));
		//getAll fonksiyonlarý
		userManager.getAll();
		campaignManager.getAll();
	}

}
