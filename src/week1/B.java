package week1;

public class B {

	private int var1;

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.setVar1(10);
		System.out.println(b.getVar1());

	}

}
