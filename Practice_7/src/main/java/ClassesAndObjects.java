public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 50;
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
    }
}
class Person {
    String name;
    int age;

    void speak () {
        for (int i =0; i<4; i++) {
            System.out.println("меня зовут " + name + "," + "мне " + age + " лет");
        }
    }
    void sayHello() {
        System.out.println("Привет!");
    }
}