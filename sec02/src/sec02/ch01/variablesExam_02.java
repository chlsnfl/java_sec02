package sec02.ch01;

public class variablesExam_02 {

	public static void main(String[] args) {
		/*
		 * 리터럴3 ,5를 대입하여 3시간 5분 출력
		 * 위 3시간 5분은 총 몇 분인지 출력 
		 * */
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int total = hour * 60 + minute;
		System.out.println("총" + total + "분 입니다.");

			int num = 200;
			int num2 = 013; //8진법
			int num3 = 0xf; //16진법
			System.out.println(num);
			System.out.println(num2);
			System.out.println(num3);
	}

}
