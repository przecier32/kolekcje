package examples;

public class Human {

    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getHuman() {
        return "Imie: " + name + " Nazwisko: " + surname + " Wiek: " + age;

    }
}
