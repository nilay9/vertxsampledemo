package com.benchmark.vertxsample.verticle

import com.benchmark.vertxsample.handler.ApiHandler
import io.vertx.core.AbstractVerticle
import io.vertx.ext.web.Router
import org.springframework.stereotype.Component

@Component
class ApiVerticle extends AbstractVerticle {

    private final Router router
    private final ApiHandler apiHandler

    ApiVerticle(
            Router router,
            ApiHandler apiHandler
    ) {
        this.router = router
        this.apiHandler = apiHandler
    }

    @Override
    void start() {

        router.get("/fake/value")
                .handler(apiHandler)

    }

}
