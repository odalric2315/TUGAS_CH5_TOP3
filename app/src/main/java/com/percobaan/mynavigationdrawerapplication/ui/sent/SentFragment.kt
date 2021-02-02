package com.percobaan.mynavigationdrawerapplication.ui.sent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.percobaan.mynavigationdrawerapplication.R
import com.percobaan.mynavigationdrawerapplication.ui.gallery.SentViewModel

class SentFragment : Fragment() {

    private lateinit var sentViewModel: SentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sentViewModel =
            ViewModelProvider(this).get(SentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sent, container, false)
        val textView: TextView = root.findViewById(R.id.text_sent)
        sentViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}