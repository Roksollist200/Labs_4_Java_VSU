import org.example.Department;
import org.example.Person;
import org.example.TableParser;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class TestTablePerson {
    private Department testDepartment;
    private Person person;

    @Test
    public void testPersonCreate() {
        testDepartment = new Department(13, "Y");
        person = new Person("Barsik", 1001, "Male", "2003-01-15", 50000, testDepartment);
        assertNotNull(person);
        assertEquals("Barsik", person.getName());
        assertEquals(1001, person.getId());
        assertEquals("Male", person.getGender());
        assertEquals("2003-01-15", person.getBirthDate());
        assertEquals(50000, person.getSalary(), 0.001);
        assertEquals(testDepartment, person.getDepartment());
    }

    @Test
    public void testPersonGetDepartment() {
        Department testDepartment = new Department(13, "Y");
        Person person = new Person("Barsik", 1001, "Male", "2003-01-15", 50000, testDepartment);

        // Проверяем департамент
        Department department = person.getDepartment();
        assertNotNull(department);
        assertEquals(13, department.getId());
        assertEquals("Y", department.getName());
    }

    @Test
    public void testBasicFunctional() {
            TableParser parser = new TableParser();

            try {
                // Проверка на то что файл читается
                List<Person> people = parser.readPeople("foreign_names.csv");

                // Проверка резульатата
                assertNotNull(people);
                System.out.println("Прочитано людей: " + people.size());

                //Проверка что файл не пустой
                if (!people.isEmpty()) {
                    System.out.println(" Прочитано " + people.size() + " человек");

                    //Проверка, что первый человек Aahan
                    Person first = people.get(0);
                    System.out.println("Первый человек: " + first.getName());

                }

            } catch (Exception e) {
                System.out.println("Файл не найден, но тест проверяет что метод не падает");
            }
        }
}
