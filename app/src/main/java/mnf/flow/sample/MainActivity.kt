package mnf.flow.sample

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import mnf.animate.gradient_flow.Flow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var colorsOne = intArrayOf(resources.getColor(R.color.gradientFourStart),
                resources.getColor(R.color.gradientFourEnd),resources.getColor(R.color.gradientFiveStart), resources.getColor(R.color.gradientFiveEnd))
        var colorsTwo = intArrayOf(resources.getColor(R.color.gradientFiveStart), resources.getColor(R.color.gradientFiveEnd))
       // var colorsThree = intArrayOf(resources.getColor(R.color.gradientSixStart), resources.getColor(R.color.gradientSixEnd))
        val context: Context = applicationContext;


        val flow = Flow(context)
        flow.addFrame(Flow.Orientation.BottomLeft_TopRight,colorsOne,4000)

        //flow.addFrame(Flow.Orientation.BottomLeft_TopRight,colorsTwo,4000)

       // flow.addFrame(Flow.Orientation.BottomLeft_TopRight,colorsThree,4000)
        flow.start(relative_layout_container)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when(item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
