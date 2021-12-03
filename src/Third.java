import java.util.*;

public class Third {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
	
		do {
			System.out.println("출력할 구구단을 입력하세요 (2~9사이의 숫자 입력) : ");
			number = scanner.nextInt();
			if (number < 2) {
				System.out.println("2 이상, 9 이하의 값을 입력하세요");
			} else if (number > 9) {
				System.out.println("2 이상, 9 이하의 값을 입력하세요");
			} else {
				System.out.println(number + "단을 출력합니다.");
				for (int i=1; i <10; i++) {
					int result = number * i;
					System.out.println(result);
					}
				break;
				}
			} while (true);
		}
	}

//		int i = 1;
//		while (i<10) {
//			int result = number * i;
//			i++;
//			System.out.println(result);
//		}
		

		


