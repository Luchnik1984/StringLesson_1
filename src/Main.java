public class Main {
    public static void main(String[] args) {
        // Задача 1.
        System.out.println("\nЗадача 1.");
        String lastName = "Ivanov";
        String firsName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firsName + " " + middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);

        // Задача 2.
        System.out.println("\nЗадача 2.");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " +
                fullName);

        // Задача 3.
        System.out.println("\nЗадача 3.");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}