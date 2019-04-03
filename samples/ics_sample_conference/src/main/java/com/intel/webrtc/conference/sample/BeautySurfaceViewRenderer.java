package com.intel.webrtc.conference.sample;

import android.content.Context;
import android.util.AttributeSet;

import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoRenderer;

public class BeautySurfaceViewRenderer extends SurfaceViewRenderer {

    public BeautySurfaceViewRenderer(Context context) {
        super(context);
    }

    public BeautySurfaceViewRenderer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void renderFrame(VideoRenderer.I420Frame frame) {
        super.renderFrame(frame);
    }
}
