package died.lab01.problema01;

public class Recta {
	
	Punto puntoA;
	Punto puntoB;
	
	public Recta() {
		this.puntoA.x = this.puntoA.y;
		this.puntoB.x = this.puntoB.y;
	}
	public Recta(Punto p1, Punto p2) {
		puntoA = p1;
		puntoB = p2;
	}
	
	public float pendiente() {
		float pendiente;
		// por si quiero evitar division por 0...
		// if((this.puntoB.x - this.puntoA.x) == 0) return 0; 
		pendiente = (this.puntoB.y - this.puntoA.y) / (this.puntoB.x - this.puntoA.x);
		return pendiente;
	}

	public boolean paralelas(Recta otraRecta) {
		if(this.pendiente() == otraRecta.pendiente()) return true;
		return false;
	}
	
	public boolean equals(Object otraRecta) {
		if(this.getClass()== otraRecta.getClass()) {
			Recta rectaC = new Recta(this.puntoA,((Recta) otraRecta).puntoB);
			if(rectaC.paralelas(this) && rectaC.paralelas((Recta) otraRecta)) return true;
		}
		return false;
	}

}
