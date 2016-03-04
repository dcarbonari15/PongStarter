package edu.up.pongstarter;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by carbonari19 on 3/3/2016.
 */
public class Ball {

    public static final int size = 60;
    protected int xcord;
    protected int ycord;
    protected int xv;
    protected int yv;
    protected Paint color = new Paint();

    /*
     *Consructor the sets default values to the position and the velocity of the ball
     * The position is the satrting position and the velocity is the easy velocity
     */
    public Ball(){
        xcord = 150;
        ycord = 200;
        xv = 25;
        yv = 25;
        color.setColor(Color.RED);
    }

    /*
     *Sets the balls velocity to a given value
     *
     *@param xvel - the desired x velocity
     *@param yvel - the desired y velocity
     *
     */

    public void setVelocity(int xvel, int yvel){
        xv = xvel;
        yv = yvel;
    }

    public int getXVelocity(){
        return xv;
    }

    public int getYVelocity(){
        return yv;
    }


    public void drawBall(Canvas c, int xcord, int ycord){
        c.drawCircle(xcord, ycord, 60, color);
    }




}
