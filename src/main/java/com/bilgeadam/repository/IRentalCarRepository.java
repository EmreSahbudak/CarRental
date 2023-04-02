package com.bilgeadam.repository;

import com.bilgeadam.entity.RentalCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentalCarRepository extends JpaRepository<RentalCar,Long> {
}
