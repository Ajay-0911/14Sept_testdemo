package IFrame;

public class LogicalProgram {

	public static void main(String[] args) {
	      	String Str = "aaabbbcccaaaa";
			// Expected output - a3b3c3a4
			System.out.println(LogicalProgram.Test(Str));
			}
			public static String Test(String str) {
			StringBuilder Result = new StringBuilder();
			int count = 1;
			for(int i=1 ;i<str.length();i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
			count++;
			}
			else {
			Result.append(str.charAt(i-1)).append(count);
			count=1;
			}
			}
			Result.append(str.charAt(str.length()-1)).append(count);
			return Result.toString();
	}
}
