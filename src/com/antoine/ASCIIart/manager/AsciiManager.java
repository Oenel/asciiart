package com.antoine.ASCIIart.manager;

import com.antoine.ASCIIart.alphabets.DefaultAlphabet;

public class AsciiManager {
	
	private DefaultAlphabet alphabet;
	
	public AsciiManager (DefaultAlphabet alpha) {
		
		this.alphabet = alpha;
		
	}
	
	public String getAsciiTransformation (String message){
		
		
		 int w = alphabet.getW();
	     int h = alphabet.getH();
	     String[] datas = alphabet.getDatas();
		
	     char[] Tab = message.toUpperCase().toCharArray();
	     StringBuilder builder = new StringBuilder();

	     for (int i = 0; i < h; i++){
	         for (int j = 0; j < Tab.length; j++) {
	             if(Tab[j] <= 90 && Tab[j] >= 65) {
	                 builder.append(datas[i].substring((Tab[j]-65)*w, (Tab[j]-65)*w+w));
	             }else {
	                 builder.append(datas[i].substring(26*w, 26*w+w));
	             }
	         }
	         builder.append("\n");

	     }
	     return builder.toString();

	     }
	}



