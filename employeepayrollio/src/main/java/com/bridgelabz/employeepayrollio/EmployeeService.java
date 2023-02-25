package com.bridgelabz.employeepayrollio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EmployeeService {

	public static void main(String[] args) {

		EmployeePayroll employee = new EmployeePayroll();
		Scanner scan = new Scanner(System.in);

		System.out.print(" Please enter the name of the employee: ");
		String name = scan.next();

		System.out.print(" Please enter the id of the employee: ");
		int id = scan.nextInt();

		System.out.print(" Please enter the salary of the employee: ");
		double salary = scan.nextDouble();

		employee.setName(name);
		employee.setId(id);
		employee.setSalary(salary);

		System.out.println(employee);

		Path path = Paths.get("src\\main\\java\\com\\bridgelabz\\employeepayrollio\\file");
		FileServices.doesFileExist(path);

		FileServices.deleteFile(path);

		FileServices.createDirectory(Paths.get("src\\main\\java\\com\\bridgelabz\\employeepayrollio\\file"));

		FileServices.createFile(path);

		FileServices.listFiles(Paths.get("src/main/com//bridgelabz//employeepayrollio/"));
		scan.close();

	}
}
