package kata1_15_09_2022;

import java.time.LocalDate;

public class Kata1_15_09_2022 {

    public static void main(String[] args) {
       LocalDate date = LocalDate.of(1949, 9, 24);
       
       Person person = new Person("Blas", date);
       System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
}
