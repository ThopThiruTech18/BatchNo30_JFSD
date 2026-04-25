package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Book_table4")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	public Book(String bookName, Double bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	
	

}
