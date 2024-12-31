package frc.robot.subsystems.Tank;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Tank extends SubsystemBase {
    private final DifferentialDrive differentialDrive = TankConstants.DIFFERENTIAL_DRIVE;

    void stopMotors() {
        differentialDrive.stopMotor();
    }

    /**
     * Applies arcade drive to the differential drive.
     * Arcade drive uses two joy sticks, one drives it forwards and backwards and the other turns it left or right.
     *
     * @param driveDirection a double that gives the backwards or forwards power (-1 to 1)
     * @param turnDirection  a double that gives the rotation power (-1 to 1)
     */
    void arcadeDrive(double driveDirection, double turnDirection) {
        differentialDrive.arcadeDrive(driveDirection, turnDirection);
    }
}