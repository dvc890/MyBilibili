package io.kickflip.sdk.view;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;

public class MyGLCameraEncoderView extends GLCameraEncoderView {
    public MyGLCameraEncoderView(Context context) {
        super(context);
    }

    public MyGLCameraEncoderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void releaseCamera() {
        a();
    }

    public void setAreas(int a, int b) {
        a(a, b);
    }

    public String setFlashMode() {
        return b();
    }

    public void setAutoFocus() {
        c();
    }

    public void updataDisplayOrientation() {
        d();
    }

}
