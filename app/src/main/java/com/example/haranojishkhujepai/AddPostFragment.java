package com.example.haranojishkhujepai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haranojishkhujepai.databinding.FragmentAddPostBinding;


public class AddPostFragment extends Fragment {

    private FragmentAddPostBinding binding;

    public AddPostFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentAddPostBinding.inflate(inflater,container,false);

//       binding.savePostBTN.setOnClickListener(view ->
//
//               );
        return binding.getRoot();
    }
}