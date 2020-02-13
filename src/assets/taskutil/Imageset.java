/**
 * 描画用イメージ保持用クラスです
 *
 * @author nyuto
 * @version 1.0
 */

package assets.taskutil;

import java.awt.Image;

public class Imageset {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	private Image[] images;


	public Imageset(Image... image) {
		updateImage(image);
	}

	public void updateImage(Image... images) {
		if(images == null)return;
		this.images = images;
	}

	public int getImageLength() {
		return images.length;
	}

	public Image getImage(int imageNumber) {
		return images[imageNumber];
	}

	public Image[] getImageSet() {
		return images;
	}
}
