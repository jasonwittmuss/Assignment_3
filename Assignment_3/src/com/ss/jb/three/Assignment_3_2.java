package com.ss.jb.three;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_3_2 {
	// Command line argument for the name of the file you want to append text to
	public static void main(String[] args) {
		if (args.length == 1) {
			appendToFile(args[0]);
		} else {
			System.out.println("Please include the name of a file to append");
		}
	}

	private static void appendToFile(String filename) {
		// Open file and get user input for what to append to file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));) {
			Scanner input = new Scanner(System.in);

			// Get input from user
			System.out.println("What text would you like to append to the file?");
			String text = input.nextLine();

			// Create a newline then apppend text
			writer.newLine();
			writer.append(text);

			input.close();
		} catch (IOException e) {
			System.out.println("The file given cannot be opened");
			e.printStackTrace();
		}
	}
}
