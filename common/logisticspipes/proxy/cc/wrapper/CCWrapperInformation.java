package logisticspipes.proxy.cc.wrapper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CCWrapperInformation {
	public boolean isCCType = false;
	public String type = "";
	public HashMap<Integer, String> commandMap = new HashMap<Integer, String>();
	public Map<Integer, Method> commands = new LinkedHashMap<Integer, Method>();
	public Method securityMethod = null;
}
