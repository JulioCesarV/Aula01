package aplicacao;


import interfaces.valoresITF;

public class valores implements valoresITF {

	int [] array = new int[10];
	
	
	
	@Override
	public boolean ins(int v) {
		if(v > 0) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				array[i] = v;
				return true;
				}
			}
		}
		return false;	
	}

	
	@Override
	public int del(int i) {
		int aux = 0;
		boolean flag = false;
		
		for (int j = 0; j < array.length; j++) {
			 if(array[j] != 0) {
				 flag = true;
			 }
		}
		
		if(flag == true) {
		if(i>=0 && i<=9) {
		aux = array[i];
		array[i] = 0;
		}else {
			return -1;
		}
		
			return aux;
		}else {
			return -1;
		}
		
	}
	

	@Override
	public int size() {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				cont++;
			}
		}
		
		
		return cont;
	}
	
//	public void imprimir() {
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}

}
