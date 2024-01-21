package Core_Java.src_onlineclass.JAN_13.Abstraction.RealtimeExample;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting FIREFOX");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing FF");
        return null;
    }
}