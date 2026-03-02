package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Claw;

import dev.nextftc.ftc.Gamepads;
import dev.nextftc.ftc.NextFTCOpMode;

// opmode connects all the subsystems
@TeleOp(name="My First Op Mode")
public class BasicTeleOp extends NextFTCOpMode {
//
    @Override
    public void onInit(){
        // does something on init

    }

    @Override
    public void onWaitForStart() {

    }
    @Override
    public void onStartButtonPressed(){
        // runs something when circle is pressed (on first gamepad)
        Gamepads.gamepad1().circle().whenBecomesTrue(Claw.INSTANCE.open);
        Gamepads.gamepad2().circle().whenBecomesTrue(Claw.INSTANCE.close);
    }
    @Override
    public void onUpdate() {

    }

            @Override
            public void onStop() {

    }
}
