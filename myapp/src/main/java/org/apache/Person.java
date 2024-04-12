package org.apache;

import com.google.gson.Gson;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Класс, представляющий человека.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;

// Constructors

// Getters and Setters

    /**
     * Переопределение метода toString для вывода информации о человеке.
     */

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Переопределение метода equals для сравнения объектов типа Person.
     */

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /**
     * Переопределение метода hashCode для вычисления хэш-кода объекта.
     */

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Преобразование объекта Person в формат JSON.
     * @return строка в формате JSON
     */

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    /**
     * Преобразование строки JSON в объект типа Person.
     * @param json строка в формате JSON
     * @return объект типа Person
     */

    public static Person fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Person.class);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}