package com.ComputerCourse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StaticCourse {
private static List<Employee> empList;
Employee emp;
	
	public  StaticCourse() throws ParseException{
		empList = new ArrayList<Employee>();
		String dt= "2020-03-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Calendar calender = Calendar.getInstance();
		for(int i=0; i<10; i++){
			emp = new Employee();
			emp.setName("Sapna");
			emp.setId("1");
			emp.setAge(23);
			calender.setTime(sdf.parse(dt));
			calender.add(Calendar.DATE, 10*i);
			dt = sdf.format(calender.getTime());
			emp.setDateOfjoining(dt);
			empList.add(emp);
		}
		
	}
	public static void main(String[] args) {
		try {
			StaticCourse course = new StaticCourse();
			employeeMap(empList);
			sortEmpByAge(empList);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
	private static Set<Employee> sortEmpByAge(List<Employee> emplist) {
     Set<Employee> empset = new HashSet<>();
     for(Employee emp :emplist){
    	 if(emp.getAge()>=30 && emp.getAge()<=40){
    		 empset.add(emp);
    	 }
     }
     return empset;
	}
	private static  Map<String, String> employeeMap(List<Employee> emplist) {
		Map<String,String> empMap = new HashMap<>();
		for(Employee emp :emplist){
			empMap.put(emp.getId(),emp.getName());
		}
		return empMap;
		
	}

}
