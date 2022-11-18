package com.example.haranojishkhujepai.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.haranojishkhujepai.dataclass.PostData;
import com.example.haranojishkhujepai.repository.PostRepository;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;


public class PostViewModel extends ViewModel {
    private final PostRepository repository = new PostRepository();
    public void addPost(PostData postData){
        repository.insertNewPost(postData).addOnSuccessListener(unused -> {

        }).addOnFailureListener(e -> {

        });

    }


}
