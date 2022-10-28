package com.ahmaddudayef.kotlin.restful.config

import com.ahmaddudayef.kotlin.restful.entity.ApiKey
import com.ahmaddudayef.kotlin.restful.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeyConfifSeeder(val apiKeyRepository: ApiKeyRepository) : ApplicationRunner {

    val apiKey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apiKey)) {
            val entity = ApiKey(id = apiKey)
            apiKeyRepository.save(entity)
        }
    }
}