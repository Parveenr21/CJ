package Bizarre;
class Garbage {

	static void fun() {
		System.out.println("first");

	}

	void nonstatic() throws Throwable {
		System.out.println("first nonstatic");
		// System.gc(); //This will request garbage collector to free all unused
		// memory but can not force GC for that.

		CPUdetails();

	}

	public void finalize() // This method will be the last thing which gets
							// called when GC frees object so this method should
							// be able to
	{ // run successfully in order to free the object else..object will not be
		// made free.
		// As object to be freed of this class then finalize method will be
		// called on this class only and by default all object thigs are here.

		System.out.println("finalize method is called");

	}

	public void CPUdetails() throws Throwable {

		Runtime rt = Runtime.getRuntime();

		// rt.availableProcessors();
		// rt.exec("notepad.exe");
		// rt.exec("mkdir c:\runtime\runt\rt"); // we can not create directory
		// as.. we are supposed to run process
		// we can only execute commands which windows allows us to run and not
		// the file operations

		System.out.println("rt.availableProcessors()"
				+ rt.availableProcessors());

		System.out.println("rt.maxMemory()" + rt.maxMemory());
		System.out.println("rt.freeMemory()" + rt.freeMemory());

	}

	public static void main(String... asdasd) throws Throwable {
		Garbage.fun(); // its just written like that.. it has noting to do with
						// GC
		Garbage g;
		g = new Garbage();
		int i = 0;
		while (i < 1000) {

			new Garbage();
			++i;
		}

		g.nonstatic();
		// System.out.println("value of g     " + g);
		// g=null;

		System.gc();

	}

}