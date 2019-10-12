package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import DataBase.DataBaseHelper;

public class Register extends AppCompatActivity {

    Button register;
    DataBaseHelper dbreg;

    public static final String COL_1 = "name";
    public static final String COL_2 = "passsword";
    public static final String COL_3 = "type";
    public static final String COL_4 = "ID";

    private EditText name, password, type, ID;
    private Button getregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbreg = new DataBaseHelper(this);

        name = findViewById(R.id.editText4);
        password = findViewById(R.id.editText3);

        register = findViewById(R.id.register);
    }
    public void setRegister(View view){

        String nameU = name.getText().toString();
        String passwordU = password.getText().toString();
        String typeU = type.getText().toString();

        if (nameU.equals("")) {
            Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
        } else if (passwordU("")) {
            Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), passwordU, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), nameU, Toast.LENGTH_SHORT).show();
        }

        Boolean insert = dbreg.insertUser(nameU,passwordU);
        if(insert == true){
            Toast.makeText(getApplicationContext(),"successfully inserted", Toast.LENGTH_SHORT).show();
        //else{
                Toast.makeText(getApplicationContext(),"Unsuccssfull",Toast.LENGTH_SHORT).show();
            }


        }

    private boolean passwordU(String s) {
        return false;
    }


}



