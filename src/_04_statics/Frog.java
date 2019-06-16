package _04_statics;

class Frog {
	static int frogCount = 0;
	int a = 3;
	
	public Frog() {
		frogCount++;
	}

	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog count is now " + frogCount);
		
		
		

	}
}
