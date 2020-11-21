

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.List;

public class Main {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws FileNotFoundException {
        CsvToBean csv = new CsvToBean();
        String csvFilename = "foreign_names.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename),';', '"', 1);
        List personList = csv.parse(setColumMapping(), csvReader);
        int currentDivisionId = 0;
        for (Object object : personList) {
            object = new Person((FlatPerson) object, currentDivisionId);
            System.out.println(object.toString());
            currentDivisionId++;
        }
    }

    @NotNull
    @SuppressWarnings({"rawtypes", "unchecked"})
    private static ColumnPositionMappingStrategy setColumMapping() {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(FlatPerson.class);
        String[] columns = new String[]{"id", "name", "gender", "birtDate", "divisionName", "salary"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}
