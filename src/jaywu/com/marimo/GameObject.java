package jaywu.com.marimo;

public interface GameObject {
	public void move(int dx, int dy);
	public int x();
	public int y();
	public int Vx();
	public int Vy();
	public void setX(int x);
	public void setY(int y);
	public void setVx(int dx);
	public void setVy(int dy);
}
