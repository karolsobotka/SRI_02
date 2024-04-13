package s20439.crud.repo;

import org.springframework.data.repository.CrudRepository;
import s20439.crud.model.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();

}
