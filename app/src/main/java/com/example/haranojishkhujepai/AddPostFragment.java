package com.example.haranojishkhujepai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haranojishkhujepai.databinding.FragmentAddPostBinding;
import com.example.haranojishkhujepai.dataclass.PostData;
import com.example.haranojishkhujepai.viewmodel.PostViewModel;


public class AddPostFragment extends Fragment {

    private FragmentAddPostBinding binding;
    private PostViewModel postviewModel;

    public AddPostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddPostBinding.inflate(inflater, container, false);
        postviewModel = new ViewModelProvider(requireActivity()).get(PostViewModel.class);


          binding.savePostBTN.setOnClickListener(view -> {


              final String title = binding.titleET.getText().toString();
              final String description = binding.descriptionET.getText().toString();
              final String location = binding.locationET.getText().toString();
              final String phoneNumber = binding.phoneNumberET.getText().toString();

//              final PostData postData = new PostData(null,System.currentTimeMillis(),);
          });
        return binding.getRoot();

    }
}