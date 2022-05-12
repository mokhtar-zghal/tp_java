public class Auteur {
String nom;
Livre[] livres;
int nombre;
public String getNom() {
	return nom;
}
public void NouveauLivre(Livre livre) {
	livres[nombre] = livre;
	nombre++;
}
public String toString() {
	String S="Auteur[nom=" + nom + " livres[";
	for(int i=0;i<nombre;i++) {
		S=S+livres[i].getTitre()+",";
	}
	S+="]";
	return S;
}
public void Affiche() {
	System.out.println(toString());
}
public Auteur(String nom) {
	this.nom = nom;
	livres=new Livre[100];
	nombre=0;
}
}
