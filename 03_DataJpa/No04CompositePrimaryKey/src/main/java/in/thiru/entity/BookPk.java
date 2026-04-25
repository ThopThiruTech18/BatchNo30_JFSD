package in.thiru.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
public class BookPk {
	private Integer bookId;
	private String bookName;

}
