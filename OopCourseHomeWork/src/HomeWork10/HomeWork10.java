package HomeWork10;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack", 20, "工程师", 3,20000);
        Doctor doctor1 = new Doctor("jack", 20, "工程师", 3,20000);

        System.out.println(doctor.equals(doctor1));

    }
}
