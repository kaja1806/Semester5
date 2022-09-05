public interface PhoneState {
    void onReceiveMessage(String txt, Phone phone);

    void onReceiveCall(Phone phone);

    void onVolumeButtonUp(Phone phone);

    void onVolumeButtonDown(Phone phone);
}
