package com.example.android.projet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_fragment1.*


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        commencer.setOnClickListener { view ->
            // view.findNavController().navigate(R.id.action_fragment1_to_listPharmacieFragment)
            view.findNavController().navigate(R.id.action_fragment1_to_menu_profile2)
        }
        inscrire.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_fragment1_to_inscrireFragment)
        }

        connecter.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_fragment1_to_connecterFragment)
        }
    }

}
