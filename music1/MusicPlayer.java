package music1;

public class MusicPlayer {
    private enum State {
        PLAYING, PAUSED, STOPPED
    }

    private State state;

    public MusicPlayer() {
        state = State.STOPPED;
    }

    public void play() {
        switch (state) {
            case PLAYING:
                System.out.println("Music is already playing.");
                break;
            case PAUSED:
                System.out.println("Resuming music.");
                state = State.PLAYING;
                break;
            case STOPPED:
                System.out.println("Starting music.");
                state = State.PLAYING;
                break;
        }
    }

    public void pause() {
        switch (state) {
            case PLAYING:
                System.out.println("Pausing music.");
                state = State.PAUSED;
                break;
            case PAUSED:
                System.out.println("Music is already paused.");
                break;
            case STOPPED:
                System.out.println("Cannot pause. Music is not playing.");
                break;
        }
    }

    public void stop() {
        switch (state) {
            case PLAYING:
            case PAUSED:
                System.out.println("Stopping music.");
                state = State.STOPPED;
                break;
            case STOPPED:
                System.out.println("Music is already stopped.");
                break;
        }
    }

    public void status() {
        System.out.println("Music player is currently " + state.toString().toLowerCase() + ".");
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // Check the status of the player
        player.status();

        // Start playing music
        player.play();

        // Pause the music
        player.pause();

        // Resume playing music
        player.play();

        // Stop the music
        player.stop();

        // Check the final status
        player.status();
    }
}
