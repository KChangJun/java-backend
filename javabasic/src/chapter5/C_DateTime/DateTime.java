package chapter5.C_DateTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

// 날짜 및 시간


public class DateTime {

	public static void main(String[] args) {

		// System.currentTimeMillis
		// 현재 시간을 long 타입으로 0.001초 단위로 표현
		// 1970년 1월 1일 기준
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		for(int count =0; count < 1000000000; count++) {
			count++;	
		
		}
		
		long endTime= System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		
		// Date class
		// 날짜를 관리 해주는 클래스
		// 주로 날짜와 관련된 데이터타입을 취급할 때 자주 사용
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getMonth());
		date.setHours(10);
		System.out.println(date);
		
		Date now= Date.from(Instant.now());
		System.out.println(now);
		
		Date minusTwoHour = Date.from(Instant.now().minus(2,ChronoUnit.HOURS));
		System.out.println(minusTwoHour);
		// Instant.now =현재시간
		// minus ()
		// ChronoUnit.Hours 시간을 .
		
		
		// SimpleDateFormat
		// Date 타입의 참조변수를 지정한 포맷의 문자열로 변경해주는 클래스
		// y: 연,  M: 월 d: 일, H:시간, m:분, s:초
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");
		String formatedDate = simpleDateFormat.format(now);
		System.out.println(formatedDate);
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HHHH.mmmmmm.sssss. HH:mm:ss");
		String formatedDate2 = simpleDateFormat2.format(now);
		System.out.println(formatedDate2);
		
		
		// Time Package
		// Date와 Calander 클래스의 단점 보완
		
		// LocalDate class
		// 날짜를 관리해주는 class
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDateOf = LocalDate.of(2022, 12, 22);
		System.out.println(localDateOf);
		
		// localTime class
		// 시간을 관리해주는 class
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime localTimeOf = LocalTime.of(4, 2, 22);
		System.out.println(localTimeOf);
		
		// LocalDateTime class
		// 날짜와 시간을 관리해주는 class
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println(localDateTimeOf);
	}

}
