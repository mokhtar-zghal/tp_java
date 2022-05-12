public class Service {
String nom;
int NumTel;
Employe Chef;
Employe[] Liste;
int NombreEmploye;
public int getNumTel() {
	return NumTel;
}
public void setNumTel(int numTel) {
	NumTel = numTel;
}
public Employe getChef() {
	return Chef;
}
public void setChef(Employe chef) {
	Chef = chef;
}
public String getNom() {
	return nom;
}
public Employe[] getListe() {
	return Liste;
}
public int getNombreEmploye() {
	return NombreEmploye;
}
public void affecterEmploye(Employe E) {
Liste[NombreEmploye]=E;
NombreEmploye++;
E.setService(this);
}
public void eliminerEmployer(Employe E) {
for(int i=0;i<NombreEmploye;i++) {	
	if (Liste[i]==E) {
		for(int j=i+1;j<NombreEmploye;j++) {
			Liste[j-1]=Liste[j];
		}
		NombreEmploye--;
	}
}
}
public Service(String nom, int numTel) {
	this.nom = nom;
	NumTel = numTel;
	Liste=new Employe[6];
}
public String toString() {
String S= "Service [nom=" + nom + ", NumTel=" + NumTel + ", Chef=" + Chef.nom +" Employes[";
for(int i=0;i<NombreEmploye;i++) {
	if (Liste[i]!=Chef){
		S=S+Liste[i].nom+",";
	}
	
}
S+="]]";
return S;
}


}
