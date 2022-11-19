package com.example.haranojishkhujepai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haranojishkhujepai.databinding.FragmentHomeBinding;
import com.example.haranojishkhujepai.viewmodel.LoginViewModel;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private LoginViewModel loginViewModel;
    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);

        binding.newPostFab.setOnClickListener(view ->
                Navigation.findNavController(container).navigate(R.id.addpostFragmentaction));

        return binding.getRoot();
    }
}