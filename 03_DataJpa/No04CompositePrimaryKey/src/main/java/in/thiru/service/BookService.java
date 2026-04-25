package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Book;
import in.thiru.entity.BookPk;
import in.thiru.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public void insertBook() {

		BookPk bookPk = new BookPk();
		bookPk.setBookId(101);
		bookPk.setBookName("Java");

		Book book = new Book();

		book.setAuthorName("Kiran");
		book.setBookPrice(5000.00);
		book.setBookPk(bookPk);

		bookRepo.save(book);
	}

}
