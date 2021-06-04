package com.ss.jb.three;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

// List out all files and directories recursively given the directory path as a command line argument
public class Assignment_3_1 {

	public static void main(String[] args) {
		File directoryName = new File(args[0]);

		List<File> directory = listDir(directoryName);

		printDir(directory);
	}

	public static List<File> listDir(File directory) {
		// Open file
		File[] files = directory.listFiles();
		List<File> list = new ArrayList<File>();

		for (File file : files) {
			// For each file or directory, add it to the list
			list.add(file);
			if (file.isDirectory()) {
				// For directories, recursively call listDir and add it to the list
				list.addAll(listDir(file));
			}
		}

		return list;
	}

	public static void printDir(List<File> list) {
		// Prints the list of directories
		for (File e : list) {
			System.out.println(e);
		}
	}

}
