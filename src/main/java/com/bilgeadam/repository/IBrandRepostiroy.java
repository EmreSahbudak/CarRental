package com.bilgeadam.repository;

import com.bilgeadam.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandRepostiroy extends JpaRepository<Brand,Long> {
}
