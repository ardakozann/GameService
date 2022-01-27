package gameBuy.business.concretes;

import java.util.ArrayList;

import gameBuy.business.abstracts.CampaignService;
import gameBuy.dataAccess.abstracts.CampaignDao;
import gameBuy.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	private ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
	private CampaignDao campaignDao;
	
	public CampaignManager() {
		super();
	}

	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	public CampaignManager(ArrayList<Campaign> campaigns, CampaignDao campaignDao) {
		super();
		this.campaigns = campaigns;
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		this.campaigns.add(campaign);
		System.out.println(campaign.getCampaignName()+" isimli kampanya kayýt edildi.");
		this.campaignDao.add(campaign);
	}

	@Override
	public void update(int campaignId, String toUpdateCampaignName, double toUpdateCampaignDiscount) {
		// TODO Auto-generated method stub
		for(Campaign campaignB : this.campaigns) {
			if(campaignB.getCampaignId()==campaignId) {				
				Campaign campaignA = new Campaign(campaignB.getCampaignId(), toUpdateCampaignName, toUpdateCampaignDiscount);
				this.campaigns.set(this.campaigns.indexOf(campaignB), campaignA);
				System.out.println("Kampanya ismi: "+campaignA.getCampaignName());
				System.out.println("Kampanya indirimi: %"+campaignA.getCampaignDiscount()*100+" olarak güncellenmiþtir.");
				this.campaignDao.update(campaignA);

			}
		}		
	}

	@Override
	public void delete(int toDeleteCampaignId) {
		// TODO Auto-generated method stub
		for(Campaign campaignB : this.campaigns) {
			if(campaignB.getCampaignId()==toDeleteCampaignId) {
				Campaign campaignC = new Campaign(toDeleteCampaignId,campaignB.getCampaignName(),campaignB.getCampaignDiscount());
				System.out.println(campaignC.getCampaignName()+" Ýsimli kampanya silinmiþtir.");
				this.campaignDao.delete(campaignC);
				this.campaigns.remove(campaignC);
				return;
			}
		}
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for(Campaign campaignA : this.campaigns) {
			System.out.println("Kampanya kodu: " + campaignA.getCampaignName() + " Ýndirim: %"+campaignA.getCampaignDiscount()*100);
		}
	}

}
