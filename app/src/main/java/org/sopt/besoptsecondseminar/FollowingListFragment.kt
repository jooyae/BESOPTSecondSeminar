package org.sopt.besoptsecondseminar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.sopt.besoptsecondseminar.databinding.FragmentFollowingListBinding


class FollowingListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFollowingListBinding.inflate(inflater, container, false)
        return binding.root
    }

}