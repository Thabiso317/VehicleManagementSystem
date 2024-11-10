import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    Car getCarById(Long id);

    Car addCar(Car car);

    Car updateCar(Long id, Car car);

    void deleteCar(Long id);

    List<Car> getAvailableCars();
}
