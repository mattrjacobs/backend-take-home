package com.gremlin.context;

/**
 * This interface represents information we can get out of an HTTP request
 */
interface HttpRequestContext {
    // the incoming HTTP method
    String getHttpMethod();

    // the incoming HTTP path
    String getHttpPath();

    // TODO You may add any methods you'd like that help you build the requested feature.
    // The only constraint is that it should be something that can be found in an HTTP request
    // Don't worry about writing code to actually parse an HTTP request into this interface -
    //   assume someone else has already done that
}
