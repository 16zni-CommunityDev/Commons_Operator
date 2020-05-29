package com._16zni.api.commons.operator;

public interface ISetup<T extends ISystem<T>>{
	public ISystem<T> setup();

	public ISystem<T> initSetup();

	public ISystem<T> startSetup();

	public ISystem<T> endSetup();
}
