package org.sopt.besoptsecondseminar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.sopt.besoptsecondseminar.databinding.FragmentFollowingListBinding


class FollowingListFragment : Fragment() {

    private var _binding: FragmentFollowingListBinding ?= null
    private val binding get() = _binding ?: error("View를 참조하기 위해 binding 이 초기화되지 않았습니다.")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFollowingListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}