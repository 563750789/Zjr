package com.thounghtworks.zjr_mark.exception;

public class OutOfSessionDurationError extends Throwable {

    public OutOfSessionDurationError() {
    }

    public OutOfSessionDurationError(String message) {
        super(message);
    }
}
