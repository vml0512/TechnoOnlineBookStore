package com.techconative.onlineBookStore.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.techconative.onlineBookStore.Entiy.OnlineBook;
import com.techconative.onlineBookStore.Service.OnlineBkStoreService;

@RestController
public class OnlineBkStoreController {

	@Autowired
	OnlineBkStoreService onlineBkStoreService;

	@GetMapping("/TechOnlineBkStore/api/books")
	public List<OnlineBook> getAllBooks() {
		return onlineBkStoreService.getAllBooks();
	}

	@GetMapping("/TechOnlineBkStore/api/books/{isbn}")
	public Optional<OnlineBook> getBookByIsbn(@PathVariable int isbn) {
		Optional<OnlineBook> bkIsbn = null;
		bkIsbn = onlineBkStoreService.getBookByIsbn(isbn);
		if (bkIsbn.isPresent()) {
			return bkIsbn;
		} else
			return bkIsbn;
	}

	@GetMapping("/TechOnlineBkStore/api/authors/{authorId}")
	public List<OnlineBook> getBookBybkauthorId(@PathVariable int authorId) {
		List<OnlineBook> bkauthorId = null;
		bkauthorId = onlineBkStoreService.getBookByauthorId(authorId);
		if (!bkauthorId.isEmpty()) {
			return bkauthorId;
		} else
			return bkauthorId;
	}

	@DeleteMapping("/TechOnlineBkStore/api/books/{isbn}")
	public String deleteByPlayerId(@PathVariable int isbn) {
		Optional<OnlineBook> bkIsbn = null;
		bkIsbn = onlineBkStoreService.getBookByIsbn(isbn);
		System.out.println("getby Isbn -->" + bkIsbn);

		if (bkIsbn.isPresent()) {
			System.out.println("ID to be Deleted -->" + bkIsbn.get().getId());
			onlineBkStoreService.deleteByBkIsbn(bkIsbn.get().getId());
			return "Deleted successfully ..!";
		} else
			return "Data not found..!";
	}

	@PostMapping("/TechOnlineBkStore/api/books")
	public String addBooks(@RequestBody OnlineBook onlineBk) {
		try {
			OnlineBook addOnlineBk = onlineBkStoreService.addBook(onlineBk);
			if (addOnlineBk != null)
				return "Book added successfully in the store ..!";
			else
				return "Server error..!";
		} catch (Exception e) {
			return "Server error,Please try again later..!";
		}

	}

	@PutMapping("/TechOnlineBkStore/api/books/{isbn}/reviews")
	public String addBookReviews(@PathVariable int isbn, @RequestBody OnlineBook onlineBkReview) {
		Optional<OnlineBook> bkIsbn = null;
		bkIsbn = onlineBkStoreService.getBookByIsbn(isbn);
		if (bkIsbn.isPresent()) {
			OnlineBook addOnlineBk = onlineBkStoreService.updateBookReviewByIsbn(onlineBkReview);
			if (addOnlineBk != null)
				return "Reviews are added successfully for this book ..!";
			else
				return "Server error..!";
		} else
			return "Sorry ....book not found";
	}

	@PutMapping("/TechOnlineBkStore/api/books/{isbn}")
	public String updateBookByIsbn(@PathVariable int isbn, @RequestBody OnlineBook onlineBk) {
		try {
			Optional<OnlineBook> bkIsbn = null;
			bkIsbn = onlineBkStoreService.getBookByIsbn(isbn);
			if (bkIsbn.isPresent()) {
				OnlineBook updateOnlineBk = onlineBkStoreService.updateBook(onlineBk);
				if (updateOnlineBk != null)
					return "Updated successfully for this book ..!";
				else
					return "Server error..!";
			} else
				return "Sorry ....book not found";
		} catch (Exception e) {
			return "Server error,Please try again later..!";
		}

	}

}
