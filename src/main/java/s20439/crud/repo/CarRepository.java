package s20439.crud.repo;

import org.springframework.data.repository.CrudRepository;
import s20439.crud.model.Car;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();

}
