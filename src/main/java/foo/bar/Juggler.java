package foo.bar;

/**
 * Created by igorv on 28.10.15.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {

    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
     }
}
