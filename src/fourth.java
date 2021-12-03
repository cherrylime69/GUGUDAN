
public class fourth {

	public static void main(String[] args) {
		int[] result = new int[9];
		for (int j =2;j<10;j++) {
			System.out.println(j +"단을 출력합니다");
			for (int i =0; i < result.length;i++) {
				result[i] = j * (i+1);
				System.out.println(result[i]);
			}
		}
		
	}

}
