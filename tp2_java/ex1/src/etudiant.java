
public class etudiant {
 String nom ;
int matricule ;
float moy;
Groupe gpe;
public etudiant(String nom, int matricule) {
	this.nom = nom;
	this.matricule = matricule;
}
public Groupe getGpe() {
	return gpe;
}
public void setGpe(Groupe gpe) {
	this.gpe = gpe;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getMatricule() {
	return matricule;
}
public void setMatricule(int matricule) {
	this.matricule = matricule;
}
public float getMoy() {
	return moy;
}
public void setMoy(float moy) {
	this.moy = moy;
}

}
