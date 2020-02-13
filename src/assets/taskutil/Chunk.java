/**
 * チャンク
 *
 * @author nyuto
 * @version 1.0
 */

package assets.taskutil;

public class Chunk {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	private static final int chunksize = 256;

	public static final int DATAMASK = 0xFF;



	private int x;

	private int y;

	private Ground[][] grounds;

	private Ore[][] ores;

	private Block[][] blocks;

	private boolean needUpdate;


	public Chunk(int x,int y) {
		this.x = x;
		this.y = y;
		grounds = new Ground[chunksize][chunksize];
		ores = new Ore[chunksize][chunksize];
		blocks = new Block[chunksize][chunksize];
		needUpdate = true;
	}

	public void genGround(Ground[][] ground) {
		if(ground.length != chunksize)throw new IllegalArgumentException("Argument must be a 256x256 array.");
		Ground tmp;
		for(int x=0;x<chunksize;x++) {
			if(ground[x].length != chunksize)throw new IllegalArgumentException("Argument must be a 256x256 array.");
			for(int y=0;y<chunksize;y++) {
				tmp = ground[x][y];
				if(tmp == null)throw new NullPointerException("The argument must not contain null.");
				grounds[x][y] = tmp;
			}
		}
	}

	public void genOre(Ore[][] ore) {
		if(ore.length != chunksize)throw new IllegalArgumentException("Argument must be a 256x256 array.");
		for(int x=0;x<chunksize;x++) {
			if(ore[x].length != chunksize)throw new IllegalArgumentException("Argument must be a 256x256 array.");
			for(int y=0;y<chunksize;y++) {
				ores[x][y] = ore[x][y];
			}
		}
	}

	public void genBlock(Block[][] block) {
		if(block.length != chunksize)throw new IllegalArgumentException("Argument must be a 256x256 array.");
		for(int x=0;x<chunksize;x++) {
			if(block[x].length != chunksize)throw new IllegalArgumentException("Argument must be a 256x256 array.");
			for(int y=0;y<chunksize;y++) {
				blocks[x][y] = block[x][y];
			}
		}
	}

	public Ground[][] getGround(){
		return grounds;
	}

	public Ore[][] getOre(){
		return ores;
	}

	public Block[][] getBlock(){
		return blocks;
	}

	public void setGround(Ground ground,int x,int y) {
		if(ground == null)throw new NullPointerException("The argument must not contain null.");
		if(checkPos(x,y))throw new IllegalArgumentException("The specified coordinates are out of range.");
		grounds[x][y] = ground;
	}

	public void setOre(Ore ore,int x,int y) {
		if(checkPos(x,y))throw new IllegalArgumentException("The specified coordinates are out of range.");
		ores[x][y] = ore;
	}

	public void setBlock(Block block,int x,int y) {
		if(checkPos(x,y))throw new IllegalArgumentException("The specified coordinates are out of range.");
		blocks[x][y] = block;
	}

	public Ground getGround(int x,int y) {
		if(checkPos(x,y))throw new IllegalArgumentException("The specified coordinates are out of range.");
		return grounds[x][y];
	}

	public Ore getOre(int x,int y) {
		if(checkPos(x,y))throw new IllegalArgumentException("The specified coordinates are out of range.");
		return ores[x][y];
	}

	public Block getBlock(int x,int y) {
		if(checkPos(x,y))throw new IllegalArgumentException("The specified coordinates are out of range.");
		return blocks[x][y];
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean needUpdate() {
		return needUpdate;
	}

	public void updateFirst() {
		Block tmp;
		for(int i=0;i<chunksize;i++) {
			for(int j=0;j<chunksize;j++) {
				tmp = blocks[i][j];
				if(tmp != null) {
					tmp.beforeTask();
				}
			}
		}
	}

	public boolean updateEnd() {
		Block tmp;
		boolean update = false;
		for(int i=0;i<chunksize;i++) {
			for(int j=0;j<chunksize;j++) {
				tmp = blocks[i][j];
				if(tmp != null) {
					tmp.afterTask();
					if(tmp.needUpdate())update=true;
				}
			}
		}
		needUpdate = update;
		return update;
	}


	private boolean checkPos(int x,int y) {
		if(x<0)return true;
		if(x>=chunksize)return true;
		if(y<0)return true;
		if(y>=chunksize)return true;
		return false;
	}
}
