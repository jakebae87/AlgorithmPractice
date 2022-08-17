package level1;

import java.util.Arrays;

public class XandN {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		XandN test = new XandN();
		long[] result = test.solution(2, 5);
		System.out.println(Arrays.toString(result));
	}
}
