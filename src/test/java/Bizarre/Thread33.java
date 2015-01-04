package Bizarre;
class Thread33 extends Thread {

	public void run() {

		System.out.println("s");

	}

	public static void main(String... xxx) {

		new Thread().start();// why it is not working.. as we extended the
								// Thread class, so on calling overiden method
								// of this class.
		// we should get the overridden but why we are not getting....

		new Thread33().start();

		// new Thread33().start();
		// new Thread33().run();

		// new Thread().run(); //why i can not run direct run method.. as its my
		// class method..

	}

}
