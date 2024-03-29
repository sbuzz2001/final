/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tester;

/**
 *
 * @author sbuzz
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int id;
		String name;
		int yob;
		int systolic;
		int diastolic;
		
		//creating an arraylist to store data
		ArrayList <BloodPressure> users = new ArrayList <>();
		
		boolean bool = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(bool) {
			
			displayMenu();
			
			int input = sc.nextInt()	;
			
			switch(input) {
			
			case 0:
				
				bool = exit();
				break;
			case 1:
				create(users);
				break;
			case 2:
				System.out.println("User Details...");
				System.out.println("");
				index(users);
				break;
			case 3:
				System.out.println("Enter the User Number:");
				int usernum = sc.nextInt()	;
				System.out.println("User " + usernum + " Details");
				view(users,usernum);
				break;
			case 4:
				remove(users);
				break;
			}
			
			
		}
	}
	//methods declaring
		public static void displayMenu() {
			System.out.println("Menu...");
			System.out.println("1.Create a Record");
			System.out.println("2.Show All Users");
			System.out.println("3.Select a User");
			System.out.println("4.Delete All");
			System.out.println("0.Exit");
		}
		
		public static <T> void index(ArrayList <T> arrname) {
			for(int i = 0; i < arrname.size(); i++ ) {
				((BloodPressure) arrname.get(i)).display();
				
			}
			
		}

		

		public static boolean exit() {
			return false;
			
		}
		public static <T> void create(ArrayList <T> arrname) {

			System.out.println("How many users do you want to create?");
			
			//getting user input to get the number of users
			Scanner scin =new Scanner(System.in);
			
			//assigning the user input to a variable
			int create = scin.nextInt();
			
			//creating an object array using Tester class
				
				
			for(int i = 0; i < create; i++ ) {
				
				Scanner SC =new Scanner(System.in);
				
				System.out.println("Enter User ID:");
				int id = SC.nextInt();
				
				System.out.println("Enter User Name:");
				String uname = SC.next();
				
				System.out.println("Enter User Birth Year:");
				int yob = SC.nextInt();
				
				System.out.println("Enter User Systolic blood pressure");
				int systolic = SC.nextInt();
				
				System.out.println("Enter User Diastolic blood pressure");
				int diastolic = SC.nextInt();
				
				arrname.add( (T) new BloodPressure(id,uname,yob,systolic,diastolic));
				
				
				}
				
			}
		public static <T> void view(ArrayList <T> arrname, int number) {
			((BloodPressure) arrname.get(number - 1)).display();
		}
		
		public static <T> void remove(ArrayList <T> arrname) {
			for(int i = 0; i < arrname.size(); i++ ) {
				arrname.remove(i);
			}
		}
}
