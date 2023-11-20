package lesson23;

public class Police2301 extends Worker2301 {
	public static final String POLICE = "警察官";

    public Police2301(String name, int age) {
        super(POLICE, name, age);
    }

    public void doWork() {
        System.out.println("地域や人々の安全を守ります");
    }
}
