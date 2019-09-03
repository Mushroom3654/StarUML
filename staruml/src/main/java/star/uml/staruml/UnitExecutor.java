package star.uml.staruml;

public class UnitExecutor {
    public static void main( String[] args ) {
    	 Unit u = new Unit();
    	 u.move();
        Marine m = new Marine();
        m.move();
        m.attack();
        Medic d = new Medic();
        d.move();
        d.Healing(null);
    }
}