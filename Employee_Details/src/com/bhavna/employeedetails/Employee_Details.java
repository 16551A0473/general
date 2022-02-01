
//Employee class have EmpId,Name,Salary,employmentStatus,DeptName




package com.bhavna.employeedetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee_Details
{
	int empId;
    int departmentNumber;
	long salary;
	String name;
	String departmentName;
	String employementStatus;
	
	
	public Employee_Details(int empId, int departmentNumber, long salary, String name, String departmentName,
			                   String employementStatus) 
	{
 		this.empId = empId;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
		this.name = name;
		this.departmentName = departmentName;
		this.employementStatus = employementStatus;
	}


			public int getEmpId() 
			{
				return empId;
			}

			public int getDepartmentNumber() 
			{
				return departmentNumber;
			}


			public long getSalary() 
			{
				return salary;
			}


			public String getName()
			{
				return name;
			}

			public String getDepartmentName() 
			{
				return departmentName;
			}


			public String getEmployementStatus()
			{
				return employementStatus;
			}
			
			

			
			@Override
			public String toString() {
				return "Employee_Details [empId=" + empId + ", departmentNumber=" + departmentNumber + ", salary="
						+ salary + ", name=" + name + ", departmentName=" + departmentName + ", employementStatus="
						+ employementStatus + "]";
			}


			@SuppressWarnings("unused")
			public static void main(String[] args) 
			
			{
				@SuppressWarnings("unused")
				Employee_Details emp1 = new Employee_Details(470,1,23900,"Naresh","ECE","Active");
				Employee_Details emp2 = new Employee_Details(471,2,25700,"Suresh","CSE","Active");
				Employee_Details emp3 = new Employee_Details(472,3,28070,"Harish","ECE","Active");
				Employee_Details emp4 = new Employee_Details(473,4,30000,"Mahesh","IT","InActive");
				Employee_Details emp5 = new Employee_Details(474,5,53090,"Bhrath","ECE","Active");

		 
				List<Employee_Details> list = new ArrayList<>();
			
				list.add(emp1);
				list.add(emp2);
				list.add(emp3);
				list.add(emp4);
				list.add(emp5);

				System.out.println(" ");
				
				System.out.println("@@@@@@@@@@@@ = List of employees and their details =@@@@@@@@@@@@");
				
				System.out.println(" ");
				
				list.forEach((n)-> System.out.println(n.departmentNumber+ "   "+n.name+"   "+n.salary+ "   "+n.empId+"   "
						            
						                                     +n.departmentName+"   "+n.employementStatus));
				
				System.out.println(" ");
				
				
				//1.Write a program to print the employees whoese name starts with 'N'
				
				System.out.println("@@@@@@@@@ The employees whose name starts with N is : @@@@@@@@@@@@");
				
				System.out.println(" ");
				
				List<Employee_Details> result = list.stream().filter(n->n.name.startsWith("N")).collect(Collectors.toList());
	
				System.out.println(result);
				
				System.out.println(" ");
				
				
				
				//2.Write a Program to Print the employees details who are working in 'IT' Department
				
				
				System.out.println("@@@@@@@@@@@@   Employee details whose working in IT department is:   @@@@@@@@@@@@");
				
				System.out.println(" ");
				
				List<Employee_Details> result1 = list.stream().filter(n->n.departmentName=="IT").collect(Collectors.toList());
				
				System.out.println(result1);
				
				System.out.println(" ");
				
				
				//3.Write a program to print the employees whose salary is greater than 50000;
				
				System.out.println("@@@@@@@@@@@@   Employees whose salary is greater than 50000 is:   @@@@@@@@@@@@");
				
				System.out.println(" ");
				
				List<Employee_Details> result2 = list.stream().filter(n->n.salary > 50000).collect(Collectors.toList());
				
				System.out.println(result2);
				
				System.out.println(" ");
				
				
				//4.write a program to print the employee details who has the highest salary
				
				System.out.println("@@@@@@@@@@@@   Employee details who has highest salary is :   @@@@@@@@@@@@");
				
				System.out.println(" ");
				
				Employee_Details  result3 = list.stream().max((n1,n2)-> (n1.salary > n2.salary)? 1: -1).get();
				
				System.out.println(result3);
				
				System.out.println(" ");
				
				//5.write a program to print the employee details who has the lowest salary
				
				System.out.println("@@@@@@@@@@@@  Employee details who has lowest salary is :  @@@@@@@@@@@@");
				
				System.out.println(" ");
				
				Employee_Details  result4 = list.stream().min((n1,n2)-> (n1.salary > n2.salary)? 1: -1).get();

				System.out.println(result4);




				
				






				
				
				
				
				
				
			}


	 
	
	
	
	
	

}
