/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * The colorMyViews app demonstrates how to use a ConstraintLayout using
 * the Layout Editor.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    /**
     * Attaches listeners to all the views.
     */
    private fun setListeners() {

        val boxText = findViewById<TextView>(R.id.box) //boxOne dati
        val box1Text = findViewById<TextView>(R.id.box1) //boxOne dati
        val box2Text = findViewById<TextView>(R.id.box2)
        val box3Text = findViewById<TextView>(R.id.box3)
        val box4Text = findViewById<TextView>(R.id.box4)
        val box5Text = findViewById<TextView>(R.id.box5)
        val box6Text = findViewById<TextView>(R.id.box6)
        val box7Text = findViewById<TextView>(R.id.box7)
        val box8Text = findViewById<TextView>(R.id.box8)
        val box9Text = findViewById<TextView>(R.id.box9)
        val box10Text = findViewById<TextView>(R.id.box10)
        val box11Text = findViewById<TextView>(R.id.box11)
        val box12Text = findViewById<TextView>(R.id.box12)
        val box13Text = findViewById<TextView>(R.id.box13)
        val box14Text = findViewById<TextView>(R.id.box14)
        val box15Text = findViewById<TextView>(R.id.box15)
        val box16Text = findViewById<TextView>(R.id.box16)
        val box17Text = findViewById<TextView>(R.id.box17)
        val box18Text = findViewById<TextView>(R.id.box18)
        val box19Text = findViewById<TextView>(R.id.box19)
        val box20Text = findViewById<TextView>(R.id.box20)
        val box21Text = findViewById<TextView>(R.id.box21)
        val box22Text = findViewById<TextView>(R.id.box22)
        val box23Text = findViewById<TextView>(R.id.box23)
        val box24Text = findViewById<TextView>(R.id.box24)


        //val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)


        val retryButton = findViewById<TextView>(R.id.retry_button)


        val clickableViews: List<View> =
            listOf(
                boxText,
                box1Text, box2Text, box3Text,
                box4Text, box5Text,box6Text, box7Text, box8Text,
                box9Text, box10Text,box11Text, box12Text, box13Text,
                box14Text, box15Text,box16Text, box17Text, box18Text,
                box19Text, box20Text,box21Text, box22Text, box23Text,
                box24Text,retryButton
                )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

        retryButton.setOnClickListener{retry(clickableViews)}
    }

    /**
     * Sets the background color of a view depending on it's resource id.
     * This is a way of using one click handler to do similar operations on a
     * group of views.
     */

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            //R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box1 -> view.setBackgroundColor(Color.BLACK)
            R.id.box2 -> view.setBackgroundColor(Color.BLACK)

            //R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            //R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            //R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            // Boxes using custom colors for background
            //R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            //R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            //R.id.retry_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun retry(clickableViews: List<View>){
        for (item in clickableViews) {
            item.setBackgroundColor(Color.WHITE)
        }
    }
}
