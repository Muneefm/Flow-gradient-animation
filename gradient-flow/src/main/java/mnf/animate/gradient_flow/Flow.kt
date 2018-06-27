package mnf.animate.gradient_flow

import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.GradientDrawable
import android.util.Log
import android.view.View

class Flow constructor(context: Context) {

    val TAG = "FLOW"

    data class Frame(val orientation: Orientation = Orientation.BottomLeft_TopRight,
                 val colors: IntArray, val duration: Int = 6000)

    val framesList: MutableList<Frame> = mutableListOf()


    fun addFrame(orientation: Orientation, colors: IntArray, duration: Int){
       //val frame = Frame(orientation, colors);
        framesList.add(Frame(orientation, colors, duration))
    }

    enum class Orientation {
        BottomLeft_TopRight,
    }

    fun start(view: View){
        val animationDrawable = AnimationDrawable()
        animationDrawable.setEnterFadeDuration(0)
        for (item: Frame in framesList ){
            Log.v(TAG,"Flow start loop ")

            val gradient = GradientDrawable(GradientDrawable.Orientation.BL_TR,item.colors)
            animationDrawable.addFrame(gradient,item.duration);
        }
        animationDrawable.setExitFadeDuration(4000)
        view.background = animationDrawable;
        animationDrawable.start()

        Log.v(TAG,"Flow class start called end ")

    }
}