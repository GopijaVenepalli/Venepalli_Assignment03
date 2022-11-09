package q16;

import java.util.HashMap;
import java.util.Map;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> stateCodes = new HashMap<String, String>();
		stateCodes.put("s546960" , "dfxgchvg");
		stateCodes.put("s546940", "vdcfg");
		stateCodes.put("s546920", "asxcvb");
		stateCodes.put("s546980", "wertygtfd");
		System.out.println(stateCodes.size());
		System.out.println(stateCodes);
		System.out.println(stateCodes.keySet());
		System.out.println(stateCodes.values());
		System.out.println(stateCodes.entrySet());

	}

}
