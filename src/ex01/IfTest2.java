package ex01;

public class IfTest2 {

	public static void main(String[] args) {
		
		boolean  man1  = false;
		
		if( man1 == true  )
			System.out.println("남자");
		else
			System.out.println("여자");
		
		String   gender = "";
		gender = ( man1 == true ) ? "남자" : "여자"; 
		System.out.println("결과:" + gender);

	}

}






