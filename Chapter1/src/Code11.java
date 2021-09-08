import java.util.Scanner;

public class Code11 {
/*
 * 사용자로부터 먼저 정수의 개수 n을 입력받는다. 
 * 이어서 n개의 정수를 입력받아 순서대로 배열에 저장한다.
 * 그런 다음 중복된 정수 쌍의 개수를 카운트하여 출력하라.
 * 예를 들어 n = 6이고 입력된 정수들이 2, 4, 2, 4, 5, 2이면
 * 중복된 정수쌍은 (2, 2), (2, 2), (2, 2), (4, 4)로 모두 4쌍이다.  => 순열
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
				// j = i + 1을 안해주면 항상 실제 값보다 두 배의 값이 나옴
				// ex) i = 0, j = 0일 때, j = 0, i = 0일 때 두 번씩 카운트됨
				// data[i] data[j]의 쌍을 검사할 수 있음
				if(data[i] == data[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
