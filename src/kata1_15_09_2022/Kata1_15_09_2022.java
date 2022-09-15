package kata1_15_09_2022;

import java.util.Date;

public class Kata1_15_09_2022 {

    public static void main(String[] args) {
        Person person = new Person("Zacarias", new Date(49,10,25));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
}
