import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;

public class SelfDriving {

	final static float wheelDiameter = 60;
	final static float axleLength = 0;
	final static float angularSpeed = 0;
	final static float linearSpeed = 0;
	
	public static void main(String[] args) {
		RegulatedMotor mL = new EV3LargeRegulatedMotor(MotorPort.A);
		RegulatedMotor mR = new EV3LargeRegulatedMotor(MotorPort.B);
		
		Wheel wL = WheeledChassis.modelWheel(mL, wheelDiameter).offset(-axleLength / 2);
		Wheel wR = WheeledChassis.modelWheel(mR, wheelDiameter).offset(axleLength / 2);
		Chassis ch = new WheeledChassis(new Wheel[] {wR, wL}, WheeledChassis.TYPE_DIFFERENTIAL);
		MovePilot plt = new MovePilot(ch);
		
	}
}
