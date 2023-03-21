package ch03;
import java.util.Scanner; //java util scanner를 import
public class ScannerExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //scanner를 생성하고 변수에 담는다.
//		String inputData = scanner.nextLine(); //scanner를 이용해 키보드 값을 읽는다.
//		
//		System.out.print("x 값을 입력 : ");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
//
//		
//		System.out.print("y값 입력: ");
//		String strY = scanner.nextLine();
//		int y = Integer.parseInt(strY);
//		
//		int result = x + y;
//		System.out.println("x + y = " + result);
//		System.out.println("++++++++++The ENd+++++++++");
		while(true) {
			System.out.println("문자를 입력하세요. : ");
			String str = scanner.nextLine();
			if (str.equals("q")) {
				System.out.println("java를 정지합니다.");
				break;
			}
			System.out.println(str);
			System.out.println();
			
		}
	}

}
