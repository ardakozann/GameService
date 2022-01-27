package gameBuy.dataAccess.abstracts;

import gameBuy.entities.concretes.Campaign;
import gameBuy.entities.concretes.Game;
import gameBuy.entities.concretes.User;

public interface SaleDao {
	void buy(User user,Game game);
	void buy(User user,Game game,Campaign campaign);
}
