package lesson14;

public class Human1406 {
	
	public String sayFullName(String sei, String mei) {
		String fullName = sei + mei;
		return fullName;
	}
	
	
	public double calcBMI(double weight, double height) {
		double bmi = weight / ((height / 100) * (height / 100));
		return bmi;
	}
}
