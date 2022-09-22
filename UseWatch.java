package Day5;

public class UseWatch {
	public static void main(String[]args) {
	Watch watch1 = new Watch();
	watch1.price = 200;
	watch1.colour = "white";
	watch1.brand = "Shockn";
	watch1.taxAmount = 50;
	
	Watch watch2 = new Watch();
	watch2.price = 300;
	watch2.colour = "Black";
	watch2.brand = "Sonata";
	watch2.taxAmount = 100;
	
	Watch watch3 = new Watch();
	watch3.price = 400;
	watch3.colour = "Grey";
	watch3.brand = "Titan";
	watch3.taxAmount = 150;
	
	if(watch1.price>watch2.price) {
		System.out.println(" watch1.Brand");
	}
	else {
		System.out.println(watch2.brand);
	}
	System.out.println(" ");
	if(watch1.price>watch2.price&&watch1.price>watch3.price) {
		System.out.println(watch1.brand+" "+(watch1.price+watch1.taxAmount));
	}
	else if(watch2.price>watch3.price&&watch2.price>watch1.price) {
		System.out.print(watch2.brand+" "+(watch2.price+watch2.taxAmount));
	}
	else {
		System.out.println(watch3.brand+" "+(watch3.price+watch3.taxAmount));
	}
	}
	}
	
	


