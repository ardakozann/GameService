package gameBuy.dataAccess.concretes;

import gameBuy.dataAccess.abstracts.CampaignDao;
import gameBuy.entities.concretes.Campaign;

public class CampaignOracleDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " isimli kampanya Oracle veritaban�na eklendi.");
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " isimli kampanya Oracle veritaban�nda g�ncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " isimli kampanya Oracle veritaban�ndan silindi.");
	}

}
