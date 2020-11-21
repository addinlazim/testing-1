package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Register2 extends AppCompatActivity {
    EditText mFullName,mEmail,mPassword,mPhone,mAddress1,mAddress2,mUsername,mTown,mPostcode,mDate,mGender,mState;
    Button mRegisterBtn;
    TextView mLoginBtn;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        mFullName=findViewById(R.id.editTextTextPersonName);
        mEmail    =findViewById(R.id.editTextTextEmail);
        mPassword =findViewById(R.id.editTextTextPassword);
        mPhone  =findViewById(R.id.editTextTextPhone);
        mAddress1=findViewById(R.id.editTextTextAddress1);
        mAddress2=findViewById(R.id.editTextTextAddress2);
        mUsername=findViewById(R.id.editTextTextUsername);
        mTown=findViewById(R.id.editTextTextTown);
        mPostcode=findViewById(R.id.editTextTextPostcode);
        mDate=findViewById(R.id.editTextTexTBirth);
        mGender=findViewById(R.id.editTextTextGender);




    }
}