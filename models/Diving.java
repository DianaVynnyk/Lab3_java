package ua.lviv.iot.sportequipment.models;

public class Diving extends SportEquipment {
    private double maximumTimeUnderWater;
    private DivingEquipment divingEquipment;

    public Diving() {
    }

    public Diving(final String name, final int age, final Experience experience, final Season season,
            final double price, final double rating, final double maximumTimeUnderWater,
            final DivingEquipment divingEquipment) {
        super(name, age, experience, season, price, rating);
        this.maximumTimeUnderWater = maximumTimeUnderWater;
        this.divingEquipment = divingEquipment;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "maximumTimeUnderWater" + ", " + "divingEquipment";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + maximumTimeUnderWater + ", " + divingEquipment;
    }

    public double getMaximumTimeUnderWater() {
        return maximumTimeUnderWater;
    }

    public void setMaximumTimeUnderWater(final double maximumTimeUnderWater) {
        this.maximumTimeUnderWater = maximumTimeUnderWater;
    }

    public DivingEquipment getDivingEquipment() {
        return divingEquipment;
    }

    public void setDivingEquipment(final DivingEquipment divingEquipment) {
        this.divingEquipment = divingEquipment;
    }

}
