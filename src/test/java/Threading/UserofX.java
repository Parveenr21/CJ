package Threading;

class X {

	private X otherX;
	public void setPartner(X otherX) {
		this.otherX = otherX;
	}

	public synchronized void m1() {
		System.out.println("It's method m1");
		//otherX.m2();
		this.m2();
		
	}		
	public synchronized void m2() {
		// OK
		System.out.println("It's method m2");
	
	}
}

public class UserofX extends Thread {
	private X myX;

	public UserofX(X x) {
		myX = x;
	}

	public void run() {
		for (int i = 0; i < 10000; i++)
				myX.m1();

	}
	

	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new X();
		x1.setPartner(x2);
		x2.setPartner(x1);
		UserofX user1 = new UserofX(x1);
		user1.start();
		UserofX user2 = new UserofX(x2);
		user2.start();
	}
}
