package com.epam.task4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleNCompoundInterest {
	public static void Calculator(){
		Scanner sc=new Scanner(System.in);
		PrintStream ps=new PrintStream(new FileOutputStream(FileDescriptor.out));
		ps.println("Enter the principle amount");
		try {
			double principal = sc.nextDouble();
			ps.println("Enter the time ");
			double time = sc.nextDouble();
			ps.println("Enter the rate of interest");
			double Rate=sc.nextDouble();
			ps.println("Simple Interest :"+(principal*time*Rate)/100);
			ps.println("Compound Interest :"+((principal*Math.pow(1+(Rate/100),time)-principal)));
			}
		catch (Exception e) {
			ps.println("Enter a valid input ... ");
		}
		sc.close();
		ps.close();
	}
}