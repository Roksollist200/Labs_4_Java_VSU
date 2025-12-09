package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    TableParser parser = new TableParser();
        try {
            List<Person> personList = parser.readPeople("foreign_names.csv");
            System.out.println("Всего людей прочитано: " + personList.size());
            System.out.println("\nСписок людей:");

            int i = 0;
            for (Person person : personList) {
                Department dep = person.getDepartment();
                System.out.print(dep.getId());
                i++;
                if (i % 20 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
//                System.out.print("ID: " + person.getId() +
//                        ", Имя: " + person.name() +
//                        ", Пол: " + person.gender() +
//                        ", ID подразделения: " + dep.getId() +
//                        ", Подразделение: " + dep.getName() +
//                        ", Зарплата: " + person.getSalary() +
//                        ", Дата рождения: " + person.getBirthDate());
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            System.out.println("Проверьте:");
            System.out.println("1-> Файл foreign_names.csv есть в папке resources");
            System.out.println("2-> Файл не пустой");
            System.out.println("3-> Формат файла правильный (разделитель ;)");
        }
    }

}