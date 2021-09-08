import java.util.Scanner;

public class Code14 {
/*
 * 사용자로부터 n 개의 정수를 입력받은 후 오름차순으로 정렬(sort)하여 출력하는 코드이다. 
 * 버블 정렬(bubble sort) 알고리즘
 * 바로 옆 자리 데이터와 크기 비교를 반복하다보면 오름차순으로 정렬이 됨
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
		// for문이 한 번 다 돌면 맨 뒷자리의 큰 수가 하나씩 채워지기 때문에 
		// n-1까지만 돌고 i-- 하는 것
		for (int i = n - 1; i > 0; i--) { 
			
			// data[0] ... data[i] 까지 가장 큰 값을 맨 뒤로 몰아가는 일을 해줘야함
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
