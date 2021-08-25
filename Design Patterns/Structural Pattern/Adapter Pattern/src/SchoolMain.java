
public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentWork aw = new AssignmentWork();
		Pen p = new PenAdapter();
		aw.setP(p);
		aw.writeAssignment("I am tired to write assignment");
	}

}
/*
 * 	An Adapter Pattern says that just "converts the interface of a class into
 *  another interface that a client wants".
 */