package ese102;
import java.io.*;

import complexnumber.*;
public class ese102 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
		int a=0;
        complexNumber cn=new complexNumber();
        boolean valoreValido=false;
        
   
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
				   cn.setRe(Double.valueOf(numeroLetto).doubleValue());
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
				   cn.setIm(Double.valueOf(numeroLetto).doubleValue());
				   valoreValido=true;
			   }
			   catch(NumberFormatException e) {
				   System.out.println("\nnumero non valido");
			   }
        	System.out.println("\nil modulo � "+cn.calcolaModulus());
        	System.out.println("\nl'argomento � "+cn.calcolaArgument());
			}
        }
		else{
			   valoreValido=false;
				while(!valoreValido){
				   System.out.println("\ninserisci il modulo");
				   try{
					   String numeroLetto=tastiera.readLine();
					   cn.setModulus(Double.valueOf(numeroLetto).doubleValue());
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
						   cn.setRe(Double.valueOf(numeroLetto).doubleValue());
						   valoreValido=true;
					   }
					   catch(NumberFormatException e){
					      System.out.println("\nnumero non corretto");
					   }
					   catch(IllegalArgumentException e){
						   System.out.println("\nil valore impostato non � ammesso");
					   }
					}
					System.out.println("\nla parte immaginaria � "+cn.calcolaIm());
					System.out.println("\nl'argomento � "+cn.calcolaArgument());
				}
				else{
					valoreValido=false;
					while(!valoreValido){
				   	System.out.println("\ninserisci la parte immaginaria");
					try{
						String numeroLetto=tastiera.readLine();
						cn.setIm(Double.valueOf(numeroLetto).doubleValue());
						valoreValido=true;
					}
					catch(NumberFormatException e){
						System.out.println("\nnumero non corretto");
					}
					catch(IllegalArgumentException e){
						System.out.println("\nil valore impostato non e ammesso");
					}
					System.out.println("\nla parte reale � "+cn.caloclaRe());
					System.out.println("\nl'argomento � "+cn.calcolaArgument());
				}
			}
		}
	}

}
