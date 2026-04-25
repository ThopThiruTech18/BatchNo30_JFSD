package in.thiru.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Book;

public interface BookRepository extends JpaRepository<Book, String>{

}
