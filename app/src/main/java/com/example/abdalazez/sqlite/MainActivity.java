package com.example.abdalazez.sqlite;


/**
 * Created by ABD ALAZEZ on 26/07/2017.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */

    TextView txt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        txt = (TextView)findViewById(R.id.demot);
        //String name = db.getContact(2).getName();
        //String numphone = db.getContact(2).getPhoneNumber();
        //txt.setText(" "+ name + " " + numphone);


        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Zooz", "1997"));
        db.addContact(new Contact("abd", "123456"));
        db.addContact(new Contact("alazez", "159753"));
        db.addContact(new Contact("alswaisi", "123456789"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            //String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            //db.deleteContact(cn);
            txt.append("Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber()+"\n");
            // Writing Contacts to log
            //Log.d("Name: ", log);

        }

    }
}
