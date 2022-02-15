package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Blue Outside", group = "competition")
public class BlueOutsideAuto extends AutonomousParent {

    @Override
    public void runOpMode() throws InterruptedException {

        super.startingPosition = StartingPosition.BLUE_OUTSIDE;
        super.runOpMode();
    }
}