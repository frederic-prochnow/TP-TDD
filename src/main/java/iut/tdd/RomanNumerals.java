package iut.tdd;

import java.util.ArrayList;

public class RomanNumerals {
	String[] chiffrearabe = {"1","2","3","4","5","6","7","8","9","10"};
	String[] chiffreromain = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
	
	public String convertToRoman(String arabe) {
		for(int i= 0; i < chiffrearabe.length ; i++) {
			if(chiffrearabe[i].equals(arabe)){
				return chiffreromain[i];
			}
		}
		return null;
	}

	public String convertFromRoman(String romain) {
		for(int i= 0; i < chiffrearabe.length ; i++) {
			if(chiffreromain[i].equals(romain)){
				return chiffrearabe[i];
			}
		}
		return null;
	}

}
