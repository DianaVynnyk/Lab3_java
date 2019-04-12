package ua.lviv.iot.sportequipment.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.sportequipment.models.Experience;
import ua.lviv.iot.sportequipment.models.Season;
import ua.lviv.iot.sportequipment.models.SportEquipment;

public class SportEquipmentManager {
    private List<SportEquipment> sportEquipments;

    public SportEquipmentManager() {
        List<String> list;
    }

    public SportEquipmentManager(final List<SportEquipment> sportEquipments) {
        super();
        this.sportEquipments = sportEquipments;
    }

    public List<SportEquipment> filterBySeason(final Season season) {
        List<SportEquipment> filteredList = new ArrayList<SportEquipment>();
        this.sportEquipments.forEach((equipment) -> {
            if (equipment.getSeason().equals(season)) {
                filteredList.add(equipment);
            }
        });
        return filteredList;
    }

    public List<SportEquipment> filterByPrice(final double price) {
        List<SportEquipment> filteredList = new ArrayList<SportEquipment>();
        this.sportEquipments.forEach((equipment) -> {
            if (equipment.getPrice() == price) {
                filteredList.add(equipment);
            }
        });
        return filteredList;
    }

    public List<SportEquipment> filterByName(final String name) {
        List<SportEquipment> filteredList = new ArrayList<SportEquipment>();
        this.sportEquipments.forEach((equipment) -> {
            if (equipment.getName() == name) {
                filteredList.add(equipment);
            }
        });
        return filteredList;
    }

    public List<SportEquipment> filterByExperience(final Experience experience) {
        List<SportEquipment> filteredList = new ArrayList<SportEquipment>();
        this.sportEquipments.forEach((equipment) -> {
            if (equipment.getExperience() == experience) {
                filteredList.add(equipment);
            }
        });
        return filteredList;
    }

    public List<SportEquipment> sortByPrice(final boolean descending) {
        Comparator<SportEquipment> comparator = (SportEquipment obj1, SportEquipment obj2) -> Double
                .compare((obj1.getPrice()), (obj2.getPrice()));
        List<SportEquipment> sportEquipmentList = sportEquipments;
        sportEquipmentList.sort(comparator);
        if (descending) {
            Collections.reverse(sportEquipmentList);
        }
        return sportEquipmentList;
    }

    public List<SportEquipment> sortByRating(final boolean descending) {
        List<SportEquipment> sportEquipmentList = sportEquipments;
        sportEquipmentList.sort((obj1, obj2) -> Double
                .compare(obj1.getRating(), obj2.getRating()));
        if (descending) {
            Collections.reverse(sportEquipmentList);
        }
        return sportEquipmentList;
    }

    public void setSportEquipments(final List<SportEquipment> sportEquipments) {
        this.sportEquipments = sportEquipments;
    }
}
