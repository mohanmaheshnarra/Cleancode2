package epam.Cleancode2;
import java.io.*;
public class App 
{
	   public static void main( String[] args )
	    {
	    	PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	        Services standardServices = new Services("standard", 1000);
	        Services aboveStandardServices = new Services("abovestandard", 1000);
	        Services highStandardServices = new Services("highstandard", 1000);
	        Services highAutomatedServices = new Services("highstandard", 1000, true);
	        out.println("The Services cost with standard materials  is: " + standardServices.getConstructionCost());
	        out.println("The Services cost with above standard materials is: " + aboveStandardServices.getConstructionCost());
	        out.println("The Services cost with high standard materials is: " + highStandardServices.getConstructionCost());
	        out.println("The Services cost with high standard materials with full automation is: " + highAutomatedServices.getConstructionCost());
	    }
}
