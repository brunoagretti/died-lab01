package Problema1;

import java.util.Random;

public class Casino {

	public Casino() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		byte apuesta[] =  {12,13,14}; //new byte[3];
		float montoApostado[] = {100f,200f,150f}; //new float[3];
		
		Random seed = new Random();
		int nroSorteado = seed.nextInt(37);

		
		int cuantosAposto = 0;
		for(int i=0;i<montoApostado.length;i++) {
			if(montoApostado[i]>0) cuantosAposto++;
		}
		
		int indiceAcierto = 0;
		
		for(byte numero:apuesta) {
			if(numero==nroSorteado) {
				break;
			}else {
				indiceAcierto++;
			}
		}
		
		System.out.println("Numero sorteado: " + nroSorteado);
		System.out.println("Indice: " + indiceAcierto);
		

		
		if(nroSorteado==0 || indiceAcierto==3) {
			System.out.println("La casa gana...");
		}else {
			
			float premio = 0f;
			switch(cuantosAposto) {
				case 1:
					premio = 36*montoApostado[indiceAcierto];
					break;
				case 2:
					premio = 18*montoApostado[indiceAcierto];
					break;
				case 3:
					premio = 12*montoApostado[indiceAcierto];
					break;
			

			}
			System.out.println("Premio: " + premio);
		}
		
	}

}
