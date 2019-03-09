package Threading;


class Interrupting1 implements Runnable {			//THREADING via Association but implementing runnable method

	int ThreadNo;
	static Thread thrX, thrX1;

	public static void main(String ...xxx)

	{

		Interrupting1 t2ref = new Interrupting1();



		new Thread().start(); //This will call the run method of the Thread class and not the overridden


		/*here we are passing the reference variable of the class where we are overriding the
		run method..T2 and this passing is simply registration of that child class to Runnable
		interface, because this RI actually calls this run method indirectly
		*/


		 thrX= new Thread(t2ref);
		 thrX1= new Thread(t2ref, "ThreadnameSET2ONE");


		thrX.setPriority(1);
		thrX1.setPriority(1);
		thrX.start();
		thrX1.start();



	}


	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {

//	To check which thread is currently running


		/*if(Thread.currentThread().getName().equals("ThreadnameSET2ONE"))

		{
			System.out.println("Thread ThreadnameSET2ONE name is      " + Thread.currentThread().getName());

		}

if(Thread.currentThread().equals(thrX))

		{
			System.out.println("Thread thrX name is      " + Thread.currentThread().getName());

		}
		*/


		System.out.println("within overriden RUN method ");

		if(Thread.currentThread().equals(thrX))
		{
			thrX1.interrupt();
			System.out.println("1"+thrX1.isInterrupted());	//tells whether it is interrrupted or not and flags remain as it is
			//while Interrupted() also checks if the thread is interrupted but it clears the interrput flag as well.
			//System.out.println(thrX1.interrupt());
			//System.out.println(thrX1.interrupted());


			//System.out.println(thrX1.isAlive());
			//System.out.println(thrX1.isDaemon());



			System.out.println("2"+thrX1.isInterrupted());


		}


		if(Thread.currentThread().equals(thrX1))
		{



			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {


				System.out.println("Thread.interrup()   method was run on current thread.. which directly interrupts runnig thread..but does not stop" +
						"it from running.. normal running thread.. if gets an interrupt.. check the interrupt status periodically by running " +
						"isinterrupted() method of thread class only.. but blockec pool thread.. if gets this interrupt method.. throws interrupted exception" +
						"" +
						"IT gives.. sleep interrupted..like killing or teasing someone..who was in blocked pool");
				e.printStackTrace();
			}*/
			Thread.interrupted();

			System.out.println("thrX1 executed");
			System.out.println("3"+Thread.currentThread().isInterrupted());
		}





	}




}