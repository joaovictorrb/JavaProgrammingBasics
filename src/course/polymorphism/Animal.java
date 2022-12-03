package course.polymorphism;

public abstract class Animal {
    private String minSpeed;

    public String getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(String minSpeed) {
        this.minSpeed = minSpeed;
    }

    public abstract void eat();
    public abstract void run();
}
