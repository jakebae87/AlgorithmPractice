package level1;

import java.util.ArrayList;

public class Hashad {
	public boolean solution(int x) {
		boolean answer = true;

		String x_ = String.valueOf(x);
		int sum = 0;
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < x_.length(); i++) {
			list.add(String.valueOf(x_.charAt(i)));
			for (int j = 0; j < list.size(); j++) {
				sum += Integer.parseInt(list.get(j));
			}
		}

		if (x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Hashad hashad = new Hashad();
		System.out.println(hashad.solution(10));
	}
}
