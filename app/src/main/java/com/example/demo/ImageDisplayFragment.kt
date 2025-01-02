package com.example.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class ImageDisplayFragment : Fragment() {

    companion object {
        fun newInstance() = ImageDisplayFragment()
    }

    private val viewModel: ImageDisplayViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_image_display, container, false)
        val constraintLayout: ConstraintLayout =
            view.findViewById(R.id.image_display_constraint_layout)
        constraintLayout.setBackgroundResource(R.drawable.background)
        return view
    }
}