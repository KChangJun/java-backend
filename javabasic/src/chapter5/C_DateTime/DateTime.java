package chapter5.C_DateTime;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
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
		LocalTime localTimeOf = LocalTime.of(4, 2, 22);
		System.out.println(localTimeOf);
		
		// LocalDateTime class
		// 날짜와 시간을 관리해주는 class
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println(localDateTimeOf);
		
		
		// 특정 날짜 혹은 시간 가져오기
		// .getXXX();
		int year = localDateTime.getYear();
		int month = localDateTime.getMonthValue();
		Month enumMonth = localDateTime.getMonth();
		int dayOfYear = localDateTime.getDayOfYear();
		System.out.println(dayOfYear); //1월 1일부터 지금 몇일 지났는가
		int dayOfMonth = localDateTime.getDayOfMonth();
		DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
		System.out.println(dayOfWeek); // 일주일중 무슨 요일인가
		
		boolean isLeapTear = localDate.isLeapYear(); //윤년 표시해주는거
		
		int hour = localDateTime.getHour(); //현재시간
		int minute = localDateTime.getMinute();//현재 분
		int second = localDateTime.getSecond();//현재 초
		int nano = localDateTime.getNano();//현재 나노초
		
		// 특정 날짜 및 시간 변경 (직접 변경, 더하기, 빼기)
		// 직접 변경 : withXXX(int타입 데이터);
		// 더하기 - 빼기 : plusXXX(long 타입 데이터), minusXXX(long 타입 데이터);
		localDateTime = localDateTime.withYear(2012).plusWeeks(4).minusHours(9);
		localDateTime = localDateTime.withDayOfYear(1).plusMinutes(50).minusNanos(50000);
		System.out.println(localDateTime.withYear(2012).plusWeeks(4).minusHours(9));// 지금 현재 기준에서 년이 2012로, 4주를 더해서 9시간을 뺸것. 현재 기준!
		
		Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();		// 위에서 변경한 시간을 인스턴트화 시키는것
		Date datetime = Date.from(instant); // 인스턴스화 시킨것을 다시 Date 클래스의 형태로  바꾼것
		System.out.println(datetime);   
	}

}
