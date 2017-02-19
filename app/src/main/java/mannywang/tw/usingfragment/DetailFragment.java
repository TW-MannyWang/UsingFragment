package mannywang.tw.usingfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by MannyWang on 18/02/2017.
 */

public class DetailFragment extends Fragment {

    TextView mTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        mTextView = (TextView)view.findViewById(R.id.tv_Title);

        return view;
    }

    public void setTextViewContext(String context){
        if(mTextView != null){
            mTextView.setText(context);
        }
    }

}
