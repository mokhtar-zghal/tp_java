public class Test {
	public static void main(String args[]) {
Service S1= new Service("S1",74);
Service S2= new Service("s2",75);
Employe E1=new Employe("amir","dir",1300);
Employe E2=new Employe("kamir","dir",1300);
Employe E3=new Employe("hamir","dir",1300);
Employe E4=new Employe("samir","dir",1300);
S1.affecterEmploye(E1);
S1.affecterEmploye(E2);
S2.affecterEmploye(E3);
S2.affecterEmploye(E4);
S1.setChef(E1);
S2.setChef(E3);
System.out.println(S1.toString());
S1.eliminerEmployer(E2);
S2.affecterEmploye(E2);
S2.eliminerEmployer(E4);
S1.affecterEmploye(E4);
E2.salaire=E2.getSalaire()+200;
S2.setChef(E2);
System.out.println(S1.getChef().toString());
System.out.println(S2.getChef().toString());
}
}