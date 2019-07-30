package com.carroti.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carroti.boot.models.JwtToken;

@Repository
public interface JwtTokenRepository extends MongoRepository<JwtToken,String> {
}