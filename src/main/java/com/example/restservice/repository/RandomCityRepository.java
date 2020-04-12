package com.example.restservice.repository;

import com.example.restservice.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
