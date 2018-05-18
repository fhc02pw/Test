package exceptions.ue.transporter;

public class Transporter {

	public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException
	{
		if(urgent)
		{
			double randomValue = Math.random();
			
			if(randomValue < 0.5)
				throw new TransporterMalfunctionException(); 
		}
		
		System.out.println("Beam person " + person + " from " + from + " to " + to);
	}
	
	public void shutdown()
	{
		System.out.println("Shutdown");
	}
}
