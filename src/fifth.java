
public class fifth {

	public static void main(String[] args) {
		for (int j=2;j<10;j++) {
			System.out.println(j + "단을 출력합니다.");
			int[] result = caculate(j);
			print(result);
		}

	}
	
	public static int[] caculate(int times) {
		int[] result = new int[times];
		
		for (int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i =0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
