//author:oguzcan
package CounterEx;

public class CounterEx {

	static int count = 0;

	CounterEx() {

		count++;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CounterEx();
		new CounterEx();
		new CounterEx();
		new CounterEx();
		System.out.println("counter value:" + count);

	}

}
