package race.outbound;

import race.Car;

import java.util.Collection;

public class OutputView {
    public void render(Collection<Car> cars) {
        cars.forEach((car) -> renderLocation(car.location()));
        System.out.println();
    }

    private void renderLocation(int location) {
        for (int i = 0; i < location; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}