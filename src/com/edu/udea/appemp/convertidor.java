package com.edu.udea.appemp;


public class convertidor {
	


	public String convertir(int numAconvertir) {
		  String resultado;
		 // Usamos una array de string para separa las unidades de las decenas de las centenas
	      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
	      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
	      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	     
	     
	      int N = numAconvertir;  
	      // con esto separamos y seleccionamos la correcta unidad, decena y/o centena que tiene el numero
	      int u=N%10;  
	      int d=(N/10)%10;  
	      int c=N/100;  
	      if(N == 1000){
	    	  return "M";
	    	  
	      }else{
	      if(N>=100){
	    	  
	         resultado = Centena[c]+Decena[d]+Unidad[u];  
	      }else{  
	          if(N>=10){  
	        	   resultado = Decena[d]+Unidad[u];            
	          }else{  
	             resultado = Unidad[N];            
	          }            
	      } 
	      
	      return resultado;
	}
 }
}
