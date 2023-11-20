package lesson23;

public class Chef2301 extends Worker2301 {
    public static final String CHEF = "料理人";

    public Chef2301(String name, int age) {
        super(CHEF, name, age);
    }

    public void doWork() {
        System.out.println("食事を作ります");
    }
}
