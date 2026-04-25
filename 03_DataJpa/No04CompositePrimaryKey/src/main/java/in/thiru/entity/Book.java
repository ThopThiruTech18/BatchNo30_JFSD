package in.thiru.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Table(name ="Book_Composite_Table")
public class Book {

	private Double bookPrice;
	private String authorName;

	@EmbeddedId
	private BookPk bookPk;

}
