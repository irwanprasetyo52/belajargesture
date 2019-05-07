package irwanprasetyo52gmail.com;

import android.graphics.Color;
import android.support.v4.view.GestureDetectorCompat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener{

        private TextView gestureText;
        private GestureDetectorCompat gDetector;
        private RelativeLayout background;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            gestureText =                 (TextView)findViewById(R.id.gestureStatusText);
            this.gDetector = new GestureDetectorCompat(this,this);
            gDetector.setOnDoubleTapListener(this);
            background = (RelativeLayout)findViewById(R.id.activity_main);
    }
    @Override
    public boolean onDown(MotionEvent event) {
    gestureText.setText ("onDown");
    return true;     }
    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
    gestureText.setText("onFling");
        background.setBackgroundColor(Color.GRAY);
    return true;     }

    @Override
    public void onLongPress(MotionEvent event) {
    gestureText.setText("onLongPress");
        background.setBackgroundColor(Color.YELLOW);}

    @Override     public boolean onScroll(MotionEvent e1, MotionEvent e2,
                                          float distanceX, float distanceY) {
    gestureText.setText("onScroll");
    return true;     }

    @Override
    public void onShowPress(MotionEvent event) {
    gestureText.setText("onShowPress");     }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
    gestureText.setText("onSingleTapUp");
        background.setBackgroundColor(Color.GREEN);
        return true;     }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
    gestureText.setText("onDoubleTap");
        background.setBackgroundColor(Color.BLUE);
    return true;     }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
    gestureText.setText("onDoubleTapEvent");
    background.setBackgroundColor(Color.RED);
    return true;     }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
    gestureText.setText("onSingleTapConfirmed");

    return true;     }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    this.gDetector.onTouchEvent(event);
    return super.onTouchEvent(event);     }
}

