package com.emmanuel_rono.potterpedia

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.emmanuel_rono.potterpedia.databinding.FragmentListDetailsBinding
@SuppressLint("StaticFieldLeak")
class ListDetails : Fragment( )
{
    lateinit var binding :FragmentListDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =FragmentListDetailsBinding.inflate(inflater, container, false)
        val character = arguments?.getParcelableExtraCompat<PotterDataItem>("character")


    binding.nameLabelTextView.text= character?.name
    binding.speciesLabelTextView.text = character?.species
    binding.dobValueTextView.text = character?.dateOfBirth
    binding.idValueTextView.text = character?.Id

}
