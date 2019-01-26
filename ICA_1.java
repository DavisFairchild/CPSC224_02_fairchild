//package ica_1; //stuff for NetBeans

import java.util.Scanner; 
public class ICA_1 {
	public static void main(String[] args) {
            //set up variables and ask for meters, then run a loop which will
            //  continuously ask for conversions until 4 (exit) is input
		Scanner scnr = new Scanner(System.in);
		double meters;
		System.out.println("Enter a distance in meters: ");
		meters = scnr.nextDouble();
                
                //while loop to continuously search for input
                while(true){
                    menu();
                    int input;
                    input = scnr.nextInt();
                    if(input == 1){
                        showKilometers(meters);
                    }
                    else if(input == 2){
                        showInches(meters);
                    }
                    else if(input == 3){
                        showFeet(meters);
                    }
                    else if(input == 4){
                        System.out.println("Goodbye Guizani!");
                        System.exit(0);
                    }
                    else{
                        System.out.println("Invalid input.");
                    }
                }
	}
        //functions for conversion from meters to other unit
	public static void showKilometers(double meters) {
		double kilometers;
                kilometers = meters * 0.001;
		System.out.println(kilometers);
                System.out.print("\n");
	}
	public static void showInches(double meters) {
		double inches;
                inches = meters * 39.37;
		System.out.println(inches);
                System.out.print("\n");
	}
	public static void showFeet(double meters) {
		double feet;
                feet = meters * 3.281;
		System.out.println(feet);
                System.out.print("\n");
	}
        //prints options
	public static void menu() {
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
		System.out.println("Enter your choice (with the corresponding number):");
        }
}
