package src.main.java.com.memoryFade.state;

public class NightState implements State{
    private static final NightState singleton = new NightState();

    public static NightState getInstance(){
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (hour>=9&&hour<17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急，晚上使用金库！！！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[  晚上  ]";
    }
}
