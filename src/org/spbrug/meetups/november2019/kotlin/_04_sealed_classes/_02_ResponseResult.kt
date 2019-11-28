package org.spbrug.meetups.november2019.kotlin._04_sealed_classes

sealed class ResponseResult {
    class Success(val content: String): ResponseResult()
    class Failure(val code: Int, val message: String): ResponseResult()
}

fun fetchPage(url: String): ResponseResult {
    val isValid = url.startsWith("http")

    return if (isValid) {
        ResponseResult.Success("Content")
    } else {
        ResponseResult.Failure(
            code = 400,
            message = "Bad Request"
        )
    }
}

fun main() {
    val response = fetchPage("http://localhost:8080/")

    when (response) {
        is ResponseResult.Success -> println(response.content)
        is ResponseResult.Failure -> println("${response.code}: ${response.message}")
        else -> println("unexpected result") // 'when' is exhaustive so 'else' is redundant here
    }
}
