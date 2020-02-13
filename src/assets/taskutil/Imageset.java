package assets.taskutil;

import java.awt.Image;

public class Imageset {

	private Image[] images;


	public Imageset(Image image) {
		updateImage(image);
	}

	public Imageset(Image[] images) {
		updateImage(images);
	}

	public void updateImage(Image image) {
		Image[] tmp = {image};
		updateImage(tmp);
	}

	public void updateImage(Image[] images) {
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
