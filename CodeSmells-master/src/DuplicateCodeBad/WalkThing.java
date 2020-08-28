/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCodeBad;

/**
 *
 * @author gabpa
 */
public class WalkThing {
	
	private Player player;
	
	public Position WalkNorth()
	{
	   Player player = GetPlayer();
	   player.Move("N");
	   return player.NewPosition;
	}

	public Position WalkSouth()
	{
	   Player player = GetPlayer();
	   player.Move("S");
	   return player.NewPosition;
	}

	public Position WalkEast()
	{
	   Player player = GetPlayer();
	   player.Move("E");
	   return player.NewPosition;
	}

	public Position WalkWest()
	{
	   Player player = GetPlayer();
	   player.Move("W");
	   return player.NewPosition;
	}
	
	public Player GetPlayer(){
		return this.player;
	}
}
