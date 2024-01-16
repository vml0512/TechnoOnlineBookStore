package com.techconative.onlineBookStore.Entiy;
import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class OnlineBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private int isbn;
	private String bkName;
	private String bkAuthorName;
	private int bkAuthorId;
	private int bkPublishYear;
	private String bkReview;
	
	
	public OnlineBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public OnlineBook(int isbn, String bkName, String bkAuthorName, int bkAuthorId, int bkPublishYear,
			String bkReview) {
		super();
		this.isbn = isbn;
		this.bkName = bkName;
		this.bkAuthorName = bkAuthorName;
		this.bkAuthorId = bkAuthorId;
		this.bkPublishYear = bkPublishYear;
		this.bkReview = bkReview;
	}


	public OnlineBook(int isbn, String bkName, String bkAuthorName, int bkPublishYear, String bkReview) {
		super();
		this.isbn = isbn;
		this.bkName = bkName;
		this.bkAuthorName = bkAuthorName;
		this.bkPublishYear = bkPublishYear;
		this.bkReview = bkReview;
	}
	
	
	
	public int getBkAuthorId() {
		return bkAuthorId;
	}
	public void setBkAuthorId(int bkAuthorId) {
		this.bkAuthorId = bkAuthorId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBkName() {
		return bkName;
	}
	public void setBkName(String bkName) {
		this.bkName = bkName;
	}
	public String getBkAuthorName() {
		return bkAuthorName;
	}
	public void setBkAuthorName(String bkAuthorName) {
		this.bkAuthorName = bkAuthorName;
	}
	public int getBkPublishYear() {
		return bkPublishYear;
	}
	public void setBkPublishYear(int bkPublishYear) {
		this.bkPublishYear = bkPublishYear;
	}
	public String getBkReview() {
		return bkReview;
	}
	public void setBkReview(String bkReview) {
		this.bkReview = bkReview;
	}
	
	@Override
	public String toString() {
		return "OnlineBook [id=" + id + ", isbn=" + isbn + ", bkName=" + bkName + ", bkAuthorName=" + bkAuthorName
				+ ", bkAuthorId=" + bkAuthorId + ", bkPublishYear=" + bkPublishYear + ", bkReview=" + bkReview + "]";
	}

}

