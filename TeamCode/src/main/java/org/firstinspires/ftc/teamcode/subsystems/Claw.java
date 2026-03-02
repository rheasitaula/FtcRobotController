package org.firstinspires.ftc.teamcode.subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.ServoEx;
import dev.nextftc.hardware.positionable.SetPosition;

public class Claw implements Subsystem {
    public static final Claw INSTANCE = new Claw(); // creates a way to access

    public ServoEx servo = new ServoEx( "claw_servo");


    @Override
    public void initialize() { // runs when  subsystem program starts (subsystem object is first "created")
        Command moveServo =  new SetPosition(servo, 0.5);
        moveServo.schedule();
// sets the servo position to "0.5" (it can be between 0 and 1)


    }
public Command open = new SetPosition(servo, 1.0);
    public Command close = new SetPosition(servo, 0.0);


    @Override
    public void periodic() { // runs always (continously, every "tick")


    }
}
