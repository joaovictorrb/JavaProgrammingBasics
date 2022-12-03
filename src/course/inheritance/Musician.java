package course.inheritance;

public class Musician extends Human {
    Keyboard myKeyboard = new Keyboard();
    public void isComposingMusic() {
        System.out.println(name + " is composing a music");
    }

    public void isPlayingMusic() {
        System.out.println(name + " is playing some music!");
        myKeyboard.playsound();
    }

    @Override
    public void walk() {
        System.out.println("Musician: " + name + ", is walking");
    }

    @Override
    public void speak() {
        System.out.println(name + " is singing!");
    }
}
