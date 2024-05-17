package javaInstanceAndStatic240517;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calulator cal1 = new Calulator(10, 20);
		
		int result1 = cal1.add(10, 20);
		
		System.out.println(result1);
		
		Calulator.thirdNum = 10;
		cal1.thirdNum =10;
		
		int result2 = Calulator.minus(20, 10);
		System.out.println(result2);

	}

}
