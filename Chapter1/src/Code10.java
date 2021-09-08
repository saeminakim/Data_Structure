
public class Code10 {
	/*
	 * 1 ~ 100000 사이의 모든 소수를 찾아서 출력하는 프로그램 
	 */
	public static void main(String[] args) {

		for(int n = 2; n <= 100000; n++) {

			// 2, 3, ..., n/2까지의 정수로 n을 나누었을 때 떨어지면 정수
			// 2, 3, ..., root(n)까지만 돌면 됨. 즉 sqrt(n)까지

			boolean isPrime = true; // 아직 n이 소수가 아니라는 증거가 없으니 일단 true

			// 1번 방법
			//		for (int i = 2; i <= n / 2; i++) {
			//			if (n % i == 0) {
			//				// not prime 약수가 아님
			//				// n이 소수가 아니라는 증거를 제공 
			//				isPrime = false;
			//				break;
			//			}
			//		}

			// 2번 방법
			//		for (int i = 2; i <= n / 2 && isPrime; i++) {
			//			if (n % i == 0) 
			//				isPrime = false;
			//		}

			// 3번 방법
			for (int i = 2; i*i <= n && isPrime; i++) {
				if (n % i == 0) 
					isPrime = false;
			}

			if (isPrime)
				System.out.println(n);
		}
	}

}
