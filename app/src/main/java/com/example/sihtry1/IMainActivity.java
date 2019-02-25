package com.example.sihtry1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.example.sihtry1.models.NRC;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.net.URL;

public class IMainActivity {
    public void createNewNRC(final Context context, String user_id, int bed_count, int bed_vacant, String title,
                             URL reg_certi, String address, String state, String city, int pincode, long phone, String email, final boolean verified) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();

//        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();

        DocumentReference newNoteRef = db.collection("nrc").document();

        NRC nrc = new NRC(user_id, bed_count, bed_vacant, title, reg_certi, address, state, city, pincode, phone, email, verified);


        newNoteRef.set(nrc).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    verificationDue(context);

                } else {
                    Toast.makeText(context.getApplicationContext(), "Registeration Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void verificationDue(Context context) {
        Intent intent = new Intent(context, VerificationDueActivity.class);
        context.startActivity(intent);
    }
}
