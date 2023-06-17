package structs;
//container for result pump information

//pipeid: unique integer id of the pipe in which the pump is installed
//pumphead: water head generated by the pump in metres
//pumppower: power of the pump in kW
//energycost: energy cost of the pump in Rupees
//capitalcost: capital cost of the pump in Rupees
//totalcost: total cost of the pump in Rupees

public class ResultPumpStruct
{
	public int pipeid;
	public double pumphead;
	public double pumppower;
	public double energycost;
	public double capitalcost;
	public double totalcost;
	
	
	public ResultPumpStruct(int pipeid, double pumphead, double pumppower, double energycost,
			double capitalcost, double totalcost) {
		this.pipeid = pipeid;
		this.pumphead = pumphead;
		this.pumppower = pumppower;
		this.energycost = energycost;
		this.capitalcost = capitalcost;
		this.totalcost = totalcost;
	}

	@Override
	public String toString() {
		return "ResultPumpStruct [pipeid=" + pipeid 
				+ ", pumphead=" + pumphead + ", pumppower=" + pumppower
				+ ", energycost=" + energycost + ", capitalcost=" + capitalcost
				+ ", totalcost=" + totalcost + "]";
	}
}
