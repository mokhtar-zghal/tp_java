
public class Employe {
String nom,grade;
float salaire;
Service service;
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public Service getService() {
	return service;
}
public void setService(Service service) {
	this.service = service;
}
public String getNom() {
	return nom;
}
public float getSalaire() {
	return salaire;
}
public String toString() {
	return "Employe [nom=" + nom + ", grade=" + grade + ", salaire=" + salaire + ", service=" + service.nom + "]";
}
public Employe(String nom, String grade, float salaire) {
	super();
	this.nom = nom;
	this.grade = grade;
	this.salaire = salaire;
}

}
