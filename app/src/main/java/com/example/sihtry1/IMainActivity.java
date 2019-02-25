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

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class IMainActivity {
    public void createNewNRC(final Context context, String user_id, int bed_count, int bed_vacant, String title,
                             String reg_certi, String address, String state, String city, int pincode, String phone, String email, final boolean verified) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();

//        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();

        DocumentReference newNoteRef = db.collection("nrc").document();

        NRC nrc = new NRC(user_id, bed_count, bed_vacant, title, reg_certi, address, state, city, pincode, phone, verified);

        Map<String, Object> nrc_doc = new HashMap<>();
        nrc_doc.put("user_id", user_id);
        nrc_doc.put("bed_count", "" + bed_count);
        nrc_doc.put("bed_vacant", "" + bed_vacant);
        nrc_doc.put("title", title);
        nrc_doc.put("reg_certi", reg_certi);
        nrc_doc.put("address", address);
        nrc_doc.put("state", state);
        nrc_doc.put("city", city);
        nrc_doc.put("pincode", "" + pincode);
        nrc_doc.put("phone", phone);
        nrc_doc.put("verified", String.valueOf(verified));

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
