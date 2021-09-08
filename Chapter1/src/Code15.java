import java.util.Scanner;

public class Code15 {
/*
 * 사용자로부터 n개의 정수를 입력받는다. 
 * 정수가 하나씩 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬하여 출력하라. 
 * ordered list에 새로운 값 insert하는 알고리즘
 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] data = new int[n];

		for(int i = 0; i < n; i++) {
			int tmp = kb.nextInt();
			
			int j = i - 1;
			
			// 배열의 뒤부터 검사해서 이미 입력된 수(data[j])가 새로 입력된 수(tmp)보다 클 경우
			// 이미 입력된 수를 뒤로 한 자리 미워놓고 그 앞자리 수와 비교
			while(j >= 0 && data[j] > tmp ) {
				data[j+1] = data[j];
				j--;
			}
			
			// tmp가 data[j]보다 크다면 data[j+1]에 tmp를 넣어줌
			data[j+1] = tmp;
			
			for (int k = 0; k <= i; k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();
		}
		
		kb.close();	
		
	}

}
 