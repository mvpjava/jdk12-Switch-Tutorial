System.out.println("MVP Java - JDK 12 Switch Demo - New")

public enum SYSTEM {
    POWER, ACS, THERMAL, COMS
}

public double calculatePowerUsgae(SYSTEM system)
{
	double power =  switch (system) 
    {
	     case POWER ->  200.0D;
	     case ACS   ->  {
				//i.e: Sum Power Usage from all Actuators
				double yesThisIsReallyLocalScope = 10 + 20 + 30;							
				break yesThisIsReallyLocalScope;
			    }
	     case THERMAL, COMS -> 110.0D;
	};

	return power;
}

SYSTEM acs = SYSTEM.ACS;

System.out.printf ("Attitude Control System (ACS) taking %.3f mW of Power", 
					calculatePowerUsgae(acs))
