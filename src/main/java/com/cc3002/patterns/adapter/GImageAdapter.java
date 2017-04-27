package com.cc3002.patterns.adapter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class GImageAdapter implements GImage{

	private BufferedImage image;
	
	public GImageAdapter(Image img){
		image = new BufferedImage( img.getWidth(null), img.getHeight(null),  BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();
	    g.drawImage(img, 0, 0, null);
	}
	
	public GImageAdapter(int width,int height){
		image = new BufferedImage( width, height,  BufferedImage.TYPE_INT_ARGB);
	}

	@Override
	public int height() {
		return  image.getHeight(null);
	}

	@Override
	public int width() {
		return image.getWidth(null);
	}

	@Override
	public void setPixel(GColor c, int x, int y) {
		Color javaColor = new Color(c.getRed(),c.getGreen(),c.getBlue()); 
		image.setRGB(x, y, javaColor.getRGB());
	}

	@Override
	public GColor getPixel(int x, int y) {
		Color javaColor= new Color(image.getRGB(x, y));
		return new GColor(javaColor.getRed(),
				javaColor.getBlue(),
				javaColor.getGreen());
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(image,0,0,null);
	}
	
}