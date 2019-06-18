package com.lite.my.masterok.Chat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.lite.my.masterok.R;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {


    SharedPreferences sPref;
    final String SAVED_TEXT2 = "saved_text21";
    private TextView final_text2;

    TextView etText2;
    TextView textName;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("messages");

    EditText editTextMassege;
    Button buttonSend;
    private static int MAX_TEXT =200;
    ArrayList<String> masseges =new ArrayList<>();
    ArrayList<String> massegesName =new ArrayList<>();
    RecyclerView mMassegerRecyler;

    Context context2 = this;
    TextView aetText46;

    private TextView final_text;
    private TextView final_text4;
    TextView button101;

    final String MY_SETTINGS = "saved_text_name2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_main);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLUE);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);

        // проверяем, первый ли раз открывается программа



        boolean hasVisited = sp.getBoolean("hasVisited_stg100011112123", false);
        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            final View promptsView = li.inflate(R.layout.prompt_nik, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);

            final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
            String next1 = getString(R.string.next1);
            mDialogBuilder
                    .setCancelable(false)

                    .setPositiveButton(next1+"",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                    if (userInput.getText().length() == 0)
                                    {
                                        textName.setText("no name");

                                        String r6 = getString(R.string.vvedite_imya);
                                        Toast.makeText(getApplicationContext(), r6+"", Toast.LENGTH_SHORT).show();
                                        return;
                                    }else
                                    {
                                        final_text = findViewById(R.id.textName);
                                        final_text.setText(userInput.getText());
                                    }}

                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited_stg100011112123", true);
            e.commit(); // не забудьте подтвердить изменения
        }

        button101 = (TextView) findViewById(R.id.textName);
        final_text4 = (TextView) findViewById(R.id.textName);
        button101.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {

                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt_nik, null);
                                                 android.app.AlertDialog.Builder mDialogBuilder = new android.app.AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             textName.setText("no name");
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text4.setText(userInput.getText());
                                                                         }}

                                                                 });
                                                 android.app.AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mas = editTextMassege.getText().toString();
                String name11 = textName.getText().toString();
                String vryte = getString(R.string.vrete1);
                String dlinniy_text = getString(R.string.dlinny_txt);

                if (name11.equals("no name")) {

                    LayoutInflater li = LayoutInflater.from(context2);
                    final View promptsView = li.inflate(R.layout.prompt_nik, null);
                    android.app.AlertDialog.Builder mDialogBuilder = new android.app.AlertDialog.Builder(context2);
                    mDialogBuilder.setView(promptsView);

                    final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                    mDialogBuilder
                            .setCancelable(false)
                            .setPositiveButton("OK",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {

                                            //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                            final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                            if (userInput.getText().length() == 0)
                                            {
                                                textName.setText("no name");
                                                dialog.cancel();
                                            }else
                                            {
                                                final_text4.setText(userInput.getText());
                                            }}

                                    });
                    android.app.AlertDialog alertDialog = mDialogBuilder.create();
                    alertDialog.show();


                }else {

                    if (mas.equals("")) {

                        Toast.makeText(getApplicationContext(), vryte+"", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (mas.length() > MAX_TEXT) {

                        Toast.makeText(getApplicationContext(), dlinniy_text+"", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    myRef.push().setValue(name11 +": "+ mas);
                    //myRef.push().setValue(mas);
                    editTextMassege.setText("");

                }}
        });

        editTextMassege = findViewById(R.id.massage_input);
        textName = findViewById(R.id.textName);
        mMassegerRecyler = findViewById(R.id.masseg_recycler);
        mMassegerRecyler.setLayoutManager(new LinearLayoutManager(this));

        final DataAdapter dataAdapter = new DataAdapter(this, masseges);
        mMassegerRecyler.setAdapter(dataAdapter);



        myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {



                String mas = dataSnapshot.getValue(String.class);
                //String nam = dataSnapshot.getValue(String.class);
                //String nam = textName.getText().toString();
                masseges.add(mas);
                dataAdapter.notifyDataSetChanged();
                mMassegerRecyler.smoothScrollToPosition(masseges.size());

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        etText2 = findViewById(R.id.textName);

        loadText2();


    }

    void saveText2() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT2, etText2.getText().toString());
        ed.commit();
    }
    void loadText2() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT2, "");
        etText2.setText(savedText);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText2();
    }
}
