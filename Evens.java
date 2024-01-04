// Jose Guzman
// October 19, 2023
// Created a method that counts the even values and returns the count
// File name: Evens.java
// To Compile in terminal type: javac Evens.java
// To Run in terminal type: java Evens
import java.util.Scanner;
public class Evens
{
	public static int countEvens()
	{
		int value = 0, count = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter an integer, enter 0 to stop:");
		value = keyboard.nextInt();

		while (value != 0)
		{
			if (value %2 == 0)
				count++;

			System.out.print("Please enter an integer, enter 0 to stop:");
			value = keyboard.nextInt();
		}
		return count;
	}

	public static void main(String args[])
	{
		int numEvens = countEvens();
		System.out.println("You entered " + numEvens + " even values");
	}
}

/*
Please enter an integer, enter 0 to stop:1
Please enter an integer, enter 0 to stop:2
Please enter an integer, enter 0 to stop:3
Please enter an integer, enter 0 to stop:4
Please enter an integer, enter 0 to stop:5
Please enter an integer, enter 0 to stop:6
Please enter an integer, enter 0 to stop:7
Please enter an integer, enter 0 to stop:8
Please enter an integer, enter 0 to stop:9
Please enter an integer, enter 0 to stop:0
You entered 4 even values
*/