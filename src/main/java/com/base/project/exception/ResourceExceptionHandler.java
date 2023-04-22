package com.base.project.exception;

import com.base.project.exception.impl.DataBaseException;
import com.base.project.exception.impl.ForbiddenException;
import com.base.project.exception.impl.ResourceNotFoundException;
import com.base.project.exception.impl.UnauthorizedException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

import static com.base.project.util.ResponseUtils.*;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException exception,
                                                        HttpServletRequest request){
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(notFound.value());
		err.setError("Resource not found.");
		err.setMessage(exception.getMessage());
		err.setPath(request.getRequestURI());

		return ResponseEntity.status(notFound).body(err);
	}

	@ExceptionHandler(DataBaseException.class)
	public ResponseEntity<StandardError> dataBase(DataBaseException exception,
														HttpServletRequest request){
		StandardError err = new StandardError();

		err.setTimestamp(Instant.now());
		err.setStatus(badRequest.value());
		err.setError("DataBase exception.");
		err.setMessage(exception.getMessage());
		err.setPath(request.getRequestURI());

		return ResponseEntity.status(badRequest).body(err);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException exception,
                                                      HttpServletRequest request){
		ValidationError err = new ValidationError();

		err.setTimestamp(Instant.now());
		err.setStatus(unprocessable_entity.value());
		err.setError("Validation exception.");
		err.setMessage(exception.getMessage());
		err.setPath(request.getRequestURI());

		for (FieldError error : exception.getBindingResult().getFieldErrors()){
			err.addError(error.getField(), error.getDefaultMessage());
		}

		return ResponseEntity.status(unprocessable_entity).body(err);
	}

	@ExceptionHandler(ForbiddenException.class)
	public ResponseEntity<OAuthCustomError> forbidden(ForbiddenException exception,
													  HttpServletRequest request){
		OAuthCustomError err = new OAuthCustomError();
		err.setError("Forbidden!");
		err.setErrorDescription(exception.getMessage());
		return ResponseEntity.status(forbidden).body(err);
	}

	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<OAuthCustomError> unauthorized(UnauthorizedException exception,
													  HttpServletRequest request){
		OAuthCustomError err = new OAuthCustomError();
		err.setError("Unauthorized!");
		err.setErrorDescription(exception.getMessage());
		return ResponseEntity.status(unauthorized).body(err);
	}
}
