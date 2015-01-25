package EventListener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ImplementingListeners.class)
public class ImplementingListener2 {

@Test
public void test1(){
	
	System.out.println("test2 called");
}

}

