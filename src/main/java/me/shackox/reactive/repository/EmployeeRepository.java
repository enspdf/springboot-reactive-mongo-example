package me.shackox.reactive.repository;

import me.shackox.reactive.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by SHACKOX on 1/01/18.
 */
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
