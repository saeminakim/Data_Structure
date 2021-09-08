import java.util.Scanner;

public class Code15 {
/*
 * ����ڷκ��� n���� ������ �Է¹޴´�. 
 * ������ �ϳ��� �Էµ� ������ ������� �Էµ� �������� ������������ �����Ͽ� ����϶�. 
 * ordered list�� ���ο� �� insert�ϴ� �˰���
 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] data = new int[n];

		for(int i = 0; i < n; i++) {
			int tmp = kb.nextInt();
			
			int j = i - 1;
			
			// �迭�� �ں��� �˻��ؼ� �̹� �Էµ� ��(data[j])�� ���� �Էµ� ��(tmp)���� Ŭ ���
			// �̹� �Էµ� ���� �ڷ� �� �ڸ� �̿����� �� ���ڸ� ���� ��
			while(j >= 0 && data[j] > tmp ) {
				data[j+1] = data[j];
				j--;
			}
			
			// tmp�� data[j]���� ũ�ٸ� data[j+1]�� tmp�� �־���
			data[j+1] = tmp;
			
			for (int k = 0; k <= i; k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();
		}
		
		kb.close();	
		
	}

}
 