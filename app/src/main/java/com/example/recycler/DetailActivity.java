package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    CircleImageView circImg;
    TextView tvFullName, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


            circImg = findViewById(R.id.circImg);
            tvFullName = findViewById(R.id.tvFullName);
            tvPhone = findViewById(R.id.tvPhone);

            Bundle bundle = getIntent().getExtras();

            if (bundle !=null){

                circImg.setImageResource(bundle.getInt("image"));
                tvFullName.setText(bundle.getString("name"));
                tvPhone.setText(bundle.getString("phone"));

            }


    }
}
