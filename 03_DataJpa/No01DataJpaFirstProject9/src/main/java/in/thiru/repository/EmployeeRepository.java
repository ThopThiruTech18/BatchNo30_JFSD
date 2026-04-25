package in.thiru.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.thiru.entity.Employee;
import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

	//HQL  -->  SQL  --> DB
	@Query("From Employee")
	public List<Employee> getEmployeesHql();
	
	@Query("From Employee where empId =:id")
	public Employee getEmployeeByIdHql(Integer id);
	
	
	@Query("From Employee where empName =:name")
	public List<Employee> getEmployeeByNameHql(String name);
	
	@Query("From Employee where empSal =:empSal")
	public List<Employee> getEmployeeBySalaryHql(Double empSal);
	
	@Transactional
	@Modifying
	@Query("delete from Employee where empId =:id")
	public void deleteEmployeeById(Integer id);
	
	
	
	
	
	//SQL
	@Query(value="select * from employee",nativeQuery = true)
	public List<Employee> getEmployeesSql();
	
	@Query(value="select * from employee where emp_id = :id",nativeQuery = true)
	public Employee getEmployeeByIdSql(Integer id);
	
	
	@Query(value="select *  From Employee where emp_Name =:name",nativeQuery = true)
	public List<Employee> getEmployeeByNameSql(String name);
	
	
	@Query(value="select *  From Employee where emp_sal =:empSal",nativeQuery = true)
	public List<Employee> getEmployeeBySalarySql(Double empSal);
	
	
	@Transactional
	@Modifying
	@Query(value="delete from employee where emp_id =:id",nativeQuery = true)
	public void deleteEmployeeByIdSql(Integer id);
	
	
	
	
	
	
	
}
