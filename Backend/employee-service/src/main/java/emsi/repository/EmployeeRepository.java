// src/main/java/emsi/repository/EmployeeRepository.java
package emsi.repository;

import emsi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
