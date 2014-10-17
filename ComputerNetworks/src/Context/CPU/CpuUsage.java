package Context.CPU;


import java.lang.management.ManagementFactory;
// import java.lang.management.OperatingSystemMXBean;
import com.sun.management.OperatingSystemMXBean;
import javax.management.MBeanServerConnection;

public class CpuUsage {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MBeanServerConnection mbsc = ManagementFactory.getPlatformMBeanServer();

		OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();

		long nanoBefore = System.nanoTime();
		long cpuBefore = operatingSystemMXBean.getProcessCpuTime();

		// Call an expensive task, or sleep if you are monitoring a remote process

		long cpuAfter = operatingSystemMXBean.getProcessCpuTime();
		long nanoAfter = System.nanoTime();

		long percent;
		if (nanoAfter > nanoBefore)
		 percent = ((cpuAfter-cpuBefore)*100L)/
		   (nanoAfter-nanoBefore);
		else percent = 0;

		System.out.println("Cpu usage: "+percent+"%");
	}

}
