package course.inheritance;

public class Artist extends Human{
    public void preparePainting() {
        System.out.println(name + " is preparing for painting");
    }

    @Override
    public void walk() {
        System.out.println("Artist: " + name + ", is walking");
    }
}
