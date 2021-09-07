import java.util.Scanner;

public class Code13 {
	/*
	 * n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장한다.
	 * 이들 주에서 1개 이상의 연속된 정수를 합하여 얻을 수 있는 소수들 중에서
	 * 최대값을 구하여 출력하는 프로그램을 작성하라. 
	 * ex) 7 1 3 이 있다면 각 숫자를 더하는게 아닌 713으로 해석
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
		for (int i = 0; i < n; i++) { // i는 출발점, 시작점
			for (int j = i; j < n; j++) { // j는 끝점

				// convert data[i]...data[j] into an integer
				int val = 0;
				for (int k = i; k <= j; k++) 
					val = val * 10 + data[k]; 
					// 숫자를 한자리씩 늘려줄려면 val에 10을 곱하고 각 숫자를 더해주면 됨!! 싱기방기
					// ex) 2 9 3 이 있다치면 
					// 처음 val의 값인 0 * 10 + 2 = 2
					// 2 * 10 + 9 = 29
					// 29 * 10 + 3 = 293 
					// 짱 신기하다요............ 

				// test if it is a prime 소수인지 검사
				// 정수가 1보다 큰 경우에만 if문 타게 되고 val = 1 일 때는 안 탐
				boolean isPrime = true;
				for(int k = 2; k*k <= val; k++) {
					if (val % k == 0)
						isPrime = false;
				}
				
				// if yes, compare to the max
				// 그래서 여기서 val = 1 일 때의 경우를 막아주는 것
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
