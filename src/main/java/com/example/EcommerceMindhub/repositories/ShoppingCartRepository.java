package com.example.EcommerceMindhub.repositories;

import com.example.EcommerceMindhub.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
