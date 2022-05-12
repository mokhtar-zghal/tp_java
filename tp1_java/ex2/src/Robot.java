
public class Robot {
int x,y;
char or;
public Robot() {
	this.or = 'n';
}
void TournerDroite() {
	switch(or) {
	case 'n': or='e';break;
	case 'e': or='s';break;
	case 's': or='o';break;
	case 'o': or='n';break;

	}
}
void Avancer() {
	switch(or) {
	case 'n': y++;break;
	case 'e': x++;break;
	case 's': y--;break;
	case 'o': x--;break;
}
}
void Avancer(int NbPas) {
	switch(or) {
	case 'n': y+=NbPas;break;
	case 'e': x+=NbPas;break;
	case 's': y-=NbPas;break;
	case 'o': x-=NbPas;break;
}
}

public void Afficher() {
	System.out.println( "Robot [x=" + x + ", y=" + y + ", or=" + or + "]");
}

}
