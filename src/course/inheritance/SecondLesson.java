package course.inheritance;

public class SecondLesson {
    public static void main(String[] args) {
        Artist a = new Artist();
        Artist b = new Artist();
        // a is equal to b? No!

        Musician m = new Musician();
        m.name = "Amanda";
        m.isPlayingMusic();
    }
}
