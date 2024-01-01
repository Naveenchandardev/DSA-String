import java.util.List;

public class PracticePrograms {
	public static void main(String[] args) {
		String input = "chandar";
		reverseMethod(input);
	}
	private static void reverseMethod(String input) {
		char[] chars = input.toCharArray();
		for(int i=chars.length-1;i>=0;i-- ) {
			System.out.print(chars[i]);
		}
 	}
}
