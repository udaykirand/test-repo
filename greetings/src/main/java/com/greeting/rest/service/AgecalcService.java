package com.greeting.rest.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.greeting.rest.model.Birthday;
 

@Service
public class AgecalcService {

	public Birthday calculateAge(String dob){
		System.out.println("in age method "+dob);
		Period p1 = null;
		Period p2 = null;
		Birthday birthDay = new Birthday();
		
		LocalDate today =LocalDate.now();
		
			Date javaDate;
			try {
				javaDate = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
			
		
		System.out.println("javaDate: "+javaDate);
		Instant instant = Instant.ofEpochMilli(javaDate.getTime());
		LocalDate dateOfBirth= LocalDateTime.ofInstant(instant, ZoneId.systemDefault())
	        .toLocalDate();
		
		/*DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateOfBirth=LocalDate.parse(dob,dateTimeFormatter);*/
		LocalDate nextBday=dateOfBirth.withYear(today.getYear());
		System.out.println("nextBday: "+nextBday);
		if(nextBday.isBefore(today)||nextBday.isEqual(today)){
			nextBday=nextBday.plusYears(1);
		}			
		//p= Period.between(nextBday, today);
		p1= Period.between(today, nextBday);
		p2 =Period.between(dateOfBirth, today);
		birthDay.setAgeYear(p2.getYears());
		birthDay.setAgeMonth(p2.getMonths());
		birthDay.setAgeMonth(p2.getDays());
		birthDay.setNextDobMonths(p1.getMonths());
		birthDay.setNextDobMonths(p1.getDays());
		
		System.out.println("Age: "+p2.getYears()+" Years"+ p2.getMonths()+" months "+p2.getDays()+" days");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return birthDay;
	
	}
/*public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AgecalcService a =new AgecalcService();
	//a.calculateAge("16-01-1988");
	System.out.println("age: "+a.calculateAge("25-12-1988"));

	}*/


}