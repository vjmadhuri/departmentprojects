package com.vm.driver;

import com.vm.departments.AdminDepartment;
import com.vm.departments.HRDepartment;
import com.vm.departments.TechDepartment;


public class Drivermain {
	

	
		public static void  main(String[] args) {
			
			AdminDepartment objAdmn = new AdminDepartment();
			System.out.println("Welcome to " + objAdmn.departmentName());
			System.out.println(objAdmn.getTodaysWork());
			System.out.println(objAdmn.getWorkDeadline());
			System.out.println(objAdmn.isTodayAHoliday() + "\n");

			HRDepartment objHR = new HRDepartment();
			System.out.println("Welcome to " + objHR.departmentName());
			System.out.println(objHR.doActivity());
			System.out.println(objHR.getTodaysWork());
			System.out.println(objHR.getWorkDeadline());
			System.out.println(objHR.isTodayAHoliday() + "\n");
			System.out.println("");

			TechDepartment objTech = new TechDepartment();
			System.out.println("Welcome to " + objTech.departmentName());
			System.out.println(objTech.getTodaysWork());
			System.out.println(objTech.getWorkDeadline());
			System.out.println(objTech.getTechStackInformation());
			System.out.println(objTech.isTodayAHoliday());
		}
	}

	
