package com.planningtool.egli.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Entity Not Found")
public class NotFoundException extends RuntimeException {
}
