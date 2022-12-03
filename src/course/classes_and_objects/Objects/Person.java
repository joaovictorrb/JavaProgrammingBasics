package course.classes_and_objects.Objects;

public class Person {
    // Rule No3:
    // -> There can be only one public class per
    // -> source code file
    public String name;
    public int age;
    public String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    public void sleep() {
        if(age < 10) {
            System.out.println(name + " will sleep more than 12 hours in a day");
        } else if (age >= 10 && age <= 50) {
            System.out.println(name + " will sleep less than 10 hours in a day");
        } else {
            System.out.println(name + " will sleep average 10 hours in a day");
        }
    }
}
