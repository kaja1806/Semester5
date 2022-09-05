public class Phone {
    private boolean isOnSilent, isOnVibrate, isOnSound = true;

    private int currentVolume;

    public Phone() {
        goToSound();
        currentVolume = 1;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void receiveMessage(String txt) {
        if (isOnSilent) {
            // nothing
        } else if (isOnSound) {
            beepBeep();
        } else if (isOnVibrate) {
            vibrate();
        }
        System.out.println("Message received:");
        System.out.println(txt);
    }

    public void receiveCall() {
        if (isOnSilent) {
            lightUpScreen();
        } else if (isOnSound) {
            playRingTone();
        } else if (isOnVibrate) {
            vibrate();
        }
    }

    public void volumeUpButton() {
        if (isOnSound) {
            turnVolumeUp();
        } else if (isOnVibrate) {
            // change to sound
            isOnSound = true;
            isOnVibrate = false;
        } else if (isOnSilent) {
            isOnSilent = false;
            isOnSound = true;
        }
    }

    public void volumeDownButton() {
        if (isOnSound) {
            turnVolumeDown();
            if (currentVolume == 0) {
                isOnSilent = true;
                isOnSound = false;
            }
        } else if (isOnVibrate) {
            // change to sound
            isOnSound = true;
            isOnVibrate = false;
        } else if (isOnSilent) {
            isOnSilent = false;
            isOnSound = true;
        }
    }

    public void goToVibrate() {
        isOnVibrate = true;
        isOnSound = false;
        isOnSilent = false;
    }

    public void goToSound() {
        isOnSilent = false;
        isOnSound = true;
        isOnVibrate = false;
    }
    public void goToSilent() {
        isOnSilent = true;
        isOnSound = false;
        isOnVibrate = false;
    }

    private void playRingTone() {
        System.out.println("Ring tone");
    }

    private void vibrate() {
        System.out.println("vibrate");
    }

    private void beepBeep() {
        System.out.println("Beep beep");
    }

    private void lightUpScreen() {
        System.out.println("Light up screen");
    }

    private void turnVolumeUp() {
        currentVolume++;
        System.out.println("Volume up");
    }

    private void turnVolumeDown() {
        currentVolume--;
        System.out.println("Volume down");
    }

}
