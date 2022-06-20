package JH.codetest;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) throws Exception {

        String fileFullPath = makeFilePath("C:\\Lottery") + "\\" + getFileName(); // 파일 이름을 정하는 메소드로 기능 분리.

		/* 생성된 파일에 입력 */
        Scanner sc = new Scanner(System.in);
        Lottery lottery = new Lottery();

        System.out.println("자동 로또입니다");
        System.out.print("시행할 횟수를 입력하세요:");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            try {
                PrintStream out = new PrintStream(new FileOutputStream(fileFullPath, true), true);
                System.setOut(out);
                System.out.println(lottery.lotteryNumbers());
            } catch (Exception e) {
                System.out.println("실패했습니다!");
                e.printStackTrace();
            }
        }
    }

    private static String makeFilePath(String s) {
        File file = new File("C:\\Lottery");
        boolean directoryCreated = file.mkdir();
        if (directoryCreated == true) {
            System.out.println("디렉토리가 생성되었습니다.");
        } else {
            System.out.println("디렉토리가 이미 존재합니다.");
        }
        return s;
    }

    private static Object getFileName() {
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String fileName = "lotto" + formatedNow + ".txt";

        return fileName;
    }


    private String lotteryNumbers() throws Exception {

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
        
        boolean duplicateExist = checkDuplicateNumbers(lotteryNums);
        if(duplicateExist) {
        	throw new Exception ("중복이 확인되었습니다. 다시 시작 해 주세요");
        }
        return Arrays.toString(lotteryNums);
    }

	private boolean checkDuplicateNumbers(int[] numbers) {
		//중복확인
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
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
