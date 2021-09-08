import java.util.Scanner;

public class Code13 {
	/*
	 * n���� ���� �ƴ� �� �ڸ� ������ �Է¹޾� �迭�� �����Ѵ�.
	 * �̵� �ֿ��� 1�� �̻��� ���ӵ� ������ ���Ͽ� ���� �� �ִ� �Ҽ��� �߿���
	 * �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�. 
	 * ex) 7 1 3 �� �ִٸ� �� ���ڸ� ���ϴ°� �ƴ� 713���� �ؼ�
	 */
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] data = new int[n];

		for(int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();

		int max = 0;
		for (int i = 0; i < n; i++) { // i�� �����, ������
			for (int j = i; j < n; j++) { // j�� ����

				// convert data[i]...data[j] into an integer
				int val = 0;
				for (int k = i; k <= j; k++) 
					val = val * 10 + data[k]; 
					// ���ڸ� ���ڸ��� �÷��ٷ��� val�� 10�� ���ϰ� �� ���ڸ� �����ָ� ��!! �̱���
					// ex) 2 9 3 �� �ִ�ġ�� 
					// ó�� val�� ���� 0 * 10 + 2 = 2
					// 2 * 10 + 9 = 29
					// 29 * 10 + 3 = 293 
					// ¯ �ű��ϴٿ�............ 

				// test if it is a prime �Ҽ����� �˻�
				// ������ 1���� ū ��쿡�� if�� Ÿ�� �ǰ� val = 1 �� ���� �� Ž
				boolean isPrime = true;
				for(int k = 2; k*k <= val; k++) {
					if (val % k == 0)
						isPrime = false;
				}
				
				// if yes, compare to the max
				// �׷��� ���⼭ val = 1 �� ���� ��츦 �����ִ� ��
				if(isPrime && val > 1 && val > max) {
					max = val;
				}
			}
		}
		if (max > 0)
			System.out.println(max);
		else
			System.out.println("No prime number");
	}

}
