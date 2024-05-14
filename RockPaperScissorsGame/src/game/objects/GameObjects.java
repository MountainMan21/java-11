package game.objects;

public class GameObjects implements Comparable<GameObjects> {
	private int id;
	private String name;

	// @formatter:off
	
	private int[][] comparison = {
			//				rock	paper	scissors
			/* rock */ 		 {	0,		-1,		1,			},
			/* paper */		 {	1,		0,		-1,			},
			/* scissors */   {-1,		1,		0,			},
	};
	
	// @formatter:on

	@Override
	public int compareTo(GameObjects other) {
		return comparison[id][other.id];
	}

	protected int getId() {
		 return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}