package com._16zni.api.commons.operator.exceptions;

import com._16zni.commons.operator.OperatorConstants;

public class IllegalValueException extends IllegalArgumentException{
	private static final long serialVersionUID = OperatorConstants.SERIAL;

	public IllegalValueException(){
		this("Illegal Value Exception !");
	}

	public IllegalValueException(String message){
		this(message, new Throwable(message));
	}

	public IllegalValueException(Throwable cause){
		this("Illegal Value Exception !", cause);
	}

	public IllegalValueException(String message, Throwable cause){
		super(message, cause);
	}
}
