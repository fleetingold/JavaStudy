package com.designpattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
