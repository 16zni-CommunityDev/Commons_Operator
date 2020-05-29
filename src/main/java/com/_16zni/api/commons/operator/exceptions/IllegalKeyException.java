package com._16zni.api.commons.operator.exceptions;

import com._16zni.commons.operator.OperatorConstants;

public class IllegalKeyException extends IllegalArgumentException{
	private static final long serialVersionUID = OperatorConstants.SERIAL;

	public IllegalKeyException(){
		this("Illegal Value Exception !");
	}

	public IllegalKeyException(String message){
		this(message, new Throwable(message));
	}

	public IllegalKeyException(Throwable cause){
		this("Illegal Value Exception !", cause);
	}

	public IllegalKeyException(String message, Throwable cause){
		super(message, cause);
	}
}
