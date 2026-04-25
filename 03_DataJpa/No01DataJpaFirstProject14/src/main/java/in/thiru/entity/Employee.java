package in.thiru.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee { // hql,sql

	@Id
	private Integer empId; // emp_id(unique + not null)
	private String empName;// emp_name
	private Double empSal;// emp_sal

	@CreationTimestamp
	@Column(name = "create_date", updatable = false)
	private LocalDateTime createDate;

	@UpdateTimestamp
	@Column(name = "update_date", insertable = false)
	private LocalDateTime updateDate;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, Double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

// setters & getters[alt + shift +sr)
//0-param constructor[cntrl+spacebar] & param-constructor[alt+shift+so]
//(2s)to String[alt + shitft + ss)

}
