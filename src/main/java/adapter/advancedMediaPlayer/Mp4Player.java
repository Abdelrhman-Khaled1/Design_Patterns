package adapter.advancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        //Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: "+ fileName);
    }
}
