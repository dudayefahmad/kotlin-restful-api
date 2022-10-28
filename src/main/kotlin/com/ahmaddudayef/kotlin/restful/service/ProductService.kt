package com.ahmaddudayef.kotlin.restful.service

import com.ahmaddudayef.kotlin.restful.model.CreateProductRequest
import com.ahmaddudayef.kotlin.restful.model.ListProductRequest
import com.ahmaddudayef.kotlin.restful.model.ProductResponse
import com.ahmaddudayef.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}