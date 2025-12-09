package org.example;

import java.util.Date;

/**
 * Класс отвечаюзий за сущность Человек:
 * Имеет поля:
 * ID
 * Имя
 * Пол
 * Подразделение(Сущность подразделение)
 * Зарплата
 * Дата рождения
 *Все поля класса являются неизменяемы после создания объекта(final)
 */
public class Person {
    private final int ID;
    private final String name;
    private final  String gender;
    private final Department department;
    private final double salary;
    private final String birthDate;

    /**
     * Конструктор класса человек с указаанными параметрами
     * @param name имя человека
     * @param id  уникальный индекнтификатор человека
     * @param gender пол человека
     * @param birthDate дата рождения в формате строки
     * @param salary  зарпалата
     * @param department подразделение
     */
    public Person(String name, int id, String gender, String birthDate, double salary, Department department) {
        this.name = name;
        ID = id;
        this.gender = gender;
        this.birthDate = birthDate;
        this.salary = salary;
        this.department = department;
    }

    /**
     * Возвращает уникальный идентификатор сотрудника.
     * @return уникальное число для идентифицирования человека типа int
     */
    public int getId(){
        return ID;
    }

    /**
     * Возвращает имя человека
     * @return   имя сотрудника типа String
     */
    public String getName(){
        return name;
    }

    /**
     *  Возвращает пол сотрудника.
     * @return пол в виде строки
     */
    public String getGender(){
        return  gender;
    }

    /**
     * Возвращает подразделение, к которому прикреплен человек
     * @return объект класса Department, представляющий подразделение
     */
    public Department getDepartment(){
        return department;
    }

    /**
     * Возвращает размер заработной платы человека
     * @return зарплату типа integer
     */
    public double getSalary(){
        return  salary;
    }

    /**
     * Возвращает дату рождения человека
     * @return дату рождения в виде String
     */
    public String getBirthDate(){
        return  birthDate;
    }



}
