package less6;

public class Person {
    String name;
    String surname;
    String age;
    String gender;
    String profession;
    String city;

    public Person(String Name, String Surname, String Age, String Gender, String Profession, String City) {
        this.name = Name;
        this.surname = Surname;
        this.age = Age;
        this.gender = Gender;
        this.profession = Profession;
        this.city = City;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", name, surname, age, gender, profession, city);
    }

    @Override
    public boolean equals(Object arg) {
        if (arg == null)
            return false;
        if (!(arg instanceof Person))
            return false;
        Person anothPerson = (Person) arg;
        return name.equals(anothPerson.name) && surname.equals(anothPerson.surname) && age.equals(anothPerson.age) && gender.equals(anothPerson.gender) && profession.equals(anothPerson.profession) && city.equals(anothPerson.city);
    }

    @Override
    public int hashCode() {
        Object[] m = {name, surname, age, gender, profession, city};
        int res = 1;
        for (Object x : m) {
            res = 31 * res + x.hashCode();
        }
        return res;
    }
}
