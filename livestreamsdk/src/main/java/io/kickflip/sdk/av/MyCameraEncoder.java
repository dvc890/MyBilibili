package io.kickflip.sdk.av;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;

public class MyCameraEncoder extends CameraEncoder {

    public MyCameraEncoder(io.kickflip.sdk.av.u u) {
        super(u);
    }

    public MyCameraEncoder(io.kickflip.sdk.av.u u, int i) {
        super(u, i);
    }

    public void requestOtherCamera() {
        a();
    }

    public void requestCamera(int camera) {
        b(camera);
    }

    public int getCameraFacing() {
        return o();
    }

    public int getCameraId() {
        return p();
    }

    public Camera getCamera() {
        return n();
    }

    public SurfaceTexture getSurfaceTextureForDisplay() {
        return b();
    }

    public void stopRecord(u var1) {
        c(var1);
    }
}
