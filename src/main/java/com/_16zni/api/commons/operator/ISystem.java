package com._16zni.api.commons.operator;

public interface ISystem<T extends ISystem<T>> extends Comparable<ISystem<T>>{
	@Override
	public default int compareTo(ISystem<T> system){
		return this == system ? 1 : 0;
	}
}