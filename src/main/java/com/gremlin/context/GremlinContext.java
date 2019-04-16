package com.gremlin.context;

import java.util.Optional;

import com.gremlin.failure.Failure;

/**
 * {@link GremlinContext} uses a request context to determine if this request should be impacted. If it returns a
 * failure, you can apply() it via the {@link Failure} interface.
 * @author forni
 */
public final class GremlinContext {
    // TODO fill me in
    public static Optional<Failure> shouldFail(HttpRequestContext httpRequestContext) {
        return Optional.empty();
    }
}
