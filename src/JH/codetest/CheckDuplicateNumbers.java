
public class CheckDuplicateNumbers {
	public static void main(String[] args) {
		int[] numbers = {41, 3, 2, 6, 41, 8};
		
		// 중복 확인
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					System.out.println("i : " + i + ", j : " + j);
					System.out.println("numbers[i] : " + numbers[i] + ", numbers[j] : " + numbers[j]);
				}
			}
		}
		
	}
}
