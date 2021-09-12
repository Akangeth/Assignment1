/*
 * Class: CMSC203 
 * Instructor: Professor Tsai
 * Description: Build an application that will step through some possible problems to restore 
   internet connectivity.  Assume that your computer uses wi-fi to connect to a router which
   connects to an Internet Service Provider (ISP) which connects to the Internet
 * Due: 09/12/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Allan Kangethe 
   */

import java.util.Scanner;

public class WiFiDiagnosis {
	public static void main(String[] args) {
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		//String Variables
		
		System.out.println("Hello User, it seems you are having a problem with internet connectivity");
		System.out.println("WiFi Diagnosis might work.\n");
		
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		//String Variable
		String answerToFirstQuestion = keyboard.nextLine();
		
		//First Question
		if(answerToFirstQuestion.equals("yes"))
		{
			System.out.print("Rebooting your computer seemed to work!");
			System.out.println("Glad we could assist you!");
			System.exit(0); //End Program

		}
		else
		{
			//Second Question
			
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			
			//String Variable
			String answerToSecondQuestion = keyboard.nextLine();
			
			if(answerToSecondQuestion.equals("yes"))
			{
				System.out.println("Rebooting your router seems to work!");
				System.out.println("Glad we could assist you!");
				System.exit(0); //End Program
			}
			else
			{
				//Third Question
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				
				//String
				String answerToThirdQuestion = keyboard.nextLine();
				
				if(answerToThirdQuestion.equals("yes"))
				{
					System.out.println("Fixing your cables into the routher seemed to work!");
					System.out.println("Glad we could assist you!");
					System.exit(0); //End Program

				}
				else
				{
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					
					//String Variable
					String answerToFourthQuestion = keyboard.nextLine();
					
					if(answerToFourthQuestion.equals("yes"))
					{
						System.out.println("Moving your computer closer to the router seemed to work!");
						System.out.println("Glad we could assist you!");
						System.exit(0); //End Program
					}
					else
					{
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");

					}
				}
			}
		}
	}
}
