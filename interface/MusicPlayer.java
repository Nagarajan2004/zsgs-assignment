package interfaces;

class MP3Player implements Playable{
	@Override
	public void play() {
		System.out.println("MP3Player Playing...");
	}
	@Override
	public void pause() {
		System.out.println("MP3Player player is paused!!");
	}
	@Override
	public void stop() {
		System.out.println("MP3Player player is stoped");
	}	
}

class CDPlayer implements Playable{
	@Override
	public void play() {
		System.out.println("CDPlayer Playing...");
	}
	@Override
	public void pause() {
		System.out.println("CDPlayer player is paused!!");
	}
	@Override
	public void stop() {
		System.out.println("CDPlayer player is stoped");
	}	
}

class StreamingPlayer implements Playable{
	@Override
	public void play() {
		System.out.println("StreamingPlayer Playing...");
	}
	@Override
	public void pause() {
		System.out.println("StreamingPlayer player is paused!!");
	}
	@Override
	public void stop() {
		System.out.println("StreamingPlayer player is stoped");
	}	
}

public class MusicPlayer {
	public static void main(String[] args) {
		Playable mp3 = new MP3Player();
		Playable cd = new CDPlayer();
		Playable sp = new StreamingPlayer();
		mp3.play();
		mp3.pause();
		mp3.stop();
		cd.play();
		cd.pause();
		cd.stop();
		sp.play();
		sp.pause();
		sp.stop();
	}
}
