package com._16zni.commons.operator.os.properties;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import com._16zni.api.commons.operator.exceptions.IllegalKeyException;
import com._16zni.api.commons.operator.exceptions.IllegalValueException;
import com._16zni.commons.operator.OperatorConstants;
import com._16zni.commons.operator.os.OperatingSystem;
import com._16zni.commons.operator.properties.EnumProperties;

public class OperatingSystemProperties extends OperatingSystem{
	private static final long serialVersionUID = OperatorConstants.SERIAL;
	private Map<String, String> properties;
	private Iterator<Entry<String, String>> propertiesEntryIterator;
	
	{
		setProps(new HashMap<>());
		propertiesEntryIterator = getEntrySet().iterator();
	}

	public OperatingSystemProperties(){
	}

	public Map<String, String> getProps(){
		return properties;
	}

	private void setProps(Map<String, String> propertiesMap){
		properties = propertiesMap;
	}

	public void clear(){
		getProps().clear();
	}

	public boolean containsKey(String key){
		checkKey(key);
		return getProps().containsKey(key);
	}

	public boolean containsValue(String value){
		checkValue(value);
		return getProps().containsValue(value);
	}

	public boolean equals(Map<String, String> osPropertiesMap){
		if(osPropertiesMap.isEmpty() || osPropertiesMap == null) throw new NullPointerException("The Operating System Map properties cannot be empty !");
		return getProps().equals(osPropertiesMap);
	}

	public boolean isEmpty(){
		return getProps().isEmpty();
	}

	public Set<Entry<String, String>> getEntrySet(){
		return getProps().entrySet();
	}

	public Set<String> getKeySet(){
		return getProps().keySet();
	}

	public Collection<String> getValues(){
		return getProps().values();
	}

	public String getKey(String value){
		checkValue(value);
		while(propertiesEntryIterator.hasNext()){
			Entry<String, String> propsEntry = propertiesEntryIterator.next();
			if(propsEntry.getValue().equalsIgnoreCase(value)) return propsEntry.getKey();
		}
		return "key:" + OperatorConstants.NULL + "@value:" + value;
	}

	public String getValue(String key){
		checkKey(key);
		return getProps().get(key);
	}

	public void setValue(String key, String value){
		checkKey(key);
		checkValue(value);
		while(propertiesEntryIterator.hasNext()){
			Entry<String, String> propsEntry = propertiesEntryIterator.next();
			if(propsEntry.getKey().equalsIgnoreCase(key)) propsEntry.setValue(value);
		}
	}

	public void add(String key){
		add(key, OperatorConstants.NULL);
	}

	public void add(EnumProperties key){
		add(key, OperatorConstants.NULL);
	}

	public void add(EnumProperties key, String value){
		add(key.getPropertie(), value);
	}

	public void add(String key, String value){
		checkKey(key);
		checkValue(value);
		getProps().put(key, value);
	}

	public void replace(String key, String value){
		checkKey(key);
		checkValue(value);
		getProps().replace(key, value);
	}

	public void replaceWhereOldValueIsNull(String key, String value){
		replace(key, OperatorConstants.NULL, value);
	}

	public void replace(String key, String oldValue, String newValue){
		checkKey(key);
		checkValue(oldValue);
		checkValue(newValue);
		getProps().replace(key, oldValue, newValue);
	}

	public void remove(String key){
		checkKey(key);
		getProps().remove(key);
	}

	public void remove(String key, String value){
		checkKey(key);
		checkValue(value);
		getProps().remove(key, value);
	}

	public int size(){
		return getProps().size();
	}

	private void checkKey(String key){
		if(key.isEmpty() || key == null) throw new IllegalKeyException("The key {" + key + "} is not correct !");
	}

	private void checkValue(String value){
		if(value.isEmpty() || value == null) throw new IllegalValueException("The value {" + value + "} is not correct !");
	}
}