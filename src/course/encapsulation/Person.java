package course.encapsulation;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String gender;


    public Person(String name, int age, String gender) {
        System.out.println("Person 3 arg constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {
        System.out.println("Person Default Constructor");
    }

    public void sleep() {
        if (age < 10) {
            System.out.println(name + "will sleep more than 12 hours a day");
        } else if (age>= 10 && age <=50) {
            System.out.println(name + "will sleep less than 10 hours a day");
        } else {
            System.out.println(name + "will sleep average of 10 hours a day");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }


    // SETCLASS CHANGE
    @Override
    public boolean equals(Object o) {
        return o instanceof Person && this.name.equals((((Person) o).name));
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
