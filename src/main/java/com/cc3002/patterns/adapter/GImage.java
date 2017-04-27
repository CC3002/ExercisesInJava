package com.cc3002.patterns.adapter;

import java.awt.Graphics;

public interface GImage {
	public GColor getPixel(int x,int y);
	public void  setPixel(GColor c,int x,int y);
	public int height();
	public int width();
	public void draw(Graphics g);
}

