package ua.lviv.iot.sportequipment.models;

public class RockClimbing extends SportEquipment {
    private double cliffHeight;

    public RockClimbing() {
    }

    public RockClimbing(final String name, final int age, final Experience experience, final Season season,
            final double price, final double rating, final double cliffHeight) {
        super(name, age, experience, season, price, rating);
        this.cliffHeight = cliffHeight;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() +"cliffHeight";
    }
    @Override
    public String toCSV() {
        return super.toCSV()  + cliffHeight;
        }

    public double getCliffHeight() {
        return cliffHeight;
    }

    public void setCliffHeight(final double cliffHeight) {
        this.cliffHeight = cliffHeight;
    }

}
