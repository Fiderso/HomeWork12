import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan "; // Задача 1
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        System.out.println();

        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase()); // Задание 2

        System.out.println();

        String fulName = "Иванов Семён Семёнович"; // Задача 3
        String fuName = fulName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника — " + fuName);

    }
}