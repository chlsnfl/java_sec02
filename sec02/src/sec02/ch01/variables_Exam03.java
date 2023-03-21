package sec02.ch01;

public class variables_Exam03 {

	public static void main(String[] args) {
		int a = 0b1011; //2진수
		int b = 0206;
		int c = 365;
		int d = 0xb3;
		
		/*
		 * 2진수는 앞에 0b, 0B
		 * 8진수는 앞에 0
		 * 16진수는 앞에 0x, 0X
		 * long타입을 선언할 때 int의 한도를 넘는 수는 뒤에 l 또는 L을 붙인다.*/
		long num = 20;
		long num2 = 3000000000L;
		System.out.println(num + " " + num2);
		
		//java'' ""는 구별해야 한다.
		//char c = ''
		
		char c1 = 'A';
		char c2 = 65;
		
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}

}
