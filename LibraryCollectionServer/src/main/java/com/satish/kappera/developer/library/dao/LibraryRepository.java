package com.satish.kappera.developer.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satish.kappera.developer.library.model.Library;


@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
    Library findByName(String name);
	//2nd comment
}