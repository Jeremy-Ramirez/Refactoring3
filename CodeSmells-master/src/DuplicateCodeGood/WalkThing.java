
package DuplicateCodeGood;


/**
 *
 * @author gabpa
 */
public class WalkThing {
	private Player Cplayer;
	
	public Position Walk(String direction)
	{
	   Player player = GetPlayer();
	   player.Move(direction);
	   return player.NewPosition;
	} 
	
	public Player GetPlayer(){
		return this.Cplayer;
	}
}
