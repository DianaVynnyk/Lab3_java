package ua.lviv.iot.sportequipment.models;

public class RockClimbing extends SportEquipment {
	private double cliffHeight;

	public RockClimbing() {
	}

	public RockClimbing(String name, int age, Experience experience, Season season, double price, double rating,
			double cliffHeight) {
		super(name, age, experience, season, price, rating);
		this.cliffHeight = cliffHeight;
	}

	public double getCliffHeight() {
		return cliffHeight;
	}

	public void setCliffHeight(double cliffHeight) {
		this.cliffHeight = cliffHeight;
	}

}
