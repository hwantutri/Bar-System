import java.io.*;

public class ElevatorSimulation

{
	private static final String FILE = "run1.dat";
	
	static Elevator elevator1 = new Elevator((byte)1);
	static Elevator elevator2 = new Elevator((byte)2);
	
	public static void main(java.lang.String[] args)
	{
		try
		{
		String strLine;
		String[] temp;
		String delimiter = " ";
		String tick = "tick";
				
		FileInputStream fstream = new FileInputStream(FILE);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		System.out.println("\nSimulation begins ...\n");
			
		while ((strLine = br.readLine()) != null)
		{
			//System.out.println (strLine);
			if (strLine.equals(tick))
			{
				//System.out.println("Tick.");
				elevator1.tick();
				elevator2.tick();
				System.out.println("Tick.");
				//elevator1.printTicks();
				//elevator2.printTicks();
			}
			else
			{
				temp = strLine.split(delimiter);
				Passenger pasahero = new Passenger(temp[1], Byte.valueOf(temp[2]));
				
				//Elevator ibilator = new Elevator(Byte.valueOf(temp[2]));
				//ibilator.tick();
				// for (int i=0; i<temp.length; i++)
				// {
				//		System.out.println("Passenger " + temp[1] + " arrives on floor " + temp[2]);
				// }
			
				
				//ibilator.addPassenger(temp[1]);
				//System.out.println(pasahero.getName());
			}
		}
		in.close();
		}
		
		catch (Exception e)
		{
			//Do nothing
			//System.err.println("Error: " + e.getMessage());
		}
		
		
		//Elevator elevator = new Elevator((byte) 1);
		//System.out.println("Elevator Number is: " + elevator.getIdentifier());
		System.out.println("\nSimulation complete.");
	}
}