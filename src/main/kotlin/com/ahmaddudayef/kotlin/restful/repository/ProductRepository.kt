package com.ahmaddudayef.kotlin.restful.repository

import com.ahmaddudayef.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {

}