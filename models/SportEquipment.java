package ua.lviv.iot.sportequipment.models;

public abstract class SportEquipment {
	private String name;
	private int age;
	private Experience experience;
	private Season season;
	private double price;
	private double rating;

	public SportEquipment() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public SportEquipment(String name, int age, Experience experience, Season season, double price, double rating) {
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.season = season;
		this.price = price;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "SportEquipment [name=" + name + ", experience=" + experience + ", season=" + season + ", price=" + price
				+ ", rating=" + rating + ", age=" + age + "]";
	}

	public static void main(String[] args) {

	}

}
