package string.coder;

public class Main {

	public static void main(String[] args) {
		char [] ch = {'さ','く','ら'};
		String str = new String (ch);
		System.out.println(str.length());
		/*
		 * エスケープ文字
		 */
		System.out.println("名前は\\桜です。");
		System.out.println("名前は桜です。\t 23歳です。");
		System.out.println("名前は桜です。\r 23歳です。");
		System.out.println("名前は桜です。\n 23歳です。");
		
	}

}
