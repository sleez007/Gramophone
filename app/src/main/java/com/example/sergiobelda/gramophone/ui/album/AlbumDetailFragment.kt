package com.example.sergiobelda.gramophone.ui.album


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.sergiobelda.gramophone.R
import androidx.coordinatorlayout.widget.CoordinatorLayout
import android.widget.FrameLayout





class AlbumDetailFragment : Fragment() {
    var behavior: CoordinatorLayout.Behavior<*>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_album_detail, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        /*
        if (behavior != null)
            return

        val layout = activity!!.findViewById(R.id.frameLayout) as FrameLayout
        val params = layout.layoutParams as CoordinatorLayout.LayoutParams

        behavior = params.behavior
        params.behavior = null
        */
    }
}
