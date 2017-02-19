package mannywang.tw.usingfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by MannyWang on 18/02/2017.
 */

public class MasterFragment extends Fragment{

    EditText mEditText;

    @Override
    public void onStart() {
        super.onStart();
        mEditText = (EditText)getView().findViewById(R.id.edt_input);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextView textView = (TextView)getActivity().findViewById(R.id.tv_Title);
                textView.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public String getEditTextContext(){
        if(mEditText != null){
            return mEditText.getText().toString();
        }
        else
            return "";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_master, container, false);
    }


}
