package com.techconative.onlineBookStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.techconative.onlineBookStore.Entiy.OnlineBook;

//This file is only for testing purpose ...

public class OnlineBkDb {

	Connection con = null;

	public OnlineBkDb() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytechnodb", "admin", "qwertyui");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void save(OnlineBook OnlineBk) {
		String query = "insert into Online_Book(isbn,bkName,bkAuthorName,bk_author_id,bkPublishYear,bkReview) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, OnlineBk.getIsbn());
			ps.setString(2, OnlineBk.getBkName());
			ps.setString(3, OnlineBk.getBkAuthorName());
			ps.setInt(4, OnlineBk.getBkAuthorId());
			ps.setInt(5, OnlineBk.getBkPublishYear());
			ps.setString(6, OnlineBk.getBkReview());
			ps.execute();
			System.out.println(OnlineBk.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		}

	}

}
