package com.satish.kappera.developer.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satish.kappera.developer.library.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
	

}