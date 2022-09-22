package Day5;

public class CheckVowels {
	public static void main(String[]args) {
		String fruit = "Apple";
		if(fruit.contains("a")||fruit.contains("e")||fruit.contains("i")||fruit.contains("o")||fruit.contains("u")) {
		System.out.println(fruit+" contains");
		}
		else {
			System.out.println(fruit+" not contains");
		}
	}

}
