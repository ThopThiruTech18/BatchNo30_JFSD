package in.thiru;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Employee;
import in.thiru.repository.EmployeeRepository;

@SpringBootApplication
public class No01DataJpaFirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No01DataJpaFirstProjectApplication.class, args);
	
		EmployeeRepository empRepObj = run.getBean(EmployeeRepository.class);
		
		Employee emp1 = new Employee(1, "Arjun", 20000.0);
		Employee emp2 = new Employee(2, "Vijay", 21000.0);
		Employee emp3 = new Employee(3, "Ravi", 22000.0);
		Employee emp4 = new Employee(4, "Kiran", 23000.0);
		Employee emp5 = new Employee(5, "Rahul", 24000.0);
		Employee emp6 = new Employee(6, "Suresh", 25000.0);
		Employee emp7 = new Employee(7, "Mahesh", 26000.0);
		Employee emp8 = new Employee(8, "Naresh", 27000.0);
		Employee emp9 = new Employee(9, "Praveen", 28000.0);
		Employee emp10 = new Employee(10, "Ramesh Kumar", 29000.0);

		Employee emp11 = new Employee(11, "Deepak", 30000.0);
		Employee emp12 = new Employee(12, "Anil", 31000.0);
		Employee emp13 = new Employee(13, "Sunil", 32000.0);
		Employee emp14 = new Employee(14, "Ajay", 33000.0);
		Employee emp15 = new Employee(15, "Vikas", 34000.0);
		Employee emp16 = new Employee(16, "Manoj", 35000.0);
		Employee emp17 = new Employee(17, "Amit", 36000.0);
		Employee emp18 = new Employee(18, "Rohit", 37000.0);
		Employee emp19 = new Employee(19, "Vinay", 38000.0);
		Employee emp20 = new Employee(20, "Rajesh", 39000.0);

		Employee emp21 = new Employee(21, "Santosh", 40000.0);
		Employee emp22 = new Employee(22, "Harish", 41000.0);
		Employee emp23 = new Employee(23, "Gopi", 42000.0);
		Employee emp24 = new Employee(24, "Srinivas", 43000.0);
		Employee emp25 = new Employee(25, "Teja", 44000.0);
		Employee emp26 = new Employee(26, "Naveen", 45000.0);
		Employee emp27 = new Employee(27, "Karthik", 46000.0);
		Employee emp28 = new Employee(28, "Lokesh", 47000.0);
		Employee emp29 = new Employee(29, "Chandu", 48000.0);
		Employee emp30 = new Employee(30, "Srikanth", 49000.0);

		Employee emp31 = new Employee(31, "Tarun", 50000.0);
		Employee emp32 = new Employee(32, "Uday", 51000.0);
		Employee emp33 = new Employee(33, "Varun", 52000.0);
		Employee emp34 = new Employee(34, "Yash", 53000.0);
		Employee emp35 = new Employee(35, "Zubair", 54000.0);
		Employee emp36 = new Employee(36, "Imran", 55000.0);
		Employee emp37 = new Employee(37, "Sameer", 56000.0);
		Employee emp38 = new Employee(38, "Faizal", 57000.0);
		Employee emp39 = new Employee(39, "Irfan", 58000.0);
		Employee emp40 = new Employee(40, "Salman", 59000.0);

		Employee emp41 = new Employee(41, "Aravind", 60000.0);
		Employee emp42 = new Employee(42, "Bharath", 61000.0);
		Employee emp43 = new Employee(43, "Chetan", 62000.0);
		Employee emp44 = new Employee(44, "Dinesh", 63000.0);
		Employee emp45 = new Employee(45, "Eshwar", 64000.0);
		Employee emp46 = new Employee(46, "Farhan", 65000.0);
		Employee emp47 = new Employee(47, "Girish", 66000.0);
		Employee emp48 = new Employee(48, "Hemanth", 67000.0);
		Employee emp49 = new Employee(49, "Ishwar", 68000.0);
		Employee emp50 = new Employee(50, "Jagan", 69000.0);

		Employee emp51 = new Employee(51, "Kishore", 70000.0);
		Employee emp52 = new Employee(52, "Lakshman", 71000.0);
		Employee emp53 = new Employee(53, "Madhav", 72000.0);
		Employee emp54 = new Employee(54, "Nitin", 73000.0);
		Employee emp55 = new Employee(55, "Omkar", 74000.0);
		Employee emp56 = new Employee(56, "Prasad", 75000.0);
		Employee emp57 = new Employee(57, "Qasim", 76000.0);
		Employee emp58 = new Employee(58, "Raghu", 77000.0);
		Employee emp59 = new Employee(59, "Shiva", 78000.0);
		Employee emp60 = new Employee(60, "Tejas", 79000.0);

		Employee emp61 = new Employee(61, "Umesh", 80000.0);
		Employee emp62 = new Employee(62, "Venu", 81000.0);
		Employee emp63 = new Employee(63, "Waseem", 82000.0);
		Employee emp64 = new Employee(64, "Xavier", 83000.0);
		Employee emp65 = new Employee(65, "Yogesh", 84000.0);
		Employee emp66 = new Employee(66, "Zeeshan", 85000.0);
		Employee emp67 = new Employee(67, "Abhinav", 86000.0);
		Employee emp68 = new Employee(68, "Balaji", 87000.0);
		Employee emp69 = new Employee(69, "Charan", 88000.0);
		Employee emp70 = new Employee(70, "Dev", 89000.0);

		Employee emp71 = new Employee(71, "Eshaan", 90000.0);
		Employee emp72 = new Employee(72, "Fahad", 91000.0);
		Employee emp73 = new Employee(73, "Gautam", 92000.0);
		Employee emp74 = new Employee(74, "Hari", 93000.0);
		Employee emp75 = new Employee(75, "Ibrahim", 94000.0);
		Employee emp76 = new Employee(76, "Jitendra", 95000.0);
		Employee emp77 = new Employee(77, "Kunal", 96000.0);
		Employee emp78 = new Employee(78, "Lohith", 97000.0);
		Employee emp79 = new Employee(79, "Manish", 98000.0);
		Employee emp80 = new Employee(80, "Naveed", 99000.0);

		Employee emp81 = new Employee(81, "Om", 100000.0);
		Employee emp82 = new Employee(82, "Prithvi", 101000.0);
		Employee emp83 = new Employee(83, "Qureshi", 102000.0);
		Employee emp84 = new Employee(84, "Ranjith", 103000.0);
		Employee emp85 = new Employee(85, "Sharath", 104000.0);
		Employee emp86 = new Employee(86, "Tahir", 105000.0);
		Employee emp87 = new Employee(87, "Ujjwal", 106000.0);
		Employee emp88 = new Employee(88, "Vardhan", 107000.0);
		Employee emp89 = new Employee(89, "Wasim", 108000.0);
		Employee emp90 = new Employee(90, "Yatin", 109000.0);

		Employee emp91 = new Employee(91, "Aditya", 110000.0);
		Employee emp92 = new Employee(92, "Bhavesh", 111000.0);
		Employee emp93 = new Employee(93, "Chirag", 112000.0);
		Employee emp94 = new Employee(94, "Darshan", 113000.0);
		Employee emp95 = new Employee(95, "Ekansh", 114000.0);
		Employee emp96 = new Employee(96, "Firoz", 115000.0);
		Employee emp97 = new Employee(97, "Gagan", 116000.0);
		Employee emp98 = new Employee(98, "Hitesh", 117000.0);
		Employee emp99 = new Employee(99, "Indrajit", 118000.0);
		Employee emp100 = new Employee(100, "Jeevan", 119000.0);
		Employee emp101 = new Employee(100, "king", 119000.0);
		
		List<Employee> empList = Arrays.asList(
			    emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10,
			    emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,
			    emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
			    emp31, emp32, emp33, emp34, emp35, emp36, emp37, emp38, emp39, emp40,
			    emp41, emp42, emp43, emp44, emp45, emp46, emp47, emp48, emp49, emp50,
			    emp51, emp52, emp53, emp54, emp55, emp56, emp57, emp58, emp59, emp60,
			    emp61, emp62, emp63, emp64, emp65, emp66, emp67, emp68, emp69, emp70,
			    emp71, emp72, emp73, emp74, emp75, emp76, emp77, emp78, emp79, emp80,
			    emp81, emp82, emp83, emp84, emp85, emp86, emp87, emp88, emp89, emp90,
			    emp91, emp92, emp93, emp94, emp95, emp96, emp97, emp98, emp99, emp100,emp101
			);
		
		
		empRepObj.saveAll(empList);
		
	}

}
