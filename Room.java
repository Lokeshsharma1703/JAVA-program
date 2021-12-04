public class Room
{
	static int power;
	public void AC_ON(boolean b)
	{
		if(b)
			power+=1200;
	}
	public void HOME_THEATRE_ON(boolean b)
	{
		if(b)
			power+=600;
	}
	public void FAN_ON(boolean b)
	{
		if(b)
			power+=400;
	}
	public void LIGHT_ON(boolean b)
	{
		if(b)
			power+=100;
	}

	public static void main(String[] args)
	{
		final boolean on = true;
		final boolean off = false;
		Room room = new Room();
		room.AC_ON(on);
		room.HOME_THEATRE_ON(off);
		room.FAN_ON(on);
		room.LIGHT_ON(off);
		room.HOME_THEATRE_ON(on);
		if(power>2000)
			System.out.print("Overload");
		else
			System.out.print("Power consumed : "+power+" Watt");
	}
}