package org.firstinspires.ftc.teamcode.subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.ServoEx;
import dev.nextftc.hardware.positionable.SetPosition;

public class ClawClose implements Subsystem {
        public static final ClawClose INSTANCE = new ClawClose();
        private ClawClose() { }
        private ServoEx servo = new ServoEx("clawclose_servo");

        public Command open = new SetPosition(servo, 0.1).requires(this);
        public Command close = new SetPosition(servo, 0.2).requires(this);


    }
}
