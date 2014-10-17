package Context.Batteryy;

public class Batt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
		Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);

		System.out.println(batteryStatus); // Shows result of toString() method.
		
	}

}
