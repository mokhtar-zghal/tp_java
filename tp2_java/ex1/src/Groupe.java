

public class Groupe {
String nom;
int num,nbEtud;
etudiant Tetud[];
public int NbEtud() {
	return nbEtud;
}
public etudiant[] listEtud() {
	return Tetud;
}

public String toString() {
	String S=
	"Groupe [nom=" + nom + ", numG=" + num + ", Tetud=";
	for(int i=0;i<nbEtud;i++)
	{S=S+" nomEtud= " +Tetud[i].getNom()+" matricule= " +Tetud[i].getMatricule()+" moyenne= " +Tetud[i].getMoy();}
	return S;
}
public Groupe(String nom, int num) {
	this.nbEtud=0;
	
	this.nom = nom;
	this.num = num;
	Tetud= new etudiant[30];
}
void affecEtud(etudiant e) {
	if (nbEtud==Tetud.length) {
		etudiant[] t1=new etudiant [nbEtud+1] ;
		for(int i=0;i<nbEtud;i++) {
			t1[i]=Tetud[i];
		}
		t1[nbEtud]=e;
		Tetud=t1;
		nbEtud++;
	}
	else {
	Tetud[nbEtud]=e;
	nbEtud++;
	}
}




}
