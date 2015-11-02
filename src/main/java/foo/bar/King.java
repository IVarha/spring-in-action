package foo.bar;

/**
 * Created by igorv on 29.10.15.
 */
public class King {
    private King(){}

    public void say(){
        System.out.println("I Am KING");
    }

    private static class KingSingletonHolder {
        static King instanse = new King();
    }

    public static King getInstance(){
        return KingSingletonHolder.instanse;
    }
}
