package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
public class firstRobotProgram extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotorEx motor = hardwareMap.get(DcMotorEx.class, "FrontLeft");

        waitForStart();

        while (opModeIsActive()) {
            motor.setPower(0.1);
            long encoderPosition = motor.getCurrentPosition();
            System.out.println("encoder position");
            telemetry.addData("position",encoderPosition);
            telemetry.update();
        }

    }
}
