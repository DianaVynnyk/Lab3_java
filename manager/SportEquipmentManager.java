package ua.lviv.iot.sportequipment.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.sportequipment.models.Diving;
import ua.lviv.iot.sportequipment.models.Experience;
import ua.lviv.iot.sportequipment.models.RockClimbing;
import ua.lviv.iot.sportequipment.models.Season;
import ua.lviv.iot.sportequipment.models.Snowboarding;
import ua.lviv.iot.sportequipment.models.SnowboardingEquipment;
import ua.lviv.iot.sportequipment.models.SportEquipment;

public class SportEquipmentManager {
	private List<SportEquipment> sportEquipments;

	public SportEquipmentManager() {

	}

	public SportEquipmentManager(List<SportEquipment> sportEquipments) {
		super();
		this.sportEquipments = sportEquipments;
	}

	public List<SportEquipment> filterBySeason(Season season) {
		List<SportEquipment> sportEquipmentList = sportEquipments;
		List<SportEquipment> filteredSportEquipmentList = sportEquipmentList.stream()
				.filter(sportEquipment -> sportEquipment.getSeason() == season).collect(Collectors.toList());
		return filteredSportEquipmentList;
	}

	public List<SportEquipment> filterByPrice(double price) {
		List<SportEquipment> sportEquipmentList = sportEquipments;
		List<SportEquipment> filteredSportEquipmentList = sportEquipmentList.stream()
				.filter(sportEquipment -> sportEquipment.getPrice() == price).collect(Collectors.toList());
		return filteredSportEquipmentList;
	}

	public List<SportEquipment> filterByName(String name) {
		List<SportEquipment> sportEquipmentList = sportEquipments;
		List<SportEquipment> filteredSportEquipmentList = sportEquipmentList.stream()
				.filter(sportEquipment -> sportEquipment.getName() == name).collect(Collectors.toList());
		return filteredSportEquipmentList;
	}

	public List<SportEquipment> filterByExperience(Experience experience) {
		List<SportEquipment> sportEquipmentList = sportEquipments;
		List<SportEquipment> filteredSportEquipmentList = sportEquipmentList.stream()
				.filter(sportEquipment -> sportEquipment.getExperience() == experience).collect(Collectors.toList());
		return filteredSportEquipmentList;
	}

	public List<SportEquipment> sortByPrice(boolean descending) {
		Comparator<SportEquipment> comparator = (SportEquipment obj1, SportEquipment obj2) -> Double
				.compare((obj1.getPrice()), (obj2.getPrice()));
		List<SportEquipment> sportEquipmentList = sportEquipments;
		sportEquipmentList.sort(comparator);
		if (descending) {
			Collections.reverse(sportEquipmentList);
		}
		return sportEquipmentList;
	}

	public List<SportEquipment> sortByRating(boolean descending) {
		Comparator<SportEquipment> comparator = (SportEquipment obj1, SportEquipment obj2) -> Double
				.compare((obj1.getRating()), (obj2.getRating()));
		List<SportEquipment> sportEquipmentList = sportEquipments;
		sportEquipmentList.sort(comparator);
		if (descending) {
			Collections.reverse(sportEquipmentList);
		}
		return sportEquipmentList;
	}

	public void setSportEquipments(List<SportEquipment> sportEquipments) {
		this.sportEquipments = sportEquipments;
	}

	public static void main(String[] args) {
		List<SportEquipment> sportEquipments = new ArrayList<>();

		sportEquipments.add(new Diving(null, 17, Experience.ADVANCED, Season.SUMMER, 300, 3.5, 1000, null));
		sportEquipments.add(new Snowboarding(null, 16, Experience.BEGINNER, Season.WINTER, 200, 3, 1000,
				SnowboardingEquipment.HELMET));
		sportEquipments.add(new RockClimbing(null, 28, Experience.PROFESSIONAL, Season.FALL, 100, 5, 0));
		sportEquipments.add(new RockClimbing(null, 20, Experience.ADVANCED, Season.SPRING, 100, 4, 0));
		sportEquipments.add(new Diving(null, 25, Experience.PROFESSIONAL, Season.SUMMER, 700, 5, 0, null));

		SportEquipmentManager manager = new SportEquipmentManager(sportEquipments);
		List<SportEquipment> filteredSportEquipments = manager.filterByPrice(0);
		System.out.println(filteredSportEquipments);

		List<SportEquipment> sortedSportEquipments = (new SportEquipmentManager(sportEquipments)).sortByPrice(false);
		System.out.println(sortedSportEquipments);

		List<SportEquipment> sortedFilteredSportEquipments = (new SportEquipmentManager(filteredSportEquipments))
				.sortByRating(true);
		System.out.println(sortedFilteredSportEquipments);

	}
}
