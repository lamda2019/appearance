package com.java.jikexueyuan.facademode.hometheater;

public class HomeTheaterFacade {
	//剧院灯光
	private TheaterLights mTheaterLights;
	//爆米花
	private Popcorn mPopcorn;
	//立体声
	private Stereo mStereo;
	//放映机
	private Projector mProjector;
	//大屏幕
	private Screen mScreen;
	//dvd放映机
	private DVDPlayer mDVDPlayer;

	public HomeTheaterFacade() {
		//所有装备就绪
		mTheaterLights = TheaterLights.getInstance();
		mPopcorn = Popcorn.getInstance();
		mStereo = Stereo.getInstance();
		mProjector = Projector.getInstance();
		mScreen = Screen.getInstance();
		mDVDPlayer = DVDPlayer.getInstance();
	}

	public void ready() {
		mPopcorn.on();
		mPopcorn.pop();
		mScreen.down();
		mProjector.on();
		mStereo.on();
		mDVDPlayer.on();
		mDVDPlayer.setdvd();
		mTheaterLights.dim(10);
	}

	public void end() {
		mPopcorn.off();
		mTheaterLights.bright();
		mScreen.up();
		mProjector.off();
		mStereo.off();
		
		mDVDPlayer.setdvd();
		mDVDPlayer.off();
		
	}

	public void play() {
		mDVDPlayer.play();
	}

	public void pause() {
		mDVDPlayer.pause();
	}
}
