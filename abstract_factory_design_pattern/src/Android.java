public class Android  implements PhoneFactory{
    @Override
    public Camera createCamera() {
        return new AndroidCamera();
    }

    @Override
    public ScreenGuard createScreenGuard() {
        return new AndroidSG();
    }
}
