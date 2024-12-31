package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.Shooter.Shooter;

public class RobotContainer {
    public static final Shooter SHOOTER = new Shooter();

    public RobotContainer() {
        configureBindings();
    }

    private void configureBindings() {
    }
  
    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
    }
}