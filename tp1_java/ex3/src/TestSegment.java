
public class TestSegment{
public static void main(String args[]) {
	Point p1=new Point(1,2);
	Point p2=new Point(2,3);
	Segment s=new Segment(p1,p2);
	s.Afficher();
	s.Deplacer_Abs(5);
	s.Deplacer_Ord(1);
	s.Afficher();

	
	
}
}