package org.example;

/**
 * Класс, представляющий сущность "Подразделение"
 * имеет поля:
 * ID(генерится в програме)
 * Название
 * Все поля класса являются неизменяемы после создания объекта(final)
 */
public class Department {
    private final int id;
    private final String name;

    /**
     * Констурктор класса с параметрами
     * @param id уникальный идентификатор подразделения
     * @param name название подразделения
     */
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Возвращает уникальный идентификатор подразделения.
     * @return уникальный идентификатор типа Integer
     */
    public int getId(){
        return id;
    }

    /**
     * Возвращает название подразделения.
     * @return строка с названием подразделения
     */
    public String getName(){
        return name;
    }

    /**
     * Возвращает строковое представление объекта Department.
     * @return строку, содержащую идентификатор и название подразделения
     */
    @Override
    public String toString() {
        return "Id Подразделения: " + id + ", название подразделения: " + name;
    }
}




