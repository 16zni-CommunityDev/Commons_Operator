package com._16zni.api.commons.operator;

import java.io.Serializable;

public interface IOperator<T extends IOperator<T>> extends ISystem<T>, ISetup<T>, Serializable{
	@Override
	public default int compareTo(ISystem<T> system){
		return this == system ? 1 : 0;
	}
}