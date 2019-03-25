System.out.println("MVP Java - JDK 12 Switch Demo - Original")

public enum SYSTEM {
    POWER, ACS, THERMAL, COMS
}

public double calculatePowerUsgae(SYSTEM system)
{
	double power = switch (system) {
		 case POWER:
           double thisReallyIsGlobalScope = 10 * 20;
		   break 200 + thisReallyIsGlobalScope;
		   //break; compile error: missing break value

		 case ACS:
           thisReallyIsGlobalScope = 1;
		   break 140 + thisReallyIsGlobalScope;

		 case THERMAL: case COMS:
		   break 110;

		 default:
		   throw new RuntimeException("Invalid Sub-System <" + system + "> encountered");
	};
	 
	return power;
}

SYSTEM acs = SYSTEM.ACS

System.out.printf ("Attitude Control System (ACS) taking %.3f mW of Power", calculatePowerUsgae(acs))


