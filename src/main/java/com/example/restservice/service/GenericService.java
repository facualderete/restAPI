package com.example.restservice.service;

import com.example.restservice.domain.RandomCity;
import com.example.restservice.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}