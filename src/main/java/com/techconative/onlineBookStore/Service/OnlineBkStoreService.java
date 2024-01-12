package com.techconative.onlineBookStore.Service;

import java.util.List;

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

}
