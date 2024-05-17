package javaInstanceAndStatic240517;

import javax.management.remote.SubjectDelegationPermission;

public class Calulator {
	
	public int firstNum;  // 인스턴스멤버변수
	public int secondNum;
	
	public static int thirdNum;  // 정적멤버변수
	public static final double PI = 3.14159;  // 한 번 선언되면 변경 불가
	static final double SALERATE = 0.7; // 상수 선언
	
	public Calulator() {
		super();
	}
	
	public Calulator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		
	}
	
	public int add(int firstNum, int secondNum) {
		return this.firstNum + this.secondNum;
	}
	
	public static int minus(int firstNum, int secondNum) {
		return firstNum - secondNum;
		
	}
		
		

}
