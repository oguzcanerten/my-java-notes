package _stringBufferStringBuilder;

public class Example01 {

	public static void main(String[] args) {
		//StringBuilder compileError = "compileError" ---> bu sekilde olusturulmaz.
		
		StringBuilder sb = new StringBuilder("java");
		//sb = sb +"rules" --> bu çalýþmaz.
		sb.append("Rules");
		System.out.println(sb);
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.insert(3 ,"inserted"));
		System.out.println(sb.reverse());
		
		//String str = sb;  ---->  hata cunku StringBuilder IS-A String deðildir.

	}

}
