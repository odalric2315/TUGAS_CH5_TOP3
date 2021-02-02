package com.percobaan.mynavigationdrawerapplication.ui.trash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.percobaan.mynavigationdrawerapplication.R
import com.percobaan.mynavigationdrawerapplication.ui.trash.TrashViewModel

class TrashFragment : Fragment() {

    private lateinit var trashViewModel: TrashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        trashViewModel =
            ViewModelProvider(this).get(TrashViewModel::class.java)
        val root = inflater.inflate(R.layout.trash_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.text_trash)
        trashViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
