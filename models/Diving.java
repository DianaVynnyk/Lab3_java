package ua.lviv.iot.sportequipment.models;

public class Diving extends SportEquipment {
	private double maximumTimeUnderWater;
	private DivingEquipment divingEquipment;

	public Diving() {
	}

	public Diving(String name, int age, Experience experience, Season season, double price, double rating,
			double maximumTimeUnderWater, DivingEquipment divingEquipment) {
		super(name, age, experience, season, price, rating);
		this.maximumTimeUnderWater = maximumTimeUnderWater;
		this.divingEquipment = divingEquipment;
	}

	public double getMaximumTimeUnderWater() {
		return maximumTimeUnderWater;
	}

	public void setMaximumTimeUnderWater(double maximumTimeUnderWater) {
		this.maximumTimeUnderWater = maximumTimeUnderWater;
	}

	public DivingEquipment getDivingEquipment() {
		return divingEquipment;
	}

	public void setDivingEquipment(DivingEquipment divingEquipment) {
		this.divingEquipment = divingEquipment;
	}

}
