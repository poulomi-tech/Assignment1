package com.gl.week2;


class superDept {
	
	public String DepartmenttName() {
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "no work as of now";
	}
	public String getWorkDeadline() {
		return "Nil";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
 class AdminDepartment extends superDept{
		public String DepartmenttName() {
			return "Admin Department";
		}
	    public String getTodaysWork() {
			return "Complete your documents Submission";
		}	
	    public String getWorkDeadline() {
		return "Complete by EOD";
	}	
	}
	
 class HrDepartmemt extends superDept{
		public String DepartmenttName() {
			return "HR Department";
		}
	    public String getTodaysWork() {
			return "Fill today’s timesheet and mark your attendance";
		}	
	    public String getWorkDeadline() {
		return "Complete by EOD";
	}	
	    public String doActivity() {
	    	return "Team Lunch";
	    }
	}
	
	 class TechDepartment extends superDept{
		public String DepartmenttName() {
			return "Tech Department";
		}
	    public String getTodaysWork() {
			return "Complete coding of module 1";
		}	
	    public String getWorkDeadline() {
		return "Complete by EOD";
	}	
	    public String getTechStackInformation() {
	    	return "core Java";
	    }
	}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment obj1 = new AdminDepartment();
		System.out.println(obj1.DepartmenttName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		HrDepartmemt obj2 = new HrDepartmemt();
		System.out.println(obj2.DepartmenttName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
	    TechDepartment obj3 = new TechDepartment();
		System.out.println(obj3.DepartmenttName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
	}

}
