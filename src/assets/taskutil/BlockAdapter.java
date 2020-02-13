package assets.taskutil;

public abstract class BlockAdapter extends Block {

	private int ID;

	public BlockAdapter(int x, int y) {
		super(x, y);
	}

	@Override
	public HitBox getHitBox() {
		return new HitBox();
	}

	@Override
	public int getHP() {
		return 1000;
	}

	@Override
	public int getMaxHP() {
		return 1000;
	}

	@Override
	public void setBlockID(int ID) {
		this.ID = ID;
	}

	@Override
	public int getBlockID() {
		return ID;
	}

	@Override
	public Item inputItem(Item item, int input_side) {
		return null;
	}

	@Override
	public Item getItem(int max_amount) {
		return null;
	}

	@Override
	public Liquid inputLiquid(Liquid liquid, int input_side) {
		return null;
	}

	@Override
	public Liquid getLiquid(Liquid liquid, int max_amount) {
		return null;
	}

	@Override
	public Electricity inputElectricity(Electricity elec) {
		return null;
	}

	@Override
	public Electricity getElectricity(int max_amount) {
		return null;
	}

	@Override
	public Heat inputHeat(Heat heat, int inputside) {
		return null;
	}

	@Override
	public Heat getHeat(int max_amount) {
		return null;
	}

	@Override
	public boolean connectItem(int outputside) {
		return false;
	}

	@Override
	public boolean connectLiquidInput(int inputside) {
		return false;
	}

	@Override
	public boolean connectLiquidOutput(int outputside) {
		return false;
	}

	@Override
	public boolean connectLiquidInOut(int inoutside) {
		return false;
	}

	@Override
	public boolean connectElectricityInput() {
		return false;
	}

	@Override
	public boolean connectElectricityOutput() {
		return false;
	}

	@Override
	public boolean connectHeatInput(int inputside) {
		return false;
	}

	@Override
	public boolean connectHeatOutput(int outputside) {
		return false;
	}

	@Override
	public boolean connectHeatInOut(int inoutside) {
		return false;
	}
}
