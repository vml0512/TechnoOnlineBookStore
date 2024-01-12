package com.techconative.onlineBookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techconative.onlineBookStore.Entiy.OnlineBook;
import com.techconative.onlineBookStore.Service.OnlineBkStoreService;

@RestController
public class OnlineBkStoreController {
	
	@Autowired
	OnlineBkStoreService onlineBkStoreService;
	
	
	  @GetMapping("/TechOnlineBkStore/BookStore/")
	  public List<OnlineBook> getAllBooks(){ 
		  return onlineBkStoreService.getAllBooks();
	  }
	 

}
