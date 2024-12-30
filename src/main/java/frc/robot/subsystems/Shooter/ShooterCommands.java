package frc.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import frc.robot.RobotContainer;

public class ShooterCommands {
    public static Command getSetTargetStateCommand(ShooterConstants.ShooterState targetState) {
        return new InstantCommand(
                () -> RobotContainer.SHOOTER.setTargetState(targetState)
        );
    }

    private static Command getSetMotorOutputCommand(double motorOutput) {
        return new StartEndCommand(
                () -> RobotContainer.SHOOTER.setMotorOutput(motorOutput),
                RobotContainer.SHOOTER::stopMotors,
                RobotContainer.SHOOTER
        );
    }
}

