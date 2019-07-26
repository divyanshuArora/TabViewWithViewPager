package app.divyanshu.TabWithViewPager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class B extends Fragment {
    TextView bTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        bTextView = view.findViewById(R.id.bTextView);

      return view;
    }

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);

        if (menuVisible)
        {
            if (MainActivity.list.get(1).getArguments()!=null)
            {
                String AtoBvalue = MainActivity.list.get(1).getArguments().getString("aTob");
                Toast.makeText(getActivity(), "onAttach B AToB"+AtoBvalue, Toast.LENGTH_SHORT).show();
                bTextView.setText(AtoBvalue);

            }


            bTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String value = bTextView.getText().toString();
                    Bundle bundleB  =new Bundle();
                    bundleB.putString("ValueFromBtoC",value);
                    MainActivity.list.get(2).setArguments(bundleB);

                    Toast.makeText(getActivity(), "Transfer To C", Toast.LENGTH_SHORT).show();

                }
            });











        }


    }
}