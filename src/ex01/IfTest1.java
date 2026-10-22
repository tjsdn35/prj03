package ex01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class IfTest1 {

	public static void main(String[] args) {
		
		
		// 아침         : 9~11 시
		// 점심         : 11시~15시
		// 브레이크타임 : 15시~17시 
		// 저녁         : 17시~20시
		
		// 컴퓨터의 시간을 가져온다 : class 를 사용해서
		LocalDateTime   now  =  LocalDateTime.now();
		System.out.println( now );
		System.out.println( now.getHour() );
		
		
		int     hour      =  now.getHour(); //12;
		String  mealTime  =  "";
		
		if( 9 <= hour && hour <= 11 ) {
			mealTime = "아침식사시간입니다";
		} else {
			if( 11 < hour && hour < 15   ) {
				mealTime = "점심식사시간입니다";
			} else {
				if( 15 <= hour && hour <= 17 ) {
					mealTime = "브레이크 타입입니다";
				} else {
					if( 18 <= hour && hour <= 20  ) {
						mealTime = "저녁식사시간입니다";
					}  else {
						
					}					
				}
			}
		}
		
		System.out.println(  mealTime );
		//---------------------------------------------
		
		int     year   = now.getYear();
		int     month  = now.getMonthValue();
		int     day    = now.getDayOfMonth();
	
		int     val    = now.getDayOfWeek().getValue();  // 1(월)~7(일)
		String  wkday  = "수";
		
		System.out.println( now.getMonth()     ); 
		System.out.println( now.getMonthValue() );
		
		System.out.println( "년도:"  +  year   +   "년"  );
		System.out.println( "월:"    +  month  +   "월"  );
		System.out.println( "일:"    +  day    +   "일"  );
		System.out.println( "요일:"  +  val    +   "요일");
		System.out.println( "요일:"  +  wkday  +   "요일"  );

	}

}















