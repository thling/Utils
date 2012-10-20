/**
 * 
 */
package com.thling.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sam Ling <sam@thling.com>
 * @version 1.0
 * @since Sep 08, 2012
 */
public class DateTime {
	/**
	 * Returns the current time, hour part in 24-hour format (e.g. "Aug 01, 2000 23:10:35").
	 * 
	 * @return A string containing the date and time
	 */
	public final static String getCurrentDateTime() {
		return DateTime.getCurrentDateTimeWithFormat("MMM dd, yyyy HH:mm:ss");
	}

	/**
	 * Returns the current date (e.g. "Aug 01, 2000").
	 * 
	 * @return A string containing the date
	 */
	public final static String getCurrentDate() {
		return DateTime.getCurrentDateTimeWithFormat("MMM dd, yyyy");
	}

	/**
	 * Returns the current year (e.g. 2000).
	 * 
	 * @return A string containing the year
	 */
	public final static String getCurrentYear() {
		return DateTime.getCurrentDateTimeWithFormat("yyyy");
	}

	/**
	 * Returns the current month in number [01-12].
	 * 
	 * @return String containing the current month in number
	 */
	public final static String getCurrentMonth() {
		return DateTime.getCurrentDateTimeWithFormat("MM");
	}

	/**
	 * Returns the current month in abbreviated string [Jan-Dec].
	 * 
	 * @return String containing the current month in abbreviated string
	 */
	public final static String getCurrentMonthAbbrev() {
		return DateTime.getCurrentDateTimeWithFormat("MMM");
	}

	/**
	 * Returns the current motnh in full string [January-December]
	 * 
	 * @return String containing the current month in full string
	 */
	public final static String getCurrentMonthFull() {
		return DateTime.getCurrentDateTimeWithFormat("MMMM");
	}

	/**
	 * Returns the current day in number [01-31].
	 * 
	 * @return String containing the current day in number
	 */
	public final static String getCurrentDay() {
		return DateTime.getCurrentDateTimeWithFormat("dd");
	}

	/**
	 * Returns the current timezone full name (e.g. Eastern Daylight Time).
	 * 
	 * @return String containing the current timezone in full name
	 */
	public final static String getCurrentTimeZoneFullName() {
		return DateTime.getCurrentDateTimeWithFormat("zzzz");
	}

	/**
	 * Returns the current timezone in abbreviated name (e.g. EDT).
	 * 
	 * @return String containing the current timezone in abbreviated name
	 */
	public final static String getCurrentTimeZoneShortName() {
		return DateTime.getCurrentDateTimeWithFormat("z");
	}

	/**
	 * Returns the current timezone in GMT offset (e.g. -0500)
	 * 
	 * @return String containing the current timezone in GMT offset
	 */
	public final static String getCurrentTimeZoneGMTOffset() {
		return DateTime.getCurrentDateTimeWithFormat("Z");
	}

	/**
	 * Returns the AM/PM part of current time.
	 * 
	 * @return String containing the AM/PM part of current time
	 */
	public final static String getCurrentTimeAmPm() {
		return DateTime.getCurrentDateTimeWithFormat("a");
	}

	/**
	 * Returns the current time in 24-hour format (e.g. "22:10:01").
	 * 
	 * @return String containing the current time with hours in 24-hour format
	 */
	public final static String getCurrentTime() {
		return DateTime.getCurrentDateTimeWithFormat("HH:mm:ss");
	}

	/**
	 * Returns the current hour in 24-hour format [00-23]
	 * 
	 * @return String containing the current hour in 24-hour format
	 */
	public final static String getCurrentHour24() {
		return DateTime.getCurrentDateTimeWithFormat("HH");
	}

	/**
	 * Returns the current hour in 12-hour format [1-12].
	 * 
	 * @return String containing the current hour in 12-hour format
	 */
	public final static String getCurrentHour12() {
		return DateTime.getCurrentDateTimeWithFormat("hh");
	}

	/**
	 * Returns the current minute [00-59].
	 * 
	 * @return String containing the current minute
	 */
	public final static String getCurrentMinute() {
		return DateTime.getCurrentDateTimeWithFormat("mm");
	}

	/**
	 * Returns the current second [00-59].
	 * 
	 * @return String containing the current second
	 */
	public final static String getCurrentSecond() {
		return DateTime.getCurrentDateTimeWithFormat("ss");
	}

	/**
	 * Returns the current millisecond [00-99].
	 * 
	 * @return String containing the current millisecond
	 */
	public final static String getCurrentMillisecond() {
		return DateTime.getCurrentDateTimeWithFormat("SSS");
	}

	/**
	 * Retusn the current weekday in full string [Monday-Sunday].
	 * 
	 * @return String containing the weekday in full string
	 */
	public final static String getCurrentWeekdayFull() {
		return DateTime.getCurrentDateTimeWithFormat("EEEE");
	}

	/**
	 * Returns the current weekday in abbreviated string [Mon-Sun].
	 * 
	 * @return String containing the weekday in abbreviated string
	 */
	public final static String getCurrentWeekday() {
		return DateTime.getCurrentDateTimeWithFormat("EEE");
	}

	/**
	 * Returns the current weekday in number [1-7].
	 * 
	 * @return String containing the weekday
	 */
	public final static String getCurrentWeekdayNumber() {
		return DateTime.getCurrentDateTimeWithFormat("u");
	}

	/**
	 * Returns the current week number in the month [1-5].
	 * 
	 * @return String containing the week in month
	 */
	public final static String getCurrentWeekInMonth() {
		return DateTime.getCurrentDateTimeWithFormat("W");
	}

	/**
	 * @return
	 */
	public final static String getCurrentWeekInYear() {
		return DateTime.getCurrentDateTimeWithFormat("ww");
	}

	/**
	 * Compares two time in the format: "HH[:mm:ss]" (minutes and seconds are optional).
	 * 
	 * @param t1
	 *            First time to compare with
	 * @param t2
	 *            Second time to compare with
	 * @return <pre>1 if t1 > t2<br/>-1 if t2 > t1<br/>0 if equal</pre>
	 */
	public final static int compareTime(String t1, String t2) {
		String[] t1Split = t1.split(":");
		String[] t2Split = t2.split(":");

		for (int i = 0; i < Math.min(t1Split.length, t2Split.length); i++) {
			int t1Int = Integer.parseInt(t1Split[i]);
			int t2Int = Integer.parseInt(t2Split[i]);

			if (t1Int > t2Int) {
				return 1;
			} else if (t1Int < t2Int) {
				return -1;
			} else {
				continue;
			}
		}

		return 0;
	}

	/**
	 * Returns the current date time with specified format.
	 * 
	 * @param format
	 *            A string containing the datetime format (e.g. "YYYY/MM/DD")
	 * @return A formatted current date time
	 */
	public final static String getCurrentDateTimeWithFormat(String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();

		return dateFormat.format(date);
	}
}
