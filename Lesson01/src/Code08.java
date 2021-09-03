import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		
		kb.close();
		
		int sum = 0; 
		int max = data[0]; // max를 0으로 초기화한다면 음수가 들어올 때 오류 발생
		
		for(int i = 0; i < n; i++) {
			sum += data[i];
			if(data[i] > max) // 입력받은 숫자가 현재 저장된 max 값보다 크면 max에 넣어줌
				max = data[i];
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("The max is " + max);
	}

}
