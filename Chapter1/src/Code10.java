
public class Code10 {
	/*
	 * 1 ~ 100000 ������ ��� �Ҽ��� ã�Ƽ� ����ϴ� ���α׷� 
	 */
	public static void main(String[] args) {

		for(int n = 2; n <= 100000; n++) {

			// 2, 3, ..., n/2������ ������ n�� �������� �� �������� ����
			// 2, 3, ..., root(n)������ ���� ��. �� sqrt(n)����

			boolean isPrime = true; // ���� n�� �Ҽ��� �ƴ϶�� ���Ű� ������ �ϴ� true

			// 1�� ���
			//		for (int i = 2; i <= n / 2; i++) {
			//			if (n % i == 0) {
			//				// not prime ����� �ƴ�
			//				// n�� �Ҽ��� �ƴ϶�� ���Ÿ� ���� 
			//				isPrime = false;
			//				break;
			//			}
			//		}

			// 2�� ���
			//		for (int i = 2; i <= n / 2 && isPrime; i++) {
			//			if (n % i == 0) 
			//				isPrime = false;
			//		}

			// 3�� ���
			for (int i = 2; i*i <= n && isPrime; i++) {
				if (n % i == 0) 
					isPrime = false;
			}

			if (isPrime)
				System.out.println(n);
		}
	}

}
