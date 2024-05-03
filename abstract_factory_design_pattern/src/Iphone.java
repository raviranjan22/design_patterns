public class Iphone implements PhoneFactory{

    @Override
    public Camera createCamera() {
        return new IphoneCamera();
    }

    @Override
    public ScreenGuard createScreenGuard() {
        return new IphoneSG();
    }
}
