package com._16zni.commons.operator.systems.processors;

public enum EnumProcessors implements IProcessor{
	TYPE(0, Type.class), ARCH(1, Arch.class);

	private byte id;
	private Class<? extends IProcessor> processor;

	EnumProcessors(int id, Class<? extends IProcessor> processor){
		setId((byte)id);
		setProcessor(processor);
	}

	public byte getId(){
		return id;
	}

	public void setId(byte id){
		this.id = id;
	}

	public Class<? extends IProcessor> getProcessor(){
		return processor;
	}

	public void setProcessor(Class<? extends IProcessor> processor){
		this.processor = processor;
	}

	public static IProcessor getType(){
		return TYPE;
	}

	public static IProcessor getArchitecture(){
		return ARCH;
	}

	private enum Type implements IProcessor{
		X86(), IA_32(), IA_64(), PPC(), UNKNOWN();
	}

	private enum Arch implements IProcessor{
		x32_BIT(), x64_BIT(), UNKNOWN();
	}
}
