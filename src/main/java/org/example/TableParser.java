package org.example;
import com.opencsv.CSVReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *Клас для считывания CSV-файлов и преобзаовнаие обхектов в список
 */

public class TableParser {
    /**
     *Читает данные из CSV-файла и преобразует их в список объектов Person
     * @param csvPath путь к CSV-файлу
     * @return список обхектов Person, которые считываются из файла
     * @throws Exception Вызво иселбчения если:
     * 1-> файл не найден;
     * 2->данные имеют неверный формат
     *
     *
     */
    public List<Person> readPeople(String csvPath) throws Exception {

        List<Person> people = new ArrayList<>();

        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvPath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), ';')) {

            if (reader == null) {
                throw new RuntimeException("File not found: " + csvPath);
            }
            reader.readNext();                          //пропуск заголовка
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String gender = nextLine[2];
                String birthDate = nextLine[3];
                String depName = nextLine[4];
                double salary = Double.parseDouble(nextLine[5]);


                int depId = depName.hashCode();

                Department department = new Department(depId, depName);

                Person p = new Person(name, id, gender, birthDate, salary, department);
                people.add(p);
            }
        }

        return people;

    }
}
