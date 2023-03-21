package ch03;

public class CastingExam {

	public static void main(String[] args) {
		int intValue = 103029770;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		intValue = 65;
		char charValue = (char) intValue;
		System.out.println(charValue);
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		double v10 = 1.0;
		int v11 = 2;
		double rs7 = v10 / v11;
		System.out.println(rs7);
		/*
		 * 자바는 true와 false가 따로 바련되어 있다.
		 * 즉 1true 0 false가 아니다
		 * 
		 * 
		 * 기본타입을 문자열로 변경 : String str = String.valueOf(기본타입변수);
		 * */
	}
}