package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * input.txt��� ���Ϸκ��� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� �����ϰ� ����Ѵ�. 
 */

public class Code19 {

	public static void main(String[] args) {
		
		String[] name = new String[1000];
		String[] number = new String[1000];
		int n = 0;  // �ο� ��
		
		try {
			Scanner inFile = new Scanner(new File("input.txt"));

			while(inFile.hasNext()) { // detect end of file
				name[n] = inFile.next();
				number[n] = inFile.next();				
				n++;
			}

			inFile.close();

		} catch (FileNotFoundException e) {

			System.out.println("No file");
			System.exit(9); // exit code 0 �������� exit code 1 ����������
		}

		for(int i = 0; i < n; i++) {
			System.out.println(name[i] + " : " + number[i]);
		}

	}

}
