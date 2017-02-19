package mannywang.tw.usingfragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by MannyWang on 18/02/2017.
 */

public class AlertDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
