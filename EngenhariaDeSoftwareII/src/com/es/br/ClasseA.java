package com.es.br;

public class ClasseA {

	private int A1;
	private float A2;
	private String A3;
	private String Aprinc4;

	public ClasseA(int a1, float a2, String a3, String Aprinc4) {
		super();
		A1 = a1;
		A2 = a2;
		A3 = a3;
		this.Aprinc4 = Aprinc4;
	}
	
	public int soma(int a1, float a2) {
		return (int) (a1 + a2);
	}
	
	private String getAprinc4() {
		return Aprinc4;
	}

	private void setAprinc4(String aprinc4) {
		Aprinc4 = aprinc4;
	}

	private int getA1() {
		return A1;
	}
	
	private void setA1(int a1) {
		A1 = a1;
	}
	
	private float getA2() {
		return A2;
	}
	
	private void setA2(float a2) {
		A2 = a2;
	}

	private String getA3() {
		return A3;
	}

	private void setA3(String a3) {
		A3 = a3;
	}
	
		
}
