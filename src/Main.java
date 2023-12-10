public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }
    public static void Task1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName+ " " + firstName + " " + middleName;
        System.out.println( "Ф. И. О. сотрудника — " + fullName);
    }

    public static void Task2(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName+ " " + firstName + " " + middleName;
        System.out.println( "Ф. И. О. сотрудника — " + fullName.toUpperCase());
    }

    public static void Task3(){

        String fullName = "Иванов Семён Семёнович";
        System.out.println( "Ф. И. О. сотрудника — " + fullName.replaceAll("ё", "е"));
    }

}