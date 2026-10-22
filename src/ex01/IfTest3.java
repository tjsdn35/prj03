package ex01;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class IfTest3 {

	public static void main(String[] args) {

		// java.time.LocalDateTime  now = java.time.LocalDateTime.now();
		LocalDateTime  now    =  LocalDateTime.now();
		
		int            dayWk  =  now.getDayOfWeek().getValue();  // 1(월)~7(일)
		String         wkday  =  "";   // "月火水木金土日曜日";
		
		if( dayWk == 1 ) { 
			wkday = "月";			
		} else { 
			if( dayWk == 2 ) { 
				wkday = "火"; 
			} else {
				if( dayWk == 3 ) {
					wkday = "水";
				} else {
					if( dayWk == 4) {
						wkday = "木";
					} else {
						if( dayWk == 5 ) {
							wkday = "金";
						} else {
							if( dayWk == 6 ) {
								wkday = "土";
							} else {
								if( dayWk == 7) {
									wkday = "日";
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println( "한자로" + wkday  + "曜日");
		
		//-----------------------------------
		String  wkday2 = "";
		switch( dayWk ) {
		case 1: wkday2 = "월"; break;
		case 2: wkday2 = "화"; break;
		case 3: wkday2 = "수"; break;
		case 4: wkday2 = "목"; break;
		case 5: wkday2 = "금"; break;
		case 6: wkday2 = "토"; break;
		case 7: wkday2 = "일"; break;			
		} 
		System.out.println("한글로 " + wkday2 + "요일");
		
		//-------------------------------
		// 요일 객체 가져오기 (DayOfWeek)
        java.time.DayOfWeek dayOfWeek = now.getDayOfWeek();
        
        // 1. 한글 요일 출력 (예: 월요일, 화요일...)
        String koreanDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);
        System.out.println("한글 요일 (전체): " + koreanDay); // 출력: 수요일
        
        // 2. 배열을 활용
        //                   0     1     2     3    4    5     6     
        String [] dayStr = {"월", "화", "수", "목","금","토", "일" };
        
        System.out.println( dayStr[ dayWk - 1 ]  + "요일" );

	}

}












