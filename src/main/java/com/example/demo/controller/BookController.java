package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController //ajax통신위해서
public class BookController {

	@Autowired
	private BookService bs;
	
	@GetMapping("/listBook")
	public List<Book> listBook(){
		return bs.listBook();
	}
	
	@PostMapping("/insertBook")
	public String insertBook(Book b) {
		bs.insertBook(b);
		return "ok";
	}
	
	@PostMapping("/updateBook")
	public void updateBook(Book b) {
		bs.updateBook(b);
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(Book b) {
		bs.deleteBook(b.getBookid());
		return "OK";
	}
}
