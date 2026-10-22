package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncTest02 {
	// 전역 data
	// 입력 : 이름 전화 성별(1:남, 2:여) 태어난연도
	// 출력 : 이름 전화 성별:남자/여자   나이
	// 입력
	static String  name;
	static String  phone;
	static String  man;      // 성별(1:남, 2:여)
	static int     bYear;    // 계산
	
	// 출력
	static String  gender;   // 남자/여자
	static int     age;	  // 나이
	
	
	public static void main(String[] args) {
		
		input();
		process();
		output();
		System.out.println("end	...");
	}

	// input
	private static void input() {
		// 키보드 준비
		Scanner  in  =  new Scanner(System.in);
		
		// 입력 : 이름 전화 성별(1:남, 2:여) 태어난연도
		System.out.println("이름:");
		name         = in.nextLine(); // 문자열을 입력 받는다 엔터까지
		System.out.println("전화(010-1111-1111):");
		phone		 = in.nextLine();
		System.out.println("성별(1:남자 2:여자):");
		man			 = in.nextLine();
		System.out.println("태어난 연도(2000):");
		bYear        = in.nextInt();
		
	}

	// process
	private static void process() {
	    // 중요: 문자열비교는 == 로 하지 않는다
	    // man.equals("1") == true -> 글자가 같은지 비교
	    // man.compareTo("1") > 0  -> 글자의 순서비교
	   if( man.equals("1") )       // 틀린표현 man == "1"
		   gender = "남자";
	   
	   else
		   gender = "여자";
		
	   //-----------------------------------
	   // 나이
	   age   = calcAge(bYear);
	   
	}
	
	//나이계산 함수
	private static int calcAge(int bYear) {
		// 올해연도 tYear  =
		   LocalDate   now    = LocalDate.now();
		   int         tYear  = now.getYear();
		   
		   // 나이 = 올해연도 - 태어난 연도
		   int         result = tYear - bYear;
		   return   result;
	}
	
	
	
	// output
	private static void output() {
		System.out.println("이름   전화   성별    태어난 연도");
		System.out.printf("%s     %s      %s      %d", 
				           name,  phone,  gender, age
				);
	}

}
