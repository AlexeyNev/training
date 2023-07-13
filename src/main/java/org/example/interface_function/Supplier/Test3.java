package org.example.interface_function.Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Supplier поставляет объекты
 */
public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Silver", 1.6));
        System.out.println(ourCars);
    }
}
