package com.antoine.ASCIIart.alphabets;

public abstract class DefaultAlphabet {
	
	private int h;
	private int w;
	private String[]  datas;
	
	public DefaultAlphabet(int h, int w, String[] datas) {
		// TODO Auto-generated constructor stub
		
		this.h = h;
		this.w = w;
		this.datas = datas;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public String[] getDatas() {
		return datas;
	}

	public void setDatas(String[] datas) {
		this.datas = datas;
	}

	
	
}
