package com.ahmaddudayef.kotlin.restful.auth

import org.springframework.stereotype.Component
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Component
class ApiKeyConfiguration(val apiKeyInterceptor: ApiKeyinterceptor): WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        super.addInterceptors(registry)
        registry.addWebRequestInterceptor(apiKeyInterceptor)
    }
}