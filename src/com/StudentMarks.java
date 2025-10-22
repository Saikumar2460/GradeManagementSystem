package com;
import java.util.Iterator;
	import java.util.Scanner;

	public class StudentMarks 
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter How many Students Details Do You want");
			int n = sc.nextInt();
			String[] names = new String[n];
			System.out.println("Enter Student Names");
			for(int i=0;i<=names.length-1;i++)
			{
				names[i]=sc.next();
			}

			System.out.println("How many subjects do you enter");
			int subcount = sc.nextInt();
			int[][] marks = new int[n][subcount];
			for(int i=0;i<=marks.length-1;i++)
			{
				System.out.println("Enter "+(i+1)+" Student Marks");
				for(int j=0;j<=marks[i].length-1;j++)
				{
					marks[i][j]=sc.nextInt();	
				}
			}
			
			double[] a=averageMarks(marks, subcount);
			char[] c = grades(a, n);
			for(int i=0;i<=marks.length-1;i++)
			{
				System.out.println(names[i]+" Details :" );
				System.out.print("Student Marks :" );
				for(int j=0;j<=marks[i].length-1;j++)
				{
					System.out.print(marks[i][j]+" ");
				}
				System.out.println();
				System.out.println("Average Marks : "+a[i]);
				System.out.println("Grade : "+c[i]);
				System.out.println();
			}
			
			
			
			
		}
		public static double[] averageMarks(int[][] marks,int a)
		{
			double[] avgMarks = new double[marks.length];
	
			int i=0;
			for(int[] rows : marks)
			{
				int totalMarks = 0;
				for(int mark : rows)
				{
					totalMarks = totalMarks+mark;
				}
				double avg = totalMarks/a;
				avgMarks[i++]=avg;
			}
			return avgMarks;
		}
		public static char[] grades(double[] a,int b)
		{
			char[] grad = new char[b];
			int i=0;
			for(double avg : a)
			{
				if(avg>=90 && avg<=100)
				{
					grad[i++]='A';
				}
				else if(avg>=75 && avg<=89)
				{
					grad[i++]='B';
				}
				else if(avg>=35 && avg<=74)
				{
					grad[i++]='C';
				}
				else
				{
					grad[i++]='E';
				}
			}
			return grad;
		}
		
	}


