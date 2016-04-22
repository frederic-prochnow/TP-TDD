package iut.tdd;

import java.util.ArrayList;

public class RomanNumerals {
	String[] unite = {"I","II","III","IV","V","VI","VII","VIII","IX"};
	String[] dizaine = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String[] centaine = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	String[] millieme = {"M","MM","MMM","MMMM"};
	
	
	public String convertToRoman(String arabe) {
		String resultat = "";
		if(arabe.length() == 4) {
			char char1 = arabe.charAt(0);
			int int1 = Character.getNumericValue(char1);
			for(int i=0; i<millieme.length;i++) {
				if(i==int1-1) {
					resultat += millieme[i];
				}
			}
			arabe = arabe.substring(1);
		}
		if(arabe.length() >= 3) {
			char char2 = arabe.charAt(0);
			int int2 = Character.getNumericValue(char2);
			for(int i=0; i<centaine.length;i++) {
				if(i==int2-1) {
					resultat += centaine[i];
				}
			}
			arabe = arabe.substring(1);
		}
		if(arabe.length() >= 2) {
			char char3 = arabe.charAt(0);
			int int3 = Character.getNumericValue(char3);
			for(int i=0; i<dizaine.length;i++) {
				if(i==int3-1) {
					resultat += dizaine[i];
				}
			}
			arabe = arabe.substring(1);
		}
		if(arabe.length() >= 1) {
			char char4 = arabe.charAt(0);
			int int4 = Character.getNumericValue(char4);
			for(int i=0; i<unite.length;i++) {
				if(i==int4-1) {
					resultat += unite[i];
				}
			}
		}
		return resultat;
	}

	public String convertFromRoman(String romain) {
		int resultat = 0;
		char[] charc = {'I','V','X','L','C','D','M'};
		int [] intva = {1,5,10,50,100,500,1000};
		
		for(int j=0; j<romain.length();j++){
			char c = romain.charAt(j);
			for(int k=0; k<charc.length;k++){
				if(charc[k]==c) {
					resultat += intva[k];
				}
				char c_p_1 = romain.charAt(k+1);
				
				if(intva[k] > intva[k+1]) {
					int valeur = intva[k+1]-intva[k];
					resultat -= 2*valeur;
				}
			}
		}
		return ""+resultat;
	}

}
