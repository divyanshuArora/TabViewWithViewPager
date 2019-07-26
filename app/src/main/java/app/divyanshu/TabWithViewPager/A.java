package app.divyanshu.TabWithViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class A extends Fragment {

    EditText editText;
    Button btn;
    String value;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(), "onCreateView A ", Toast.LENGTH_SHORT).show();

        View view = inflater.inflate(R.layout.fragment_a,container,false);
        editText = view.findViewById(R.id.aEdit);
        btn = view.findViewById(R.id.aBtn);
        return view;
    }

    @Override
    public void onStart(){
        super.onStart();

        Toast.makeText(getActivity(), "onStart A ", Toast.LENGTH_SHORT).show();

        if (MainActivity.list.get(0).getArguments()!= null)
        {
            Log.d("value", "onCreateView: ");
            value = MainActivity.list.get(0).getArguments().getString("valD");
            Log.e("A", "value: "+value);

            Toast.makeText(getActivity(), value, Toast.LENGTH_SHORT).show();
            editText.setText(value);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valueEdit = editText.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("aTob",valueEdit);
                MainActivity.list.get(1).setArguments(bundle);
                Toast.makeText(getActivity(), "Transferred ro B", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
