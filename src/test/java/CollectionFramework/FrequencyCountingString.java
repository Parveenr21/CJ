package CollectionFramework;



import java.util.HashMap;
import java.util.Map;

public class FrequencyCountingString {


	//Done using MAP only


	public static void main(String ...ddd)
	{


		new FrequencyCountingString().calcFrequencyList("abbbaccdddssxzkjkabzzzsdsds");




	}

	private Map<Character, Integer> calcFrequencyList(String s) {


		Map<Character, Integer> map1 = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (map1.get(s.charAt(i)) == null) {
				map1.put(s.charAt(i), new Integer(1));
			} else {
				map1.put(s.charAt(i), new Integer((map1.get(s.charAt(i)) + 1)));

			}


			/*

			The below code also works fine


			for (int i = 0; i < s.length(); i++) {

			if (map1.get(s.charAt(i)) == null) {
				map1.put(s.charAt(i), 1);
			} else {
				map1.put(s.charAt(i),(map1.get(s.charAt(i))+1) );

			}


		}



			 */


		}

		System.out.println(map1);

		return map1;


	}
}
