

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import java.io.*;
import java.util.List;

public class Main {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws FileNotFoundException {
        CsvToBean csv = new CsvToBean();
        String csvFilename = "foreign_names.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename),';');
        List list = csv.parse(setColumMapping(), csvReader);
        for (Object object : list) {
            Person person = (Person) object;
            System.out.println(person);
        }
    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    private static ColumnPositionMappingStrategy setColumMapping ()
    {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Person.class);
        String[] columns = new String[]{"id", "name", "gender", "BirtDate", "", "Salary"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}
