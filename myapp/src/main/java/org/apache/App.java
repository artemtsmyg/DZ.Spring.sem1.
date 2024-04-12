package org.apache;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Артём");
        person.setLastName("Цмыг");
        person.setAge(34);


        System.out.println("Person info: " + person.toString());

        // Пример сравнения двух объектов Person
        Person person2 = new Person();
        person2.setFirstName("Жанна");
        person2.setLastName("Сергеева");
        person2.setAge(25);

        System.out.println("Are persons equal? " + person.equals(person2));

        // Преобразование объекта Person в JSON
        String json = person.toJson();
        System.out.println("Person JSON: " + json);

        // Преобразование JSON в объект Person
        Person personFromJson = Person.fromJson(json);
        System.out.println("Person from JSON: " + personFromJson.toString());

        // Пример использования hashCode
        System.out.println("Person hashCode: " + person.hashCode());
    }
}
