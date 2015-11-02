package foo.bar;

/**
 * Created by igorv on 28.10.15.
 */
public class DanceJuggler extends Juggler {
    private Dance dance;

    public DanceJuggler() {
    }

    public DanceJuggler(int beanBags,Dance dance) {
        super(beanBags);
        this.dance = dance;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("wait");
        dance.doit();
    }
}
