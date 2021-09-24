package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {
	
	static String[] words = new String[100000];
	static int[] count = new int[100000];
	static int n = 0;	

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("$ ");  // prompt 출력
			String command = kb.next();
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			}
			else if(command.equals("find")) {
				String str = kb.next();
				int index = findWord(str);
				if(index > -1) {
					System.out.println("The word \"" + words[index] + "\" appears " + count[index] + " times.");
				}
				else {
					System.out.println("The word " + str + " does not appear.");
				}
			}
			else if(command.equals("saveas")) {
				String fileName = kb.next();
				saveAs(fileName);
			}
			else if(command.equals("exit")) {
				break;
			}
		}
		
		kb.close();		

	}
	
	static void saveAs(String fileName) {
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			
			for(int i = 0; i < n; i++) {
				outFile.println(words[i] + " " + count[i]);
			}
			
			outFile.close();
		} catch (IOException e) {
			System.out.println("Save failed");
			return;
		}
	}
	
	static void makeIndex(String fileName) {
		
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next();
				
				addWord(str);				
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			return;
		}
				
		
	}
	
	static void addWord(String str) {
		int index = findWord(str);  // 찾으면 인덱스 반환, 못 찾으면 -1 반환
		
		if(index != -1) { // found  words[index] == index
			count[index]++;
		}
		else { // not found
			words[n] = str;
			count[n] = 1;
			n++;
		}		
	}
	
	static int findWord(String str) {
		for(int i = 0; i < n; i++) {
			if(words[i].equalsIgnoreCase(str)) {
				return i;
			}
//			if(words[i].equals(str)) {
//				return i;
//			}
		}
		return -1;
	}
}
