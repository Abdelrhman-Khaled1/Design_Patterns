package adapter.advancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //Do nothing
    }
}
