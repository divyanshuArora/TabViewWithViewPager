package app.divyanshu.TabWithViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class D extends Fragment {

   TextView dTextView;
   String valD;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_d, container, false);

        dTextView = view.findViewById(R.id.dTextView);

        return view;
    }


    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
        if (menuVisible) {

            if (MainActivity.list.get(3).getArguments() != null) {

                valD = MainActivity.list.get(3).getArguments().getString("valC");
                dTextView.setText(valD);
            }


            dTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    valD = dTextView.getText().toString();

                    Bundle bundleD = new Bundle();
                    bundleD.putString("valD", valD);

                    MainActivity.list.get(0).setArguments(bundleD);
                    Toast.makeText(getActivity(), "Transfered to A", Toast.LENGTH_SHORT).show();


                }
            });

        }

    }
}
