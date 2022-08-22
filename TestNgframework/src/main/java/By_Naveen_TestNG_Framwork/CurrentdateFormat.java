package By_Naveen_TestNG_Framwork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentdateFormat {

	public static void main(String[] args) {
		String date= new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		System.out.println(date);

	}

}
