package gameBuy.entities.concretes;

import gameBuy.entities.abstracts.Entity;

public class Campaign implements Entity {
	private int campaignId;
	private String campaignName;
	private double campaignDiscount;
	public Campaign() {
		super();
	}
	public Campaign(int campaignId, String campaignName, double campaignDiscount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getCampaignDiscount() {
		return campaignDiscount;
	}
	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
}
