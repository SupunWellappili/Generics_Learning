public class Demo {
    public static void main(String[] args) {
        Database<Dog> db1 = new Database<>(new Dog("Tom"));

        Database<Cat> db2 = new Database<>(new Cat("Tim"));
    }
}


class Database<T> {
    T o1;

    Database(T t) {
        this.o1 = t;
    }

    <T> T put(T d) {
        return d;
    }
}

class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }
}

class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }
}
