public class sixth {
	
	public static void main (String[] args) {
		Gugudan gugudan = new Gugudan();
		
		for (int i = 2; i <10; i++) {
			System.out.println(i + "단을 출력합니다");
			int[] result = fifth.caculate(i);
			fifth.print(result);
		}
			
	}
}


//여기서 public은 쓸 수 없다. 파일명과 일치하지 않아 에러가 발생한다. 
//인프런 강의에서는 sixth 클래스 안에 있는 클래스를 쓰는게 아니라 
//fifth에 있는 클래스를 쓰도록 힌트를 준 것이다
class Gugudan { 
	
	public static int[] calculate (int times) {
		int[] result = new int[9];
		
		for (int i=0; i<result.length;i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for (int i =0; i < result.length;i++) {
			System.out.println(result[i]);
		}
	}


}



