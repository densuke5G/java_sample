package lesson23;

public class Teacher2301 extends Worker2301 {
    public static final String TEACHER = "教師";

    public Teacher2301(String name, int age) {
        super(TEACHER, name, age);
    }

    public void doWork() {
        System.out.println("知識を教えます");
    }
}
