package Game.Objects;

public class Gameobjects {
	private int id;
	private String Name;

	// @formatter:off

	private int [][] comparision = {

			{ 0, -1, 1 },
			{ 1, 0, -1 },
		    { -1, 1, 0 },
			
		//	{ "Draw", "Lose", "Win" },
			//{ "Win", "Draw", "Lose" },
			//{ "Lose", "Win", "Draw" },
			
	};

	// @formatter:on
	 
	public int compareTo (Gameobjects other) {
		return comparision [id][other.id];
	}

	protected int getId() {
		return id;

	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return Name ;
	}

}
