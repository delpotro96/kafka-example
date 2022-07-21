package com.example.kafkaexample;

import java.util.Objects;

public final class MessageRequest {
    private final String message;

    MessageRequest(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }


    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "MessageRequest[" +
                "message=" + message + ']';
    }

}
