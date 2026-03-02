package org.firstinspires.ftc.teamcode.subsystems;

import dev.nextftc.control.ControlSystem;
import dev.nextftc.core.commands.Command;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;
import dev.nextftc.hardware.positionable.SetPosition;

public class Arm {

    public class Arm implements Subsystem {
        public static final Arm INSTANCE = new Arm();

        public MotorEx motor = new MotorEx("arm_motor");

        private ControlSystem controller = ControlSystem.builder()
                .posPid(0.5, 0.0, 0.0)
                .build();

        @Override
        public void initialize() {

        }
        @Override
        public void periodic() {


        }
    }



}
