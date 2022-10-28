package com.ahmaddudayef.kotlin.restful.controller

import com.ahmaddudayef.kotlin.restful.error.NotFoundException
import com.ahmaddudayef.kotlin.restful.error.UnauthorizedException
import com.ahmaddudayef.kotlin.restful.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandle(constraintViolatException: ConstraintViolationException): WebResponse<String> {
        return WebResponse(
            code = 400,
            status = "BAD REQUEST",
            data = constraintViolatException.message!!
        )
    }

    @ExceptionHandler(value = [NotFoundException::class])
    fun notFound(notfoundException: NotFoundException): WebResponse<String> {
        return WebResponse(
            code = 404,
            status = "NOT FOUND",
            data = "Not Found"
        )
    }

    @ExceptionHandler(value = [UnauthorizedException::class])
    fun unauthorized(unauthorized: UnauthorizedException): WebResponse<String> {
        return WebResponse(
            code = 401,
            status = "UNAUTHORIZED",
            data = "Please put your X-Api-Key"
        )
    }
}