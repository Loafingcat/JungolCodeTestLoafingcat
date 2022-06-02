import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lottery lottery = new Lottery();

        System.out.println("자동 로또입니다");
        System.out.print("시행할 횟수를 입력하세요:");

        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            try {
				System.out.println(lottery.lotteryNumbers());
			} catch (Exception e) {
				System.out.println("중복된 번호가 발생하였습니다!");
				e.printStackTrace();
			}
        }
    }

    String lotteryNumbers() throws Exception {

        int[] lotteryNums = new int[6];

        for (int i = 0; i < 6; i++) {
            lotteryNums[i] = (int) (Math.random() * 45) + 1;
            //중복확인
            for (int j = 0; j < i; j++) {
                if (lotteryNums[i] == lotteryNums[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(lotteryNums);
        
        boolean duplicateExist = checkDuplicateNumbers(lotteryNums);
        if(duplicateExist) {
        	throw new Exception ("중복이 확인되었습니다. 다시 시작 해 주세요");
        }

        return Arrays.toString(lotteryNums);
    }

	private boolean checkDuplicateNumbers(int[] numbers) {
		// �ߺ� Ȯ��
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					System.out.println("i : " + i + ", j : " + j);
					System.out.println("numbers[i] : " + numbers[i] + ", numbers[j] : " + numbers[j]);
					return true;
				}
			}
		}
		return false;
	}
    
}
