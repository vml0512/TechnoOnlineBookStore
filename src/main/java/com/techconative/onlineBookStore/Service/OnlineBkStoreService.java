package com.techconative.onlineBookStore.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.techconative.onlineBookStore.Entiy.OnlineBook;
import com.techconative.onlineBookStore.OnlineBkStoreRepository.OnlineBkStoreRepo;

@Component
public class OnlineBkStoreService {
	@Autowired
	OnlineBkStoreRepo onlineBkStoreRepo;

	public List<OnlineBook> getAllBooks() {
		return onlineBkStoreRepo.findAll();
	}

	public Optional<OnlineBook> getBookByIsbn(int id) {
		return onlineBkStoreRepo.findByIsbn(id);
	}

	public List<OnlineBook> getBookByauthorId(int bkauthId) {
		return onlineBkStoreRepo.findBybkAuthorId(bkauthId);
	}

	public void deleteByBkIsbn(int isbn) {
		onlineBkStoreRepo.deleteById(isbn);
	}

	public OnlineBook addBook(OnlineBook onlineBk) {
		return onlineBkStoreRepo.save(onlineBk);
	}

	public OnlineBook updateBookReview(OnlineBook onlineBk) {
		System.out.println("onlineBk Review->"+onlineBk);
		OnlineBook exOnlineBk = onlineBkStoreRepo.findByIsbn(onlineBk.getIsbn()).orElse(null);
		exOnlineBk.setBkReview(onlineBk.getBkReview());
		return onlineBkStoreRepo.save(exOnlineBk);
	}

	public OnlineBook updateBook(OnlineBook onlineBk) {
		return onlineBkStoreRepo.save(onlineBk);
	}


}
