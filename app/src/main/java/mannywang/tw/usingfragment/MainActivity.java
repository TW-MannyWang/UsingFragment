package mannywang.tw.usingfragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPassData(View view){

        Fragment fragmentMaster = (Fragment)getFragmentManager().findFragmentById(R.id.fgm_master);
        Fragment fragmentDetail = (Fragment)getFragmentManager().findFragmentById(R.id.fgm_detail);


    }

    // the class use show a alert dialog on top of fragment
    public static class AlertDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return new AlertDialog.Builder(getActivity()).setTitle("AlertTitle").setPositiveButton("yes", this).setNegativeButton("no", this).create();
        }

        @Override
        public void onClick(DialogInterface dialog, int which) {

            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    getActivity().finish();
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    dialog.cancel();
                    break;
            }

        }
    }

}


