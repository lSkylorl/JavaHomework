package less6;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Person> workers = new ArrayList<>();
        
        Person work1 = new Person("Максим", "Шилов", "31", "муж", "Повар", "Москва");
        Person work2 = new Person("Роман", "Нефедов", "18", "муж", "веб-дизайнер", "Пермь");
        Person work3 = new Person("Елена", "Малышева", "62", "жен", "Сварщик", "Москва");
        Person work4 = new Person("Роман", "Елкин", "41", "муж", "Ученый", "Ижевск");
        Person work5 = new Person("Евгений", "Шилов", "21", "муж", "веб-дизайнер", "Орел");

        workers.add(work1);
        workers.add(work2);
        workers.add(work3);
        workers.add(work4);
        workers.add(work5);

        for (Person work : workers) {
            if (Integer.parseInt(work.age) > 20) {
                System.out.println(work);
            }
        }

        System.out.println(work2.name.equals(work4.name));
        System.out.println(work1.city.equals(work3.city));
        System.out.println(work4.profession.equals(work5.profession));
        System.out.println(work1.surname.hashCode());
        System.out.println(work5.surname.hashCode());
    }
}
