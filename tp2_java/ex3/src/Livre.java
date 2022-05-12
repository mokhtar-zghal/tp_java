public class Livre {
String titre;
Auteur[] auteurs;
public String getTitre() {
	return titre;
}
public Livre(String titre, Auteur[] auteurs) {
	this.titre = titre;
	this.auteurs=auteurs;
	for(int i=0;i<auteurs.length;i++) {
		auteurs[i].NouveauLivre(this);
	}
}
public Auteur getPremierAuteur() {
	return auteurs[0];
}
}
