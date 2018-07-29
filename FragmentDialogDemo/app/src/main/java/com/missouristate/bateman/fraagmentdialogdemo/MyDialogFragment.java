package com.missouristate.bateman.fraagmentdialogdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;


// To generate the onCreateDialog() right click on DialogFragment and Generate and
// select onCreateDialog()

public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // We build the dialog
        // getActivity() returns the Activity this Fragment is associated with
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        // Set the title for the Dialog
        theDialog.setTitle("Sample Dialog");

        // Set the message
        theDialog.setMessage("Hello I am a Dialog");

        // Add text for a positive button
        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked OK", Toast.LENGTH_SHORT).show();
                    }
            });

        // Add text for a negative button
        theDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
        return theDialog.create();
    }
}
