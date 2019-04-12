package ua.lviv.iot.sportequipment.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.sportequipment.models.SportEquipment;

public class SportEquipmentWriter {
    public final static void writeToFile(List<SportEquipment> sportEquipment)
            throws FileNotFoundException, IOException {

        File file = new File("out.csv");
        try (FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bufWriter = new BufferedWriter(osw);) {
            for (SportEquipment SportEquipment : sportEquipment) {
                bufWriter.write(
                        SportEquipment.getHeaders() + "\n"
                                + SportEquipment.toCSV() + "\n");
            }
        } finally {
            System.out.println();
        }
    }
}