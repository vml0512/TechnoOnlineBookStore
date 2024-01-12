package com.techconative.onlineBookStore.OnlineBkStoreRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techconative.onlineBookStore.Entiy.OnlineBook;

@Repository
public interface OnlineBkStoreRepo extends JpaRepository<OnlineBook, Integer> {

}
