public class Demo {
    public static void main(String[] args) {
        Database d1 = new Database();
        d1.put(new Dog("Tom"));
        d1.put(new Dog("Sheba"));
        d1.put(new Dog("Zini"));

        Database d2 = new Database();
        d2.put(new Cat("Tim"));
        d2.put(new Cat("Kitty"));
        d2.put(new Cat("Puss"));

    }
}


class Database {
     void put(Dog d) {
         System.out.println(d.name);
    }

    void put(Cat c){
        System.out.println(c.name);
    }
}

class Dog{
    String name;
    Dog(String name){
        this.name = name;
    }
}

class Cat{
    String name;
    Cat(String name){
        this.name =name;
    }
}
