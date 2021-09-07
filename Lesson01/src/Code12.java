import java.util.Scanner;

public class Code12 {
/*
 * n���� ������ �Է¹޾� �迭�� �����Ѵ�.
 * �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ� ���� �� �ִ� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int maxSum = 0;
		
		// �� ���� ����� �ƴ����� ���ʴܰ迡���� �̰� �ּ�
		// ��� 1
//		for(int i = 0; i < n; i++) { // i�� ������
//			for(int j = i; j < n; j++) { // j�� ����
//				// add data[i]...data[j] ������ ���� ���� ����
//				// if the sum > max
//				// max = the sum;
//				
//				int sum = 0;
//				
//				for(int k = i; k <=j; k++)
//					sum += data[k];
//				
//				if (sum > maxSum)
//					maxSum = sum;
//			}
//		}
		
		// ��� 2
		// �� �ڵ��� ��� i���� j������ ���� ���ϰ�, j++�� ���� �� i���� j������ ���� ���ϱ� ������ �������� ����� ���� �ϰ� ��
		for(int i = 0; i < n; i++) { // i�� ������
			int sum = 0;
			for(int j = i; j < n; j++) { // j�� ����

					sum += data[j];

				if (sum > maxSum)
					maxSum = sum;
			}
		}
		System.out.println("The max sum is " + maxSum);
	}

}
