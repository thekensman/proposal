package com.example.kenneth.proposal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.*
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var first_scene: Scene? = null
    var second_scene: Scene? = null
    var transition_manager: Transition? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        transition_manager = TransitionInflater.from(this)
                .inflateTransition(R.transition.transition)
        first_scene = Scene.getSceneForLayout(findViewById(R.id.root_container), R.layout.first_scene, this)
        second_scene = Scene.getSceneForLayout(findViewById(R.id.root_container), R.layout.second_scene, this)
        TransitionManager.go(second_scene, transition_manager)
        //TransitionManager.go(first_scene, transition_manager)
    }
}
