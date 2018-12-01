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
		popu = (int) (popu + popu * rate);
		// notify RoachMotel
	}
	public void setPopu(int popu)
	{
		this.popu = popu;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return name + " " + popu;
	}
}
