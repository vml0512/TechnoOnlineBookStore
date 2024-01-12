package com.techconative.onlineBookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techconative.onlineBookStore.Entiy.OnlineBook;

@SpringBootApplication
public class OnlineBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
		System.out.println("Running...");

//		OnlineBkDb bkDb = new OnlineBkDb();
//		bkDb.save(new OnlineBook(232, "Xyz", "AuthorXYZ", 1998, "Very Good Story telling"));
//		bkDb.save(new OnlineBook(232, "Adventures of Tom Sawyer: Mark Twain", "Lewis Carrol", 1998,
//				"Very Good Story telling"));
//		bkDb.save(new OnlineBook(232, "Agni Veena: Kazi Nasrul Islam	", "Coleridge", 1998, "Fasinating story"));
//		bkDb.save(new OnlineBook(142, "Animal Farm: George Orwell", "G.B.Shaw", 1934, "Very Good"));
//		bkDb.save(new OnlineBook(45, "Ben Hur: Lewis Wallace", "Jules Verne", 1948, "Very boaring Story"));
//		bkDb.save(new OnlineBook(999, "Baburnama: Babur", "Leo Tolstoy", 1945, "Intresting stories"));
//		bkDb.save(new OnlineBook(83, "Arthashastra: Kautilya", "Jane Austen", 1856, "Intresting Drama"));
//		bkDb.save(new OnlineBook(543, "Anand Math: Bankimchandra Chattopadhyay", "Jean Jacques Rousseau", 1998,
//				"Very Good Story telling"));
//		bkDb.save(new OnlineBook(975, "Mein Kampf: Adolf Hitler", "Jonathan Swift", 2002, "Very Good"));
//		bkDb.save(new OnlineBook(231, "Crime and Punishment: Dostoevsky", "Karl Marx", 1768, "worst Story telling"));

	}

}
