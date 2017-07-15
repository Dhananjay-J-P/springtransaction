/**
 * 
 */
package core;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Dhananjay P
 *
 */
public class PrototypeScope {

	String date;

	/**
	 * @return the date
	 */
	public String getDate() {
		if (date == null) {
			date = new SimpleDateFormat("ddMMyyhhmmss").format(new Date());
		}
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
