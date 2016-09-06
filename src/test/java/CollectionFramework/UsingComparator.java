package CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import CollectionFramework.HDTV;
 
public class UsingComparator {
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
 
		/*if (tv1.compareTo(tv2) > 0) {
			System.out.println(tv1.getBrand() + " is better.");
		} else {
			System.out.println(tv2.getBrand() + " is better.");
		}*/
		
		
		HDTV[] hdd= new HDTV[]{tv1,tv2};
		
	Arrays.sort(hdd, new SizeComparator());
		
		
		
	}
}

class SizeComparator implements Comparator<HDTV> {
	@Override
	public int compare(HDTV tv1, HDTV tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
		
		
		
	}
}


