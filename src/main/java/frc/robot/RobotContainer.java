// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.Tank.Tank;
import frc.robot.subsystems.Transporter.Transporter;

public class RobotContainer {
    public static final Transporter TRANSPORTER = new Transporter();
    public static final Tank TANK = new Tank();

    public RobotContainer() {
        configureBindings();
    }


    private void configureBindings() {
    }


    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
    }
}
