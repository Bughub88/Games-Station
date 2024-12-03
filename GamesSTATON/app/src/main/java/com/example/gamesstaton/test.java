package com.example.gamesstaton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class test extends AppCompatActivity {


    private static final String TAG = "test";
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        EditText editText = findViewById(R.id.editText);
        Button sendButton = findViewById(R.id.sendButton);



        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                sendMessageToDatabase(message);

                editText.getText().clear();
            }
        });
    }

    private void sendMessageToDatabase(String message) {
        mDatabase.child("Kullanıcı mesajı").push().setValue(message, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(@NonNull DatabaseError error, @NonNull DatabaseReference ref) {
                if (error == null) {
                    Log.d(TAG, "Message sent successfully!");
                } else {
                    Log.w(TAG, "Failed to send message.", error.toException());
                }
            }
        });




    }
}

