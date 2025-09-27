package exercise1;

//public class structuralpatternadapter {
//
//	public structuralpatternadapter() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

interface MediaPlayer {
	 void play(String fileType, String fileName);
	}

	//Concrete implementation for MP3
	class Mp3Player implements MediaPlayer {
	 @Override
	 public void play(String fileType, String fileName) {
	     if (fileType.equalsIgnoreCase("mp3")) {
	         System.out.println("Playing MP3 file: " + fileName);
	     } else {
	         System.out.println("Invalid format. MP3 player supports only MP3 files.");
	     }
	 }
	}

	//Adaptee (Advanced player with MP4 support only)
	class AdvancedPlayer {
	 void playMp4(String fileName) {
	     System.out.println("Playing MP4 file: " + fileName);
	 }
	}

	//Adapter to make AdvancedPlayer compatible with MediaPlayer
	class MediaAdapter implements MediaPlayer {
	 private AdvancedPlayer advancedPlayer = new AdvancedPlayer();

	 @Override
	 public void play(String fileType, String fileName) {
	     if (fileType.equalsIgnoreCase("mp4")) {
	         advancedPlayer.playMp4(fileName);
	     } else {
	         System.out.println("Format not supported by AdvancedPlayer.");
	     }
	 }
	}

	//Client class
	public class structuralpatternadapter {
	 public static void main(String[] args) {
	     MediaPlayer mp3Player = new Mp3Player();
	     mp3Player.play("mp3", "song1.mp3");  // Works fine

	     MediaPlayer mp4Player = new MediaAdapter();
	     mp4Player.play("mp4", "movie1.mp4"); // Uses adapter to play MP4

	     // Invalid case
	     mp3Player.play("mp4", "wrongfile.mp4");
	 }
	}