//Factory Design pattern


public interface Devices {
	void communicate();
}

public class IOT implements Devices {
	@Override
	void commincate() {

	}
}


public class MQTT implements Devices {
	@Override
	void commincate() {
	
	}
}

public class DeviceFactory {
	
	public Device getDevice(String devType) {
		if(devType == null ) {
		return null;

		}

		else if(devType.equals("IOT") ) {
		return new IOT();
		
		}
		else if(devType.equals("MQTT") ) {
		return new MQTT();
		
		}
	}
}

public class Demo {
	
	public static void main(String ... args ) {
	DeviceFactory devFact = new DeviceFactory ();
	Device dev1 = devFact.getDevice("IOT") ;
	dev1.communicate() ; // of IOT

	Device dev2 = devFact.getDevice("MQTT") ;
	dev2.communicate() ; // of MQTT

	}
}
