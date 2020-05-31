package com._16zni.commons.operator;

import java.util.Objects;
import com._16zni.api.commons.operator.IOperator;
import com._16zni.commons.operator.os.OperatingSystem;

public class Operator implements IOperator<Operator>{
	private static final long serialVersionUID = OperatorConstants.SERIAL;
	private static Operator instance;
	private static OperatorConstants constants;
	private Bootstrap bootstrap;
	private OperatingSystem os;
	
	/*static{
		setConstants(new OperatorConstants());
	}*/

	public Operator(){
	}

	@Override
	public Operator setup(){
		setInstance(this);
		setConstants(new OperatorConstants());
		setBootstrap(new Bootstrap());
		setOperatingSystem(new OperatingSystem());
		initSetup();
		startSetup();
		endSetup();
		return this;
	}

	@Override
	public Operator initSetup(){
		getBootstrap().preInit(getOperatingSystem());
		return this;
	}

	@Override
	public Operator startSetup(){
		getBootstrap().init(getOperatingSystem());
		return this;
	}

	@Override
	public Operator endSetup(){
		getBootstrap().postInit(getOperatingSystem());
		return this;
	}

	public static Operator getInstance(){
		return instance;
	}

	private static void setInstance(Operator operator){
		Objects.requireNonNull(operator);
		instance = operator;
	}

	public static OperatorConstants getConstants(){
		return constants;
	}

	private static void setConstants(OperatorConstants operatorConstants){
		constants = operatorConstants;
	}

	public Bootstrap getBootstrap(){
		return bootstrap;
	}

	private void setBootstrap(Bootstrap operatorBootstrap){
		bootstrap = operatorBootstrap;
	}

	public OperatingSystem getOperatingSystem(){
		return os;
	}

	private void setOperatingSystem(OperatingSystem operatingSystem){
		os = operatingSystem;
	}
}
