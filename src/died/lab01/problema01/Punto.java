package died.lab01.problema01;

public class Punto {

	float x;
	float y;
	
	
	public Punto(float posX, float posY) {
		x = posX;
		y = posY;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object otroPunto) {
		if(this.getClass()==otroPunto.getClass()) {
			if((this.x == ((Punto) otroPunto).getX()) && (this.y == ((Punto) otroPunto).getY())) {
				return true;
			}
		}
		return false;
	}

}
