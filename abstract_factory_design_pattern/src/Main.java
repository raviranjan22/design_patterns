public class Main {
    public static void main(String[] args) {
        PhoneFactory factory = new Iphone();
        Camera iphoneCamera = factory.createCamera();
        iphoneCamera.flash();

        ScreenGuard iphoneSG = factory.createScreenGuard();
        iphoneSG.guard();
    }
}
