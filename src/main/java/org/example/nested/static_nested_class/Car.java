package org.example.nested.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public abstract static class Engine2 extends Q {
        int horsePower2;

        public Engine2(int horsePower2) {
            this.horsePower2 = horsePower2;
        }

        @Override
        public String toString() {
            return "Engine2{" +
                    "horsePower2=" + horsePower2 +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(249);
        System.out.println(engine);

        Car car = new Car("Red", 2, engine);
        System.out.println(car);
    }
}

class Q {

}