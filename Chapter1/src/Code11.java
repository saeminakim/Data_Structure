import java.util.Scanner;

public class Code11 {
/*
 * ����ڷκ��� ���� ������ ���� n�� �Է¹޴´�. 
 * �̾ n���� ������ �Է¹޾� ������� �迭�� �����Ѵ�.
 * �׷� ���� �ߺ��� ���� ���� ������ ī��Ʈ�Ͽ� ����϶�.
 * ���� ��� n = 6�̰� �Էµ� �������� 2, 4, 2, 4, 5, 2�̸�
 * �ߺ��� �������� (2, 2), (2, 2), (2, 2), (4, 4)�� ��� 4���̴�.  => ����
 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		
		kb.close();
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) { // i < j
				// j = i + 1�� �����ָ� �׻� ���� ������ �� ���� ���� ����
				// ex) i = 0, j = 0�� ��, j = 0, i = 0�� �� �� ���� ī��Ʈ��
				// data[i] data[j]�� ���� �˻��� �� ����
				if(data[i] == data[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
