package com.antoine.ASCIIart.utiles;

import java.util.Scanner;

public class ScannerProviden {
	
	private ScannerProviden() {
	     this.scanner = new Scanner (System.in);
	}
	    /** Instance unique non pr�initialis�e */
	private static ScannerProviden INSTANCE = null;
	     
	    /** Point d'acc�s pour l'instance unique du singleton */
	public static synchronized ScannerProviden getInstance() {           
	 if (INSTANCE == null)
	        {   INSTANCE = new ScannerProviden(); 
	        }
	        return INSTANCE;
	    }	
	
	private Scanner scanner;
	
	public Scanner getScanner() {
		return scanner;
	}
	

}
