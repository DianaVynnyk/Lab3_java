package ua.lviv.iot.sportequipment.models;

public class Snowboarding extends SportEquipment {
    private double downhillHeight;
    private SnowboardingEquipment snowboardingEquipment;

    public Snowboarding() {
    }

    public Snowboarding(final String name, final int age, final Experience experience, final Season season,
            final double price, final double rating, final double downhillHeight,
            final SnowboardingEquipment snowboardingEquipment) {
        super(name, age, experience, season, price, rating);
        this.downhillHeight = downhillHeight;
        this.snowboardingEquipment = snowboardingEquipment;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() +"downhillHeight" + ", " + "snowboardingEquipment";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + downhillHeight + ", " + snowboardingEquipment;
        }
    public double getDownhillHeight() {
        return downhillHeight;
    }

    public void setDownhillHeight(final double downhillHeight) {
        this.downhillHeight = downhillHeight;
    }

    public SnowboardingEquipment getSnowboardingEquipment() {
        return snowboardingEquipment;
    }

    public final void setSnowboardingEquipment(final SnowboardingEquipment snowboardingEquipment) {
        this.snowboardingEquipment = snowboardingEquipment;
    }

}
