package com.bilgeadam.repository;

import com.bilgeadam.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car,Long> {

    List<Car> findAllByNameContainingIgnoreCase(String name);

    List<Car> findAllByBrandIdIs(int id);

    List<Car> findAllByColorIdIs(int id);

    @Query(value = "select * from tblcar as c" ,nativeQuery = true)
    List<Car> filterCarOnlyColorAndBrand();

    List<Car> findAllByDailyPriceLessThanEqual(int price);
}
