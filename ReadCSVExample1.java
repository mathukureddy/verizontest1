import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.Scanner;
public class ReadCSVExample1  
{  
	public static void main(String[] args)   
	{  
		String line = "";  
		String splitBy = ","; 
		int a=0;
		double deltasum=0.0;
		double mean=0.0;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the c value");
		double c=myObj.nextDouble();
		System.out.println("Enter the N value");
		double N=myObj.nextDouble();
		while(N <= 0)
		{
			System.out.println("Sorry, but you must enter a positive decimal always. Enter the N value:  ");
			 N=myObj.nextDouble();
		}
		System.out.print("Enter operator (+, -)");
		char operator = myObj.next().charAt(0);
 
		try   
		{  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader("/tmp/input.csv"));  

			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				if(a!=0){
					String[] data = line.split(splitBy);    // use comma as separator  
					double x=Double.parseDouble(data[0]);
					double y=Double.parseDouble(data[1]);
					double operation1=0.0; 
					System.out.println("x=" + x + ", y=" + y);
					//Perform the operation for compute1 based on input operator
					switch(operator)
        				{
            				case '+' :
           					{
							operation1=c+(N * x);
							System.out.println("operation1=" + operation1);
							break;
             				}
            				case '-' :
            				{
             					operation1=c-(N * x);
							System.out.println("operation1=" + operation1);
							break;
             				}
					}

					//Get the DeltaSquare 
					double ds=Math.pow((operation1- y) ,2);
					System.out.println("ds=" + ds);

					//Cumulate the deltasum for mean calculation
					deltasum = deltasum + ds;
					}
				System.out.println("a=" + a);
				a++; 
			}

			//calculate the mean value  
			mean= deltasum / (a-1);
			System.out.println("mean=" + mean);
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();  
		}  
	}  
}  
