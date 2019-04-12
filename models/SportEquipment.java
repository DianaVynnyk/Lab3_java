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
    public String getHeaders() {
        return "name" + ", " + "age" + ", " +"experience" + ", " + "season" + ", "
                + "price" + ", rating" + ", ";
    }
    public String toCSV() {
        return name + ", " + age + ", " + experience + ", " + season + ", "
                 + price + ", " + rating + ", ";
    }

    public SportEquipment(final String name, final int age, final Experience experience, final Season season,
            final double price, final double rating) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.season = season;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(final Experience experience) {
        this.experience = experience;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(final Season season) {
        this.season = season;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(final double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "SportEquipment [name=" + name + ", " + "experience=" + experience + ", " + "season=" + season + ", "
                + "price=" + price + ", rating=" + rating + ", " + "age=" + age + "]";
    }

    public static void main(final String[] args) {

    }

}
