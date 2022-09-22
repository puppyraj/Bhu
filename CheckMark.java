package Day5;

public class CheckMark {
	public static void main(String[]args) {
		int mark = 81;
		if(mark>=0&&mark<=40) {
			System.out.println("E");
		}
		else if(mark>40&&mark<=60) {
			System.out.println("C");
		}
		else if(mark>60&&mark<=80) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
	}

}
