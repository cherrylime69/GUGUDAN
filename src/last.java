import java.util.*;

public class last {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		if (inputValue.contains(",")) {
			String[] splitedValue = inputValue.split(",");
			int first = Integer.parseInt(splitedValue[0]);
			int second = Integer.parseInt(splitedValue[1]);
			
			System.out.println(first + "x" + second +"을 출력합니다");
			int[] result = calculate(first, second);
			fifth.print(result);

		} else {
			int number = Integer.parseInt(inputValue);
			int[] result = fifth.caculate(number);
			System.out.println(number + "단을 출력합니다");
			fifth.print(result);
		}
	
		
	}
	public static int[] calculate(int first, int second) {
		int[] result = new int[second];
		for (int i = 0; i<result.length;i++) {
			result[i] = first * (i+1);
		}
		return result;
	}
}


