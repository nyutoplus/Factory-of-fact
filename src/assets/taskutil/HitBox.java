/**
 * 当たり判定受け渡し用クラスです
 *
 * @author nyuto
 * @version 1.0
 */

package assets.taskutil;

public class HitBox {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	/**
	 * left
	 */
	public double x1;

	/**
	 * up
	 */
	public double y1;

	/**
	 * right
	 */
	public double x2;

	/**
	 * down
	 */
	public double y2;


	public HitBox() {
		setHitBox(0.1,0.1,0.9,0.9);
	}

	public HitBox(double x1,double y1,double x2,double y2) {
		setHitBox(x1,y1,x2,y2);
	}

	public HitBox(int x1,int y1,int x2,int y2) {
		setHitBox(x1,y1,x2,y2);
	}

	public void setHitBox(double x1,double y1,double x2,double y2) {
		if(x1<=x2) {
			this.x1 = x1;
			this.x2 = x2;
		}else {
			this.x1 = x2;
			this.x2 = x1;
		}
		if(y1<=y2) {
			this.y1 = y1;
			this.y2 = y2;
		}else {
			this.y1 = y2;
			this.y2 = y1;
		}
	}

	public void setHitBox(int x1,int y1,int x2,int y2) {
		setHitBox((double)x1,(double)y1,(double)x2,(double)y2);
	}

	public double getX1() {
		return x1;
	}

	public double getY1() {
		return y1;
	}

	public double getX2() {
		return x2;
	}

	public double getY2() {
		return y2;
	}

	public int getX1Int() {
		return (int)x1;
	}

	public int getY1Int() {
		return (int)y1;
	}

	public int getX2Int() {
		return (int)x2;
	}

	public int getY2Int() {
		return (int)y2;
	}
}
