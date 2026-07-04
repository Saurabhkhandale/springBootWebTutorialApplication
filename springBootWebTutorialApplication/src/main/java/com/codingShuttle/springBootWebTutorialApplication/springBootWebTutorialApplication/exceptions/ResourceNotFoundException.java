package com.codingShuttle.springBootWebTutorialApplication.springBootWebTutorialApplication.exceptions;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
