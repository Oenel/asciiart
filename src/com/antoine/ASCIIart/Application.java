/**
 * 
 */
package com.antoine.ASCIIart;

import com.antoine.ASCIIart.alphabets.MonAlphabet;
import com.antoine.ASCIIart.manager.AsciiManager;
import com.antoine.ASCIIart.utiles.ScannerProviden;

/**
 * @author Antoine
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsciiManager ascii = new AsciiManager (new MonAlphabet());
		System.out.println(ascii.getAsciiTransformation("BOBO BIG TOTOT"));
		//ascii.getAsciiTransformation(ScannerProviden.getInstance().getScanner());
		//ScannerProviden.getInstance().getScanner();
	}

	
}
