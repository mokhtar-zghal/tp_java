
public class Point {
float x,y;


public void Afficher() {
	System.out.println("Point [x=" + x + ", y=" + y + "]");
}
void Deplacer(float a,float b) {
	x=a;
	y=b;
}

public float getX() {
	return x;
}

public float getY() {
	return y;
}
Point(){}
Point(float x,float y){
	this.x=x;
	this.y=y;
}
boolean Coincide(Point p) {
	return this.getX()==p.getX() && this.getY()==p.getY();
}
}
