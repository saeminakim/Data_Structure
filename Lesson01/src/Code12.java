import java.util.Scanner;

public class Code12 {
/*
 * n개의 정수를 입력받아 배열에 저장한다.
 * 이들 중에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값을 구하여 출력하는 프로그램을 작성하라.
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
		
		// 썩 좋은 방법은 아니지만 기초단계에서는 이게 최선
		// 방법 1
//		for(int i = 0; i < n; i++) { // i는 시작점
//			for(int j = i; j < n; j++) { // j는 끝점
//				// add data[i]...data[j] 까지의 합을 구한 다음
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
		
		// 방법 2
		// 위 코드의 경우 i부터 j까지의 합을 구하고, j++한 다음 또 i부터 j까지의 합을 구하기 때문에 쓸데없는 계산을 많이 하게 됨
		for(int i = 0; i < n; i++) { // i는 시작점
			int sum = 0;
			for(int j = i; j < n; j++) { // j는 끝점

					sum += data[j];

				if (sum > maxSum)
					maxSum = sum;
			}
		}
		System.out.println("The max sum is " + maxSum);
	}

}
