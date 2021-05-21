import java.util.*;
class Day_6_Emp_wages{
	public static final int part_time=1;
	public static final int isFull_time=2;
	public static final int emp_rate_per_hrs=20;
	public static final int num_of_work=2;
	public static final int max_hrs_in_month=100;
	public static void main(String args[]){
		int emp_hrs=0;
		int total_emp_hrs=0;
		int total_working_day=0;
		while(total_emp_hrs<=max_hrs_in_month && total_working_day<num_of_work){
			total_working_day++;	
		  	int check=(int)Math.floor(Math.random()*10)%3;
		  	switch(check)
			{
				case 1: System.out.println("employees is part time hours");
				emp_hrs=4;
				break;
				case 2: System.out.println("employee is Full time hours");
				emp_hrs=8;
				break;
				default: System.out.println("the employee is obsent");
				emp_hrs=0;
			}
		  total_emp_hrs+=emp_hrs;
		  System.out.println("days : "+total_working_day +" "+"employee hour"+" "+emp_hrs);
		}
		int total_emp_wages=total_emp_hrs*emp_rate_per_hrs;
		System.out.println("Total employee wages"+" "+total_emp_wages);
	}
}
