/**
 * 
 */
package com.antoine.ASCIIart;

import com.antoine.ASCIIart.alphabets.BasicAlphabet;
import com.antoine.ASCIIart.alphabets.DefaultAlphabet;
import com.antoine.ASCIIart.alphabets.MonAlphabet;
import com.antoine.ASCIIart.alphabets.datas.AlphabetDatas;
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
		AsciiManager ascii = new AsciiManager (new BasicAlphabet());
		
		//System.out.println(ascii.getAsciiTransformation("BOBO"));
		

		System.out.println(ascii.getAsciiTransformation(ScannerProviden.getInstance().getScanner().nextLine()));
	}

	
}
