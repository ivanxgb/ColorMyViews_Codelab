package me.ivaangb.colormyviews_codelab

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boxOneText = findViewById<TextView>(R.id.box_one)
        val boxTwoText = findViewById<TextView>(R.id.box_two)
        val boxThreeText = findViewById<TextView>(R.id.box_three)
        val boxFourText = findViewById<TextView>(R.id.box_four)
        val boxFiveText = findViewById<TextView>(R.id.box_five)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val redButton = findViewById<Button>(R.id.btn_red)
        val greenButton = findViewById<Button>(R.id.btn_green)
        val yellowButton = findViewById<Button>(R.id.btn_yellow)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton
            )

        setListeners(clickableViews)
    }

    private fun makeColored(view: View) {

        val box_three_text: TextView = findViewById(R.id.box_three)
        val box_four_text: TextView = findViewById(R.id.box_four)
        val box_five_text: TextView = findViewById(R.id.box_five)

        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five -> view.setBackgroundColor(Color.BLUE)
            R.id.btn_red -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.btn_yellow -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.btn_green -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners(clickable: List<View>) {
        for (item in clickable) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}