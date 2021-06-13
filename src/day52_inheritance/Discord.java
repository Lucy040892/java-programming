package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone) {
        System.out.println("Chating with " +someone +" on Discord");
    }

    /**
     * override download method
     *
     */
    @Override
    public boolean download() {
        System.out.println("Downloaded Discord 0.0.23 from App Store");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }
}
