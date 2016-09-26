package kr.hs.emrim.minsun2767.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator34 on 2016. 9. 26..
 */
public class MyImage extends View{
    MyImage(Context context){
        super(context);

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap picture= BitmapFactory.decodeResource(getResources(),R.drawable.hq);
        float cx=getWidth()/2.0f;
        float cy=getHeight()/2.0f;

        float x=(getWidth()-picture.getWidth())/2.0f;
        float y=(getHeight()-picture.getHeight())/2.0f;
        //canvas.rotate(45,cx,cy); 회전
        //canvas.translate(-150,200); 이동
        //canvas.scale(2,2,cx,cy);
        canvas.skew(0.4f,0.4f);
        canvas.drawBitmap(picture,x,y,null);
    }
}
