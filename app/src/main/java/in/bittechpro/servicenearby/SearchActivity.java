package in.bittechpro.servicenearby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.SearchView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    SearchView searchView;
    GridView gridView;

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
        gridView.setAdapter(new SpezAdapter(this));



    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "sdfhsdh", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }
}
