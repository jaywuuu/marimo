package jaywu.com.marimo;

public class Marimo implements GameObject {
	public static enum GrowthStage {
		LVL1("", 1000),
		LVL2("", 2000),
		LVL3("", 4000),
		LVL4("", 8000),
		LVLMAX("", 16000);
		
		private String name;
		private int xp;
		
		private final static GrowthStage [] Levels = GrowthStage.values();
		
		public static GrowthStage getNext(GrowthStage current) {
			if (current == LVLMAX) return current;
			return Levels[current.ordinal()+1];
		}
		
		private GrowthStage(String n, int x) {
			name = n;
			xp = x;
		}
		
		public String getName() { return name; }
		public int getXP() { return xp; }
	}
	
	private int xp;
	private String name;
	private GrowthStage lvl;
	/* position */
	private int x;
	private int y;
	/* velocity */
	private int vx;
	private int vy;
	
	public Marimo(int xp, int x, int y, int vx, int vy, GrowthStage lvl) {
		this.xp = xp;
		this.x = x;
		this.y = y;
		this.lvl = lvl;
		this.vx = vx;
		this.vy = vy;
	}
	
	public int getXP() { return this.xp; }
	public void setXP(int xp) { this.xp = xp; }
	public void addXP(int add) { this.xp += add; }
	public void subtractXP(int sub) { this.xp -= sub; }
	public GrowthStage getLevel() { return this.lvl; }
	public void setLevel(GrowthStage lvl) { this.lvl = lvl; }
	public void levelUp() { 
		GrowthStage nextLvl = GrowthStage.getNext(lvl); 
		int nextXP = nextLvl.getXP();
		if (xp >= nextXP) lvl = nextLvl;
	}
	
	public String getName() { return name; }
	public void setName(String s) { name = s; }
	
	public int x() { return x; }
	public int y() { return y; }
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	
	@Override
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void setVx(int dx) { vx = dx; }
	public void setVy(int dy) { vy = dy; }
	public int Vx() { return vx; }
	public int Vy() { return vy; } 
}
