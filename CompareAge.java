package Day5;

public class CompareAge {
	public static void main(String[]args) {
		int age1 = 45;
		int age2 = 50;
		int age3 = 5;
		if(age1>age2&&age1>age3) {
			System.out.println(age1+" is greater");
		}
		else if(age2>age3&&age2>age1) {
			System.out.println(age2+" is greater");
		}
		else {
			System.out.println(age3+" is greater");
		}
	}

}
