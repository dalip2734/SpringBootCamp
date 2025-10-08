package com.example.book_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
}


record Book(@Id Long id,String title){
	interface BookRepository extends CrudRepository<Book,Long>{

	}

}


@RestController
@RequestMapping("/books")
class BookController{
	private final BookRepository bookRepository;

	BookController(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}
	@GetMapping
	Iterable<Book> getAllBooks(){
		return this.bookRepository.findAll();
	}

		@PostMapping
	Iterable<Book> addNewBook(@RequestBody Book book){
		return this.bookRepository.save();
	}
}