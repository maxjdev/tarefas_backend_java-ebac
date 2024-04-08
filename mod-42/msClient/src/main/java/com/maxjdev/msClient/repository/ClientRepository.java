package com.maxjdev.msClient.repository;

import com.maxjdev.msClient.domain.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}
