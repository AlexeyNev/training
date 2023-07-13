package org.example.interface_function.Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

/**
 * Supplier поставляет объекты
 * Consumer принимает объекты (в нашем случае изменяем объект с помощью него)
 */
public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Silver", 1.6));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), s -> {s.color = "red"; s.engine = 2.0;
            System.out.println(s);});
        System.out.println(ourCars);
    }
}
