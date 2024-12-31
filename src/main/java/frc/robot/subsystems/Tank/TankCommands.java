package frc.robot.subsystems.Tank;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.FunctionalCommand;
import frc.robot.RobotContainer;

import java.util.function.DoubleSupplier;

public class TankCommands {
    /**
     * Creates a command that uses arcade drive to drive the tank.
     * Arcade drive uses two joy sticks, one drives it forwards and backwards and the other turns it left or right.
     *
     * @param driveDirection a supplier that gives us the forwards or backwards power (-1 to 1)
     * @param turnDirection  a supplier that gives us the power of the rotation (-1 to 1)
     * @return the command
     */
    public static Command getArcadeDriveCommand(DoubleSupplier driveDirection, DoubleSupplier turnDirection) {
        return new FunctionalCommand(
                () -> {
                },
                () -> RobotContainer.TANK.arcadeDrive(driveDirection.getAsDouble(), turnDirection.getAsDouble()),
                (interrupted) -> RobotContainer.TANK.stopMotors(),
                () -> false,
                RobotContainer.TANK
        );
    }
}
