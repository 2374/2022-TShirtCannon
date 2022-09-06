package frc.robot.util;

public class Toolkit {

    public static double deadZone(double axisValue, double deadValue) {
		return Math.abs(axisValue) > deadValue ? axisValue : 0.0;
	}

}
