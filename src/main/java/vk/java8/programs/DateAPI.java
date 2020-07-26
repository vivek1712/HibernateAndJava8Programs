package vk.java8.programs;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Set;

public class DateAPI {
public static void main(String arg[]){
	LocalDate ld=LocalDate.now();
	
	//SimpleDateFormat sd=new SimpleDateFormat("mm-dd-yy");
	//sd.format(ld);
	System.out.println("Local date now                                              : "+ld);
	
	System.out.println("Local date of -LocalDate.of(2020,05,15)                     : "+LocalDate.of(2020,05,15));

	System.out.println("Local date parse -LocalDate.parse('2020-05-15')             : "+LocalDate.parse("2020-05-15"));

	LocalDate tomorrow = LocalDate.now().plusDays(1);
	System.out.println("Local date of tomorrow LocalDate.now().plusDays(1)          : "+tomorrow);
	LocalDate yesterday = LocalDate.now().minusDays(1);
	System.out.println("Local date of yesterday use LocalDate.now().minusDays(1)    : "+yesterday);
	LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);

	System.out.println("previous month same day LocalDate.now().minus(1, ChronoUnit.MONTHS)    :"+previousMonthSameDay);
	DayOfWeek sunday = LocalDate.parse("2020-05-15").getDayOfWeek();
	System.out.println("Day of week   LocalDate.parse('2020-05-15').getDayOfWeek()  :"+sunday);
	int twelve = LocalDate.parse("2020-05-15").getDayOfMonth();
	System.out.println(" get Day of moth LocalDate.parse('2020-05-15').getDayOfMonth()  :"+twelve);
    System.out.println("This year leap year or not boolean  LocalDate.now().isLeapYear():"+LocalDate.now().isLeapYear());
    boolean notBefore = LocalDate.now().isBefore(LocalDate.parse("2020-05-16"));
    System.out.println("LocalDate.now().isBefore(LocalDate.parse('2020-05-14')          :"+notBefore);
    		  //.isBefore(LocalDate.parse("2016-06-11"));
    boolean isAfter = LocalDate.now().isAfter(LocalDate.parse("2020-05-14"));
    
    System.out.println(" i after LocalDate.now().isAfter(LocalDate.parse('2020-05-14')  :"+isAfter);
    
    LocalDateTime beginningOfDay = LocalDate.parse("2020-05-15").atStartOfDay();
    System.out.println("begiing of day LocalDate.parse('2020-05-15').atStartOfDay()     :"+beginningOfDay);
    
    LocalDate firstDayOfMonth = LocalDate.parse("2020-05-15")
    		  .with(TemporalAdjusters.firstDayOfMonth());
    
    System.out.println("first day of month   :"+firstDayOfMonth);
    
    System.out.println("");
    System.out.println("--------------------------Time------------------------");
    LocalTime now = LocalTime.now();
    System.out.println("local time LoclaTime.now()    :"+now);
    LocalTime sixThirty = LocalTime.parse("06:30");
    System.out.println("Local time parse              :"+sixThirty);
    
    LocalTime next1hr = LocalTime.now().plus(1, ChronoUnit.HOURS);
    System.out.println("local next one hour  LocalTime.now().plus(1, ChronoUnit.HOURS) :"+next1hr);
    
    System.out.println("");
    System.out.println("--------------------------DATE And Time------------------------");
    
    System.out.println("Local Date and time LocalDateTime.now() : "+LocalDateTime.now());
    
    //System.out.println("increase one day localDateTime.plusDays(1) :" +localDateTime.plusDays(1));
    
    System.out.println("");
    System.out.println("--------------------------Zone------------------------");
    ZoneId zoneId = ZoneId.of("Europe/Paris");
    System.out.println("Zone Id ZoneId zoneId = ZoneId.of('Europe/Paris') :"+zoneId);
    Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
    System.out.println("-----All zone list ----");
    /*for(String zo:allZoneIds){
    	System.out.println(zo);
    }*/
    
    LocalDateTime localDateTime =LocalDateTime.now();
    System.out.println("ISO Date  localDateTime.format(DateTimeFormatter.ISO_DATE): "+ localDateTime.format(DateTimeFormatter.ISO_DATE));
    
    
    System.out.println("Date Format  localDateTime.format(DateTimeFormatter.ofPattern('yyyy/MM/dd'))  : "+localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
    
    
    
    
    
}
}
