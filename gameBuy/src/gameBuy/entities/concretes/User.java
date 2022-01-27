package gameBuy.entities.concretes;

import java.util.ArrayList;

import gameBuy.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String userName;
	private String eMailAddress;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int dateOfBirth;
	private double cash;
	private ArrayList<Game> games = new ArrayList<Game>();
	public User() {
		super();
	}
	public User(int id, String userName, String eMailAddress, String firstName, String lastName, String identityNumber,
			int dateOfBirth, double cash) {
		super();
		this.id = id;
		this.userName = userName;
		this.eMailAddress = eMailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.cash = cash;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String geteMailAddress() {
		return eMailAddress;
	}
	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
}
