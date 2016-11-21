package org.firstinspires.ftc.teamcode.libs;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.*;

/**
 * Sets up hardware
 */
public class Robot {

    // Reference to the hardware map
    public HardwareMap hardwareMap;

    // References to the motor controller
    public DcMotorController ctrlDriveMotor, ctrlActuatorMotor;
    public ServoController ctrlWheelServo, ctrlArmServo;

    // Refernces to the different motors and servos
    public DcMotor motorDriveLeft, motorDriveRight, motorFlyLeft, motorFlyRight, motorIntakeElevator, motorLift;
    public Servo servoFlyAngle, servoLeftWheel, servoRightWheel, servoLeftArm, servoRightArm, servoFlip;

    /**
     * Robot class constructor
     * Assigns the hardware references to the software variables
     * @param hwMap Reference to the hardware map
     */
    public Robot(HardwareMap hwMap) {
        hardwareMap = hwMap;

        ctrlDriveMotor = hardwareMap.dcMotorController.get("drive_motor_ctrl");
        ctrlActuatorMotor = hardwareMap.dcMotorController.get("actuator_motor_ctrl");

        ctrlWheelServo = hardwareMap.servoController.get("wheel_servo_ctrl");
        ctrlArmServo = hardwareMap.servoController.get("arm_servo_ctrl");

        motorDriveLeft = hardwareMap.dcMotor.get("drive_left");
        motorDriveRight = hardwareMap.dcMotor.get("drive_right");
        motorDriveLeft.setDirection(DcMotor.Direction.REVERSE);

        motorFlyLeft = hardwareMap.dcMotor.get("fly_left");
        motorFlyRight = hardwareMap.dcMotor.get("fly_right");

        motorIntakeElevator = hardwareMap.dcMotor.get("intake_elevator");
        motorLift = hardwareMap.dcMotor.get("lift");

        servoFlyAngle = hardwareMap.servo.get("fly_angle");
        servoLeftWheel = hardwareMap.servo.get("left_wheel");
        servoRightWheel = hardwareMap.servo.get("right_wheel");

        servoLeftArm = hardwareMap.servo.get("left_arm");
        servoRightArm = hardwareMap.servo.get("right_arm");
        servoFlip = hardwareMap.servo.get("flip");
    }

    //any other hardware methods go here

    public void setArms(double position) {
        servoLeftArm.setPosition(position);
        servoRightArm.setPosition(position);
    }
}
