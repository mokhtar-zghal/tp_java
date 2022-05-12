
public class Compte {
String num;
float solde;
Compte(String num,float solde){
	this.num=num;
	this.solde=solde;
}
void Crediter(float montant) {
	solde+=montant;
}
void Debiter(float montant) {
	solde-=montant;
}
public float getSolde() {
	return solde;
}

public void Affiche() {
	System.out.println( "Compte [num=" + num + ", solde=" + solde + "]");
}
boolean Verif(String numC) {
	return num.equals(numC);
}
}
