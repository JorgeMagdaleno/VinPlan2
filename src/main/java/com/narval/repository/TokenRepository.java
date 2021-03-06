package com.narval.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.narval.Models.Token;


@Repository
public interface TokenRepository extends CrudRepository<Token, String> {
	Token findByToken(String token);
}
