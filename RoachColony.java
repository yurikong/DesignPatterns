package ProjectDesignPatterns;

public class RoachColony {

	private String name;
	private int popu;
	private double rate;
	public RoachColony(String name, int popu, double rate)
	{
		this.name = name;
		this.popu = popu;
		this.rate = rate;
	}
	public void party()
	{
		
	}
	public String toString()
	{
		return name + " " + popu;
	}
}
