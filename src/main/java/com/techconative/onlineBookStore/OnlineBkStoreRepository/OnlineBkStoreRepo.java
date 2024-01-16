package com.techconative.onlineBookStore.OnlineBkStoreRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.techconative.onlineBookStore.Entiy.OnlineBook;

@Repository
public interface OnlineBkStoreRepo extends JpaRepository<OnlineBook, Integer> {

	public Optional<OnlineBook> findByIsbn(int isbn);

	public List<OnlineBook> findBybkAuthorId(int bkauthorId);	

}
