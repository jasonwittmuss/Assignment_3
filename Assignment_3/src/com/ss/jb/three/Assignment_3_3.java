package com.ss.jb.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// This class takes a file from the command line and counts the number of e's
// The character it checks for is hard coded and can be changed
public class Assignment_3_3 {
	public static void main(String[] args) {
		String filename = args[0];
		char character = 'e';

		int count = countCharacter(filename, character);

		System.out.println("The number of " + character + "'s in this file is " + count);
	}

	public static int countCharacter(String filename, char character) {
		int count = 0;
		try {
			// Open file
			File file = new File(filename);
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine()) {
				// Read each line
				String line = reader.nextLine();
				for (int i = 0; i < line.length(); i++) {
					// Check each character and add it to the count
					if (line.charAt(i) == character) {
						count++;
					}
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
		}

		return count;
	}
}
