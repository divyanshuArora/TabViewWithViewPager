package app.divyanshu.TabWithViewPager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class C extends Fragment  {

    EditText editText;
    Button btnC;
    String valC;



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c,container,false);
        editText = view.findViewById(R.id.cEdit);
        btnC = view.findViewById(R.id.cBtn);
        return view;
    }

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);

        if (menuVisible) {
            if (MainActivity.list.get(2).getArguments() != null) {
                valC = MainActivity.list.get(2).getArguments().getString("ValueFromBtoC");
                editText.setText(valC);
            }


            btnC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    valC = editText.getText().toString();
                    Bundle bundleC = new Bundle();
                    bundleC.putString("valC", valC);
                    MainActivity.list.get(3).setArguments(bundleC);

                    Toast.makeText(getActivity(), "Transfer To D", Toast.LENGTH_SHORT).show();
                }
            });


        }


    }
}
