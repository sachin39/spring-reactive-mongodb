package com.reactiveprogramming.repo;

import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.reactiveprogramming.entity.Product;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

	Flux<Product> findByPriceBetween(Range<Double> priceRange);

}
