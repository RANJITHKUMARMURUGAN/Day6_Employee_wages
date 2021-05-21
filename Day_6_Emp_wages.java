import java.util.*;
class Day_6_Emp_wages{
	public static void main(String args[]){
		int part_time=1;
		int isFull_time=2;
		int emp_rate_per_hrs=20;
		int emp_hrs=0;
		int emp_wages=0;
		double check=Math.floor(Math.random()*10)%2;
		if(part_time==check){
			emp_hrs=4;
		}
		else if(isFull_time==check){
			emp_hrs=8;
		}
		else{
			emp_hrs=0;
		}
		emp_wages=emp_hrs*emp_rate_per_hrs;
		System.out.println(emp_wages);
	}
}
