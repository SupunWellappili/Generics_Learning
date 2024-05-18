public class Demo {
    public static void main(String[] args) {
        Database d1 = new Database();
        d1.put(new Dog("Tom"));
        d1.put(new Dog("Sheba"));
        d1.put(new Dog("Zini"));
    }
}


class Database {
     void put(Dog d) {
         System.out.println(d.name);
    }
}

class Dog{
    String name;
    Dog(String name){
        this.name = name;
    }

}
