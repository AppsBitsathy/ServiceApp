package in.bittechpro.servicenearby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class ResultActivity extends AppCompatActivity {

    ListView listResult;

    private Integer[] d_img = {
            R.drawable.doctor_icon,R.drawable.doctor_icon,R.drawable.doctor_icon,
            R.drawable.doctor_icon,R.drawable.doctor_icon,R.drawable.doctor_icon,
            R.drawable.doctor_icon,R.drawable.doctor_icon,R.drawable.doctor_icon,
            R.drawable.doctor_icon,R.drawable.doctor_icon,R.drawable.doctor_icon
    };
    private  String[] d_name = {
            "Doctor Name","Doctor Name","Doctor Name",
            "Doctor Name","Doctor Name","Doctor Name",
            "Doctor Name","Doctor Name","Doctor Name",
            "Doctor Name","Doctor Name","Doctor Name"
    };
    private  String[] d_spez = {
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization",
            "Specilization","Specilization","Specilization"
    };
    private  String[] d_loc = {
            "Location","Location","location",
            "Location","Location","location",
            "Location","Location","location",
            "Location","Location","location"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            //getSupportActionBar().setTitle("My title");
        }

        listResult = findViewById(R.id.list_result);
        listResult.setAdapter(new ResultAdapter(this,d_img,d_name,d_spez,d_loc));

    }

    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
