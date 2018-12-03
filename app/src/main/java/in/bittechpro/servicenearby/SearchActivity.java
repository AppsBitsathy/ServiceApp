package in.bittechpro.servicenearby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.SearchView;

public class SearchActivity extends AppCompatActivity {

    SearchView searchView;
    GridView gridView;

    private Integer[] spez_icon = {
            R.drawable.spez_1,R.drawable.spez_1,R.drawable.spez_1,
            R.drawable.spez_1,R.drawable.spez_1,R.drawable.spez_1,
            R.drawable.spez_1,R.drawable.spez_1,R.drawable.spez_1,
            R.drawable.spez_1,R.drawable.spez_1,R.drawable.spez_1,
            R.drawable.spez_1,R.drawable.spez_1,R.drawable.spez_1,
            R.drawable.spez_1,R.drawable.spez_1,R.drawable.spez_1,
            R.drawable.spez_1,R.drawable.spez_1,R.drawable.spez_1
    };

    private  String[] spez_name = {
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchView = findViewById(R.id.search_bar);
        searchView.onActionViewExpanded();
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    searchView.setIconified(true);
                }
            }
        });

        gridView = findViewById(R.id.grid_spez);
        gridView.setAdapter(new SpezAdapter(this,spez_icon,spez_name));



    }

    @Override
    public void onBackPressed() {
        //Toast.makeText(this, "Have a Good day", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }
}
