System.out.println("MVP Java - JDK 12 Switch Demo - Original")

public enum SYSTEM {
    POWER, ACS, THERMAL, COMS
}

public double calculatePowerUsgae(SYSTEM system)
{
	double power = 0;

	switch (system) {
		 case POWER:
           double thisReallyIsGlobalScope = 10 * 20;
		   power = 200 + thisReallyIsGlobalScope;
		   break;

		 case ACS:
           thisReallyIsGlobalScope = 1;
		   power = 140 + thisReallyIsGlobalScope;
		   break;

		 case THERMAL: case COMS:
		   power = 110;
		   break;

		 default:
		   System.out.println ("Invalid Sub-System <" + system + "> encountered");
		   break;
	}
	 
	return power;
}


SYSTEM acs = SYSTEM.ACS

System.out.printf ("Attitude Control System (ACS) taking %.3f mW of Power", calculatePowerUsgae(acs))


