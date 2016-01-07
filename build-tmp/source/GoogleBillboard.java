import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
  // String digits = e.substring(2,12);
  // double miyu = Double.parseDouble(digits);
  // System.out.println(miyu);
  noLoop();  
}  
public void draw()  
{   
	for (int ilya = 2; ilya < e.length(); ilya++)
	{
		double kuro = Double.parseDouble(e.substring(ilya, ilya + 10));
		if (isPrime(kuro) == true)
		{
			System.out.println(e.substring(ilya, ilya + 10)+".com");
			break;
		}
	}
}  
public boolean isPrime(double miyu)  
{   
  if (miyu < 2)
  	return false;
  for (int umi = 2; umi <= Math.sqrt(miyu); umi++)
  	if (miyu%umi == 0)
    	return false;
  return true;  
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
