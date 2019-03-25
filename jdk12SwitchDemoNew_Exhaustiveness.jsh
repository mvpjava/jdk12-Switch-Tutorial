System.out.println("MVP Java - JDK 12 Switch Demo - New Exhaustive")

public enum SYSTEM {
    POWER, ACS, THERMAL, COMS, PAYLOAD
}

public double calculatePowerUsgae(SYSTEM system)
{
	double power = switch (system) 
    {
     case POWER ->  200;
     case ACS   ->  140;
     case THERMAL, COMS -> 110;
	//  Compile Error: the switch expression does not cover all possible input values
    //case PAYLOAD -> 342.67;
	};

	return power;
}

SYSTEM acs = SYSTEM.ACS;

System.out.printf ("Attitude Control System (ACS) taking %.3f mW of Power", calculatePowerUsgae(acs))
