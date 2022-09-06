// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PneumaticsModuleType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
	/*
    // CAN
	// public static final int TALON_DRIVE_MASTER_LEFT = 1;
	// public static final int TALON_DRIVE_MASTER_RIGHT = 2;
	public static final int TALON_DRIVE_FRONT_LEFT = 3;
	public static final int TALON_DRIVE_FRONT_RIGHT = 4;
	public static final int TALON_DRIVE_BACK_LEFT = 1;
    public static final int TALON_DRIVE_BACK_RIGHT = 2;
    public static final int PCM = 30;
    public static final int ELEVATOR = 7;

	public static final int XBOX_CONTROLLER_PORT = 0;
	public static final int XBOX_CONTROLLER_LEFT_AXIS_X = 0;
	public static final int XBOX_CONTROLLER_LEFT_AXIS_Y = 1;
	public static final int XBOX_CONTROLLER_RIGHT_AXIS_X = 4;
	public static final int XBOX_CONTROLLER_RIGHT_AXIS_Y = 5;
	public static final int XBOX_CONTROLLER_LEFT_TRIGGER = 2;
	public static final int XBOX_CONTROLLER_RIGHT_TRIGGER = 3;
	public static final int XBOX_CONTROLLER_LEFT_BUMPER = 5;
	public static final int XBOX_CONTROLLER_RIGHT_BUMPER = 6;
	public static final int XBOX_CONTROLLER_BUTTON_A = 1;
	public static final int XBOX_CONTROLLER_BUTTON_B = 2;
	public static final int XBOX_CONTROLLER_BUTTON_X = 3;
	public static final int XBOX_CONTROLLER_BUTTON_Y = 4;
	public static final int XBOX_CONTROLLER_BUTTON_BACK = 7;
	public static final int XBOX_CONTROLLER_BUTTON_START = 8;

    public static final int JOYSTICK_CONTROLLER_PORT = 1;
	public static final int JOYSTICK_CONTROLLER_X_AXIS = 0;
	public static final int JOYSTICK_CONTROLLER_Y_AXIS = 1;
	public static final int JOYSTICK_CONTROLLER_Z_AXIS = 2;
	public static final int JOYSTICK_CONTROLLER_SLIDER = 3;
	public static final int JOYSTICK_CONTROLLER_BUTTON_1 = 1;
	public static final int JOYSTICK_CONTROLLER_BUTTON_2 = 2;
	public static final int JOYSTICK_CONTROLLER_BUTTON_3 = 3;
	public static final int JOYSTICK_CONTROLLER_BUTTON_4 = 4;
	public static final int JOYSTICK_CONTROLLER_BUTTON_5 = 5;
	public static final int JOYSTICK_CONTROLLER_BUTTON_6 = 6;
	public static final int JOYSTICK_CONTROLLER_BUTTON_7 = 7;
	public static final int JOYSTICK_CONTROLLER_BUTTON_8 = 8;
	public static final int JOYSTICK_CONTROLLER_BUTTON_9 = 9;
	public static final int JOYSTICK_CONTROLLER_BUTTON_10 = 10;
	public static final int JOYSTICK_CONTROLLER_BUTTON_11 = 11;
	public static final int JOYSTICK_CONTROLLER_BUTTON_12 = 12;
	*/
	// CAN
	// public static final int TALON_DRIVE_MASTER_LEFT = 1;
	// public static final int TALON_DRIVE_MASTER_RIGHT = 2;
	public static final int TALON_DRIVE_FRONT_LEFT = 3;//3;
	public static final int TALON_DRIVE_FRONT_RIGHT = 4;
	public static final int TALON_DRIVE_BACK_LEFT = 1;
    public static final int TALON_DRIVE_BACK_RIGHT = 2;

    public static final int ELEVATOR = 7;

	public static final int PCMCAN = 30;

    public static final PneumaticsModuleType PCM = PneumaticsModuleType.CTREPCM;


	public static final int XBOX_CONTROLLER_PORT = 0;
	public static final int XBOX_CONTROLLER_LEFT_AXIS_X = 0;
	public static final int XBOX_CONTROLLER_LEFT_AXIS_Y = 1;
	public static final int XBOX_CONTROLLER_RIGHT_AXIS_X = 4;
	public static final int XBOX_CONTROLLER_RIGHT_AXIS_Y = 5;
	public static final int XBOX_CONTROLLER_LEFT_TRIGGER = 2;
	public static final int XBOX_CONTROLLER_RIGHT_TRIGGER = 3;
	public static final int XBOX_CONTROLLER_LEFT_BUMPER = 5;
	public static final int XBOX_CONTROLLER_RIGHT_BUMPER = 6;
	public static final int XBOX_CONTROLLER_BUTTON_A = 1;
	public static final int XBOX_CONTROLLER_BUTTON_B = 2;
	public static final int XBOX_CONTROLLER_BUTTON_X = 3;
	public static final int XBOX_CONTROLLER_BUTTON_Y = 4;
	public static final int XBOX_CONTROLLER_BUTTON_BACK = 7;
	public static final int XBOX_CONTROLLER_BUTTON_START = 8;

    public static final int JOYSTICK_CONTROLLER_PORT = 1;
	public static final int JOYSTICK_CONTROLLER_X_AXIS = 0;
	public static final int JOYSTICK_CONTROLLER_Y_AXIS = 1;
	public static final int JOYSTICK_CONTROLLER_Z_AXIS = 2;
	public static final int JOYSTICK_CONTROLLER_SLIDER = 3;
	public static final int JOYSTICK_CONTROLLER_BUTTON_1 = 1;
	public static final int JOYSTICK_CONTROLLER_BUTTON_2 = 2;
	public static final int JOYSTICK_CONTROLLER_BUTTON_3 = 3;
	public static final int JOYSTICK_CONTROLLER_BUTTON_4 = 4;
	public static final int JOYSTICK_CONTROLLER_BUTTON_5 = 5;
	public static final int JOYSTICK_CONTROLLER_BUTTON_6 = 6;
	public static final int JOYSTICK_CONTROLLER_BUTTON_7 = 7;
	public static final int JOYSTICK_CONTROLLER_BUTTON_8 = 8;
	public static final int JOYSTICK_CONTROLLER_BUTTON_9 = 9;
	public static final int JOYSTICK_CONTROLLER_BUTTON_10 = 10;
	public static final int JOYSTICK_CONTROLLER_BUTTON_11 = 11;
	public static final int JOYSTICK_CONTROLLER_BUTTON_12 = 12;

	public static final int HAND_ZERO_LIMIT = 0;
	public static final int HAND_DESTINATION = 7;
	public static final int ARM_ZERO_LIMIT = 0;
	public static final int ARM_DESTINATION = 7;
}
