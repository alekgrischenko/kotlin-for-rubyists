package org.spbrug.meetups.november2019.kotlin._27_typesafe_builders

class Request(val method: String, val query: String, val contentType: String)

class Response(var status: HttpStatus, var body: String) {
    operator fun invoke(status: HttpStatus.() -> Unit) {
        // do some logic here...
    }
}

class HttpStatus(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false

    fun next() {
        executeNext = true
    }
}

// routeHandler is a HOC that is taking not any function but, specifically,
// an extension function of RouteHandler class
fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

/**
 * @see https://kotlinlang.org/docs/reference/type-safe-builders.html
 * @see https://github.com/Kotlin/kotlinx.html
 * @see https://ktor.io/servers/features/routing.html
 * @see https://beust.com/kobalt/home/
 */
fun main() {
    routeHandler("/") {
        if (request.query != "") {
            // process request to the root action
            // ...
            return@routeHandler
        }

        response {
            code = 404
            description = "Not Found"
        }
    }
}
