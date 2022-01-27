package gameBuy.dataAccess.concretes;

import gameBuy.dataAccess.abstracts.GameDao;
import gameBuy.entities.concretes.Game;

public class GameOracleDao implements GameDao{

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+" oyunu Oracle veritabanýna eklendi.");
	}
	
}
