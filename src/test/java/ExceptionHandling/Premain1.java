package ExceptionHandling;
import java.lang.instrument.Instrumentation;


public class Premain1 {

int i=10;

public static void premain(String agentArgument,
        Instrumentation instrumentation){
	System.out.println("hi");
	
}


public static void  main(String ...cc) {
	
	
	System.out.println("main ");
}

}

