package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Book;
import in.thiru.entity.BookPk;

public interface BookRepo extends JpaRepository<Book, BookPk>{

}
