package in.thiru.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.thiru.entity.Employee;
import java.util.List;


@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{
	
	
	//select * from employee where employeeName =: ?
	List<Employee> findByEmpName(String empName);
     List<Employee> getByEmpSal(Double empSal);
     List<Employee> findByEmpSalBetween(Double startSal,Double endSal);
     List<Employee> readByEmpSalLessThan(Double salary);
     
     
//     private String empName;//emp_name
// 	private Double empSal;//emp_sal
     
     

}
