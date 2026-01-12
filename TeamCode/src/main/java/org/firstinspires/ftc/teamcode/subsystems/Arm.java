package org.firstinspires.ftc.teamcode.subsystems;

import dev.nextftc.control.ControlSystem;
import dev.nextftc.core.commands.Command;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.controllable.RunToPosition;
import dev.nextftc.hardware.impl.MotorEx;

public class Arm implements Subsystem {
    public static final Arm INSTANCE = new Arm();
    private Arm() { }
    private MotorEx motor = new MotorEx("arm_motor");
    private ControlSystem controlSystem = ControlSystem.builder()
            .posPid(0.005, 0, 0)
            .elevatorFF(0)
            .build();
    @Override
    public void periodic() {
        motor.setPower(controlSystem.calculate(motor.getState()));
    }
   


}
