import java.util.Scanner;

public class Code14 {
/*
 * ����ڷκ��� n ���� ������ �Է¹��� �� ������������ ����(sort)�Ͽ� ����ϴ� �ڵ��̴�. 
 * ���� ����(bubble sort) �˰���
 * �ٷ� �� �ڸ� �����Ϳ� ũ�� �񱳸� �ݺ��ϴٺ��� ������������ ������ ��
 */
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] data = new int[n];

		for(int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		// bubble sort
		// for���� �� �� �� ���� �� ���ڸ��� ū ���� �ϳ��� ä������ ������ 
		// n-1������ ���� i-- �ϴ� ��
		for (int i = n - 1; i > 0; i--) { 
			
			// data[0] ... data[i] ���� ���� ū ���� �� �ڷ� ���ư��� ���� �������
			for (int j = 0; j < i; j++) {
				
				if(data[j] > data[j+1]) {
					// swap data[j] and data[j+1]
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
			
		}
		
		System.out.println("Sorted data: ");
		for (int i = 0; i <n; i++) {
			System.out.println(data[i]);
		}
		
		
	}

}
