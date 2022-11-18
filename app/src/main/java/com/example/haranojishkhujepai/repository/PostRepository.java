package com.example.haranojishkhujepai.repository;

import com.example.haranojishkhujepai.dataclass.PostData;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class PostRepository {
    private final String COLLECTION_POST = "PostData";
    private final FirebaseFirestore DB = FirebaseFirestore.getInstance();


    public Task<Void> insertNewPost(PostData postData){
        final DocumentReference ref = DB.collection(COLLECTION_POST)
                .document();
        postData.setId(ref.getId());
        return ref.set(postData);
    }

}
