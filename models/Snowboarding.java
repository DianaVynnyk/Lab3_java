package ua.lviv.iot.sportequipment.models;

public class Snowboarding extends SportEquipment {
	private double downhillHeight;
	private SnowboardingEquipment snowboardingEquipment;

	public Snowboarding() {
	}

	public Snowboarding(String name, int age, Experience experience, Season season, double price, double rating,
			double downhillHeight, SnowboardingEquipment snowboardingEquipment) {
		super(name, age, experience, season, price, rating);
		this.downhillHeight = downhillHeight;
		this.snowboardingEquipment = snowboardingEquipment;
	}

	public double getDownhillHeight() {
		return downhillHeight;
	}

	public void setDownhillHeight(double downhillHeight) {
		this.downhillHeight = downhillHeight;
	}

	public SnowboardingEquipment getSnowboardingEquipment() {
		return snowboardingEquipment;
	}

	public void setSnowboardingEquipment(SnowboardingEquipment snowboardingEquipment) {
		this.snowboardingEquipment = snowboardingEquipment;
	}

}
