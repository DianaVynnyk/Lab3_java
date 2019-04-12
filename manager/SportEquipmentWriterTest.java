package ua.lviv.iot.sportequipment.manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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

class SportEquipmentWriterTest {

    private List<SportEquipment> sportEquipment;

    @BeforeEach
    public void beforeEach() {
        sportEquipment = new ArrayList<>();
        sportEquipment.add(new Diving("overalls", 17, Experience.ADVANCED, Season.SUMMER, 300, 3.5, 1000, null));
        sportEquipment.add(new Snowboarding("gloves", 16, Experience.BEGINNER, Season.WINTER, 200, 3, 1000,
                SnowboardingEquipment.HELMET));
        sportEquipment.add(new RockClimbing("glasses", 28, Experience.PROFESSIONAL, Season.FALL, 100, 5, 0));
        sportEquipment.add(new RockClimbing("helmet", 20, Experience.ADVANCED, Season.SPRING, 100, 4, 0));
        sportEquipment.add(new Diving("", 25, Experience.PROFESSIONAL, Season.SUMMER, 700, 5, 0, DivingEquipment.MASK));
    }

    @Test
    public void testWriteToFile() throws FileNotFoundException, IOException {
        SportEquipmentWriter.writeToFile(sportEquipment);
        File file = new File("out.csv");
        try (FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader bufReader = new BufferedReader(isr);) {
            String line = null;
            String lines = "";
            while ((line = bufReader.readLine()) != null) {
                lines += line + "\n";
            }
            lines = lines.substring(0, lines.length() - 1);
            System.out.println(lines);
            Assertions.assertEquals(
                    "name, age, experience, season, price, rating, maximumTimeUnderWater, divingEquipment\n"
                            + "overalls, 17, ADVANCED, SUMMER, 300.0, 3.5, 1000.0, null\n"
                            + "name, age, experience, season, price, rating, downhillHeight, snowboardingEquipment\n"
                            + "gloves, 16, BEGINNER, WINTER, 200.0, 3.0, 1000.0, HELMET\n"
                            + "name, age, experience, season, price, rating, cliffHeight\n"
                            + "glasses, 28, PROFESSIONAL, FALL, 100.0, 5.0, 0.0\n"
                            + "name, age, experience, season, price, rating, cliffHeight\n"
                            + "helmet, 20, ADVANCED, SPRING, 100.0, 4.0, 0.0\n"
                            + "name, age, experience, season, price, rating, maximumTimeUnderWater, divingEquipment\n"
                            + " , 25, PROFESSIONAL, SUMMER, 700.0, 5.0, 0.0, MASK\n",
                    lines);
        } finally {
            System.out.println();
        }

    }
}