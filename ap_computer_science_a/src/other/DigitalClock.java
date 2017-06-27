package other;

public class DigitalClock {
	private static int hour=0;
	private static int minute=0;
	private static int second=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalClock c = new DigitalClock(10,3);
		//c.setHourk(9);
		//c.setMinute(54);
		c.tick();
		System.out.println(c.toString());
		
	}
	public DigitalClock () {
		hour=12;
		minute=0;
		second=0;
	}
	public DigitalClock (int h, int m) {
		hour=h;
		minute=m;
	}
	public int getHour () {
		return hour;
	}
	public void setHourk (int h) {
		hour = h;
	}
	public int getMinute () {
		return minute;
	}
	public void setMinute (int m) {
		minute = m;
	}
	public int getSecond () {
		return second;
	}
	public void setSecond (int s) {
		second = s;
	}
	public void addHour () {
		hour = hour + 1;
		if (hour > 12) {
			hour = 1;
		}
	}
	public void addMinute () {
		minute = minute + 1;
		if (minute > 59) {
			minute = 0;
		}
	}
	public void tick () {
		second = second + 1;
		if (second > 59) {
			second = 0;
		}
	}
	public String toString() {
		String h="0"+Integer.toString(hour);
		String m="0"+Integer.toString(minute);
		String s="0"+Integer.toString(second);
		return 	h.substring(h.length()-2)+":"+
				m.substring(m.length()-2)+":"+
				s.substring(s.length()-2);
	}
}
