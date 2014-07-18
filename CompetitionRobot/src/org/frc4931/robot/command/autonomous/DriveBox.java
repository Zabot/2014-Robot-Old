package org.frc4931.robot.command.autonomous;

import org.frc4931.robot.Subsystems;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class DriveBox extends CommandGroup{

	public DriveBox() {
		requires(Subsystems.driveTrain);
		addSequential(new DriveAtSpeed(0.3d),1.0d);
		addSequential(new WaitCommand(0.2));
		addSequential(new TurnRelativeAngle(90));
		addSequential(new WaitCommand(0.2));
		addSequential(new DriveAtSpeed(0.3d),1.0d);
		addSequential(new WaitCommand(0.2));
		addSequential(new TurnRelativeAngle(90));
		addSequential(new WaitCommand(0.2));
		addSequential(new DriveAtSpeed(0.3d),1.0d);
		addSequential(new WaitCommand(0.2));
		addSequential(new TurnRelativeAngle(90));
		addSequential(new WaitCommand(0.2));
		addSequential(new DriveAtSpeed(0.3d),1.0d);
		addSequential(new WaitCommand(0.2));
		addSequential(new TurnRelativeAngle(90));
		addSequential(new WaitCommand(0.2));
	}

}
