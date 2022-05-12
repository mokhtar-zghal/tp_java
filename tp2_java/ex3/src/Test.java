public class Test {
public static void main(String args[]) {
Auteur A1=new Auteur("A1");
Auteur A2=new Auteur("A2");
Livre L1=new Livre("L1",new Auteur[] {A1,A2});
A1.Affiche();
System.out.println("premier_auteur:"+L1.getPremierAuteur().getNom());
}
}
