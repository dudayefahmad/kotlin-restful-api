package com.ahmaddudayef.kotlin.restful.repository

import com.ahmaddudayef.kotlin.restful.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {

}