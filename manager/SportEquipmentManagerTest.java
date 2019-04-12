package ua.lviv.iot.sportequipment.manager;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.sportequipment.models.Diving;
import ua.lviv.iot.sportequipment.models.DivingEquipment;
import ua.lviv.iot.sportequipment.models.Experience;
import ua.lviv.iot.sportequipment.models.RockClimbing;
import ua.lviv.iot.sportequipment.models.Season;
import ua.lviv.iot.sportequipment.models.Snowboarding;
import ua.lviv.iot.sportequipment.models.SnowboardingEquipment;
import ua.lviv.iot.sportequipment.models.SportEquipment;

class SportEquipmentManagerTest {


    private SportEquipmentManager sportEquipmentManager;

    @BeforeEach
    public void beforeEach() {
        final List<SportEquipment> sportEquipments = new ArrayList<>();
        sportEquipments.add(new Diving("overalls", 17, Experience.ADVANCED, Season.SUMMER, 300, 3.5, 1000, null));
        sportEquipments.add(new Snowboarding("gloves", 16, Experience.BEGINNER, Season.WINTER, 200, 3, 1000,
                SnowboardingEquipment.HELMET));
        sportEquipments.add(new RockClimbing("glasses", 28, Experience.PROFESSIONAL, Season.FALL, 100, 5, 0));
        sportEquipments.add(new RockClimbing("helmet", 20, Experience.ADVANCED, Season.SPRING, 100, 4, 0));
        sportEquipments.add(new Diving("", 25, Experience.PROFESSIONAL, Season.SUMMER, 700, 5, 0, DivingEquipment.MASK));
        sportEquipmentManager = new SportEquipmentManager(sportEquipments);
    }



    @Test
    void testFilterByExperience() {

        Assertions.assertEquals(sportEquipmentManager.filterByExperience(Experience.BEGINNER).size(),1);
        Assertions.assertEquals(sportEquipmentManager.filterByExperience(Experience.ADVANCED).size(),2);
        Assertions.assertEquals(sportEquipmentManager.filterByExperience(Experience.PROFESSIONAL).size(),2);
    }
    @Test
    void testFilterByName() {
        Assertions.assertEquals(sportEquipmentManager.filterByName("overalls").size(),1);
        Assertions.assertEquals(sportEquipmentManager.filterByName("gloves").size(),1);
        Assertions.assertEquals(sportEquipmentManager.filterByName("glasses").size(),1);
        Assertions.assertEquals(sportEquipmentManager.filterByName("helmet").size(),1);
    }


    @Test
    void testFilterBySeason() {
        Assertions.assertEquals(sportEquipmentManager.filterBySeason(Season.WINTER).size(),1);
        Assertions.assertEquals(sportEquipmentManager.filterBySeason(Season.SUMMER).size(),2);
        Assertions.assertEquals(sportEquipmentManager.filterBySeason(Season.SPRING).size(),1);
        Assertions.assertEquals(sportEquipmentManager.filterBySeason(Season.FALL).size(),1);
    }


    @Test
    void testSortByPrice() {
        Assertions.assertEquals(sportEquipmentManager.sortByPrice(true).get(0).getPrice(),700);
        Assertions.assertEquals(sportEquipmentManager.sortByPrice(false).get(0).getPrice(),100);

    }
    @Test
    void testSortByRating() {
        Assertions.assertEquals(sportEquipmentManager.sortByRating(true).get(0).getRating(),5);
        Assertions.assertEquals(sportEquipmentManager.sortByRating(false).get(0).getRating(),3);
    }

}
