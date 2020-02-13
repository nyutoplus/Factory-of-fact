/**
 * ブロックの核となるクラスです
 *
 * @version 1.0
 * @author nyuto
 */

package assets.taskutil;

public abstract class Block {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public static final int BLOCK_ACTIVE = 0x01;

	public static final int BLOCK_LIMITED_ACTIVE = 0x02;

	public static final int BLOCK_INACTIVE = 0x03;

	public static final int INPUT_SIDE_UP = 0x01;

	public static final int INPUT_SIDE_DOWN = 0x02;

	public static final int INPUT_SIDE_LEFT = 0x04;

	public static final int INPUT_SIDE_RIGHT = 0x08;

	public static final int INPUT_ALL_SIDE = 0x0F;

	public static final int OUTPUT_SIDE_UP = 0x10;

	public static final int OUTPUT_SIDE_DOWN = 0x20;

	public static final int OUTPUT_SIDE_LEFT = 0x40;

	public static final int OUTPUT_SIDE_RIGHT = 0x80;

	public static final int OUTPUT_ALL_SIDE = 0xF0;

	public static final int INOUT_SIDE_UP = 0x11;

	public static final int INOUT_SIDE_DOWN = 0x22;

	public static final int INOUT_SIDE_LEFT = 0x44;

	public static final int INOUT_SIDE_RIGHT = 0x88;

	public static final int INOUT_ALL_SIDE = 0xFF;

	public int posx;

	public int posy;

	public Block(int x,int y) {
		setPos(x,y);
	}

	public void setPos(int x,int y) {
		posx = x;
		posy = y;
	}

	public int getX() {
		return posx;
	}

	public int getY() {
		return posy;
	}


	public abstract HitBox getHitBox();

	public abstract int getHP();

	public abstract int getMaxHP();

	public abstract void damege(int damage);

	public abstract void setBlockID(int ID);

	public abstract int getBlockID();


	public abstract void beforeTask();

	public abstract void afterTask();


	public abstract Item inputItem(Item item,int input_side);

	public abstract Item getItem(int max_amount);

	public abstract Liquid inputLiquid(Liquid liquid,int input_side);

	public abstract Liquid getLiquid(Liquid liquid,int max_amount);

	public abstract Electricity inputElectricity(Electricity elec);

	public abstract Electricity getElectricity(int max_amount);

	public abstract Heat inputHeat(Heat heat,int inputside);

	public abstract Heat getHeat(int max_amount);

	public abstract boolean connectItem(int outputside);

	public abstract boolean connectLiquidInput(int inputside);

	public abstract boolean connectLiquidOutput(int outputside);

	public abstract boolean connectLiquidInOut(int inoutside);

	public abstract boolean connectElectricityInput();

	public abstract boolean connectElectricityOutput();

	public abstract boolean connectHeatInput(int inputside);

	public abstract boolean connectHeatOutput(int outputside);

	public abstract boolean connectHeatInOut(int inoutside);



	public abstract void loadImage();

	public abstract Imageset getRenderImageset();

	public abstract long getImageID();
}
