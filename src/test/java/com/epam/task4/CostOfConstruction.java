package com.epam.task4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CostOfConstruction {

	public static void Evaluate() {
		Scanner sc= new Scanner(System.in);
		PrintStream ps=new PrintStream(new FileOutputStream(FileDescriptor.out));
		ps.println("Enter the estimated cost of construction");
		ps.println("Materials Available");
		ps.println("1. construction with standard materials");
		ps.println("2. construction with above standard materials");
		ps.println("3. construction with high standard materials");
		ps.println("4. construction with high standard materials and fully automated");
		ps.println("Enter any choice 1,2,3,4: ");
		try {
			int choice=sc.nextInt();
			ps.println("Enter houses area covered: ");
			switch(choice){
			case 1:
				ps.println("Cost ="+sc.nextDouble()*1200 +" INR");
			   break;
			case 2:
				ps.println("Cost ="+sc.nextDouble()*1500 +" INR");
				break;
			case 3:
				ps.println("Cost ="+sc.nextDouble()*1800 +" INR");
			   break;
			case 4:
				ps.println("Cost ="+sc.nextDouble()*2500 +" INR");
			   break;
			default:
				ps.println("Value entered is Invalid ");
				}
			}
		catch (Exception e) {
			ps.println("Please enter a valid input");
		}
		sc.close();
		ps.close();
	}
}