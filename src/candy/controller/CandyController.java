package candy.controller;

import candy.model.MarshmallowCreature;

public class CandyController
{

	
	
    private MarshmallowCreature myCreature;
	
 	public CandyController()
 	{
 		
 	}
 	
 	public void start()
 	{
 		promptForInfo();
 		
	}
 	private void promptForInfo()
 	{
 		
 	}
 	private void makeMonster()
 	{
 		myCreature = new MarshmallowCreature(" creature ", 2 ,2, 2, true);
 	}
}
