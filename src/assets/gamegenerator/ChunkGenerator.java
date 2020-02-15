/**
 * チャンク生成器のテンプレートです
 *
 * @author nyuto
 * @version 1.0
 */

package assets.gamegenerator;

import assets.taskutil.Block;
import assets.taskutil.Chunk;
import assets.taskutil.Ground;
import assets.taskutil.Ore;

public abstract class ChunkGenerator {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	private long seed;

	public ChunkGenerator(long seed) {
		setSeed(seed);
	}


	public void setSeed(long seed) {
		this.seed = seed;
	}

	public long getSeed() {
		return seed;
	}

	public abstract Chunk getChunk(int x,int y);

	public abstract void addUseGround(Ground... grounds);

	public abstract void addUseGround(Ground ground,double frequency);

	public abstract void addUseGround(Ground[] grounds,double frequency);

	public abstract void addUseGround(Ground[] grounds,double[] frequency);

	public abstract void addUseBlock(Block... block);

	public abstract void addUseBlock(Block block,double frequency);

	public abstract void addUseBlock(Block[] blocks,double frequency);

	public abstract void addUseBlock(Block[] blocks,double[] frequency);

	public abstract void addUseOre(Ore... ore);

	public abstract void addUseOre(Ore ore,double frequency);

	public abstract void addUseOre(Ore[] ores,double frequency);

	public abstract void addUseOre(Ore[] ores,double[] frequency);


	public abstract Ground[] getUseGroundArray();

	public abstract double[] getGroundFrequencyArray();

	public abstract Block[] getUseBlockArray();

	public abstract double[] getBlockFrequencyArray();

	public abstract Ore[] getUseOreArray();

	public abstract double[] getOreFrequencyArray();
}
