package ese102;
package java.lang;
import java.io.*;


import complexnumber.*;
import ese.pkg102.newpackage.complexnumber;
public class ese102 
{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
		int a=0;
        complexnumber coordinate=new complexnumber();
        boolean valoreValido=false;
        
        complexnumber.setInitCartesian(45, 7);
        complexnumber.setInitPolar(30, 5);
       
        
   
        while(!valoreValido){
           System.out.println("digitare un numero minore o uguale a 10 se vuoi inserire le coordinate polari o uno superiore se vuoi inserire le coordinate cartesiane\n");
           try {
              String numeroLetto=tastiera.readLine();
              a=Integer.valueOf(numeroLetto).intValue();
              valoreValido=true;
           }
           catch(NumberFormatException e) {
        	   System.out.println("\nnumero non valido");
           }
        }
        valoreValido=false;
		if(a>10){
			while(!valoreValido){
			   System.out.println("\ninserisci il valore reale");
			   try{
				   String numeroLetto=tastiera.readLine();
				   coordinate.setRe(Double.valueOf(numeroLetto).doubleValue());
				   valoreValido=true;
			   }
			   catch(NumberFormatException e) {
				   System.out.println("\nnumero non valido");
				   
			   }
			}
			valoreValido=false;
			while(!valoreValido){
			   System.out.println("\ninserisci il valore immaginario");
			   try{
				   String numeroLetto=tastiera.readLine();
				   coordinate.setIm(Double.valueOf(numeroLetto).doubleValue());
				   valoreValido=true;
			   }
			   catch(NumberFormatException e) {
				   System.out.println("\nnumero non valido");
			   }
        	System.out.println("\nil modulo � "+coordinate.getModulus());
        	System.out.println("\nl'argomento � "+coordinate.getArgument());
			}
        }
		else{
			   valoreValido=false;
				while(!valoreValido){
				   System.out.println("\ninserisci il modulo");
				   try{
					   String numeroLetto=tastiera.readLine();
					   coordinate.setModulus(Double.valueOf(numeroLetto).doubleValue());
					   valoreValido=true;
				   }
				   catch(NumberFormatException e) {
					   System.out.println("\nnumero non corretto");
				   }
				   catch(IllegalArgumentException e){
					   System.out.println("\nil valore impostato non � ammesso");
				   }
				}
				   valoreValido=false;
				   while(!valoreValido){
				      System.out.println("\ndigitare un numero minore o uguale a 10 per inserire il numero reale o uno superiore per inserire il numero immaginario");
				      try{
					      String numeroLetto=tastiera.readLine();
					      a=Integer.valueOf(numeroLetto).intValue();
					      valoreValido=true;
				      }
				      catch(NumberFormatException e){
				    	  System.out.println("\nnumero non valido");
				      }
				}
				if(a==1){
					valoreValido=false;
					while(!valoreValido){
					   System.out.println("\ninserire la parte reale");
					   try{
						   String numeroLetto=tastiera.readLine();
						   coordinate.setRe(Double.valueOf(numeroLetto).doubleValue());
						   valoreValido=true;
					   }
					   catch(NumberFormatException e){
					      System.out.println("\nnumero non corretto");
					   }
					   catch(IllegalArgumentException e){
						   System.out.println("\nil valore impostato non � ammesso");
					   }
					}
					System.out.println("\nla parte immaginaria � "+coordinate.getIm());
					System.out.println("\nl'argomento � "+coordinate.getArgument());
				}
				else{
					valoreValido=false;
					while(!valoreValido){
				   	System.out.println("\ninserisci la parte immaginaria");
					try{
						String numeroLetto=tastiera.readLine();
						coordinate.setIm(Double.valueOf(numeroLetto).doubleValue());
						valoreValido=true;
					}
					catch(NumberFormatException e){
						System.out.println("\nnumero non corretto");
					}
					catch(IllegalArgumentException e){
						System.out.println("\nil valore impostato non e ammesso");
					}
					System.out.println("\nla parte reale � "+coordinate.getRe());
					System.out.println("\nl'argomento � "+coordinate.getArgument());
                                        
				}
			}
		}
	}

}