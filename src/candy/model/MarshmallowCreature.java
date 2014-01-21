package candy.model;

public class MarshmallowCreature

{
		//Declaration Section
		private String name;
		private int legs;
		private int arms;
		private int eyes;
		private boolean hasButton;
		
		/**
		 *Default constructor - should not be used
		 */
		public MarshmallowCreature()
		{
			name = "dummy";
			eyes = 0;
			legs  = 0;
			arms = 0;
			hasButton = false;
					
		}
		
		/**
		 * Create a MarshmallowCreature with the specified values.
		 * @param name The name of the creature
		 * @param eyes The number of eyes the creature has.
		 * @param legs The number of legs the creature has.
		 * @param arms The number of arms the creature has.
		 * @param hasButton Whether or not the creature has a button.
		 */
		public MarshmallowCreature(String name, int eyes, int legs, int arms, boolean hasButton)
		{
			this.name = name;
			
			this.eyes = eyes;
					
			this.legs = legs;
					
			this.arms = arms;
					
			hasButton = true;
		}
}
