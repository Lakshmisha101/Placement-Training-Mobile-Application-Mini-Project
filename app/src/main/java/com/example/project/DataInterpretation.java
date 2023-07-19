package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataInterpretation extends AppCompatActivity {

    private TextView tvHiddenContent1, tvHiddenContent2, tvHiddenContent3, tvHiddenContent4, tvHiddenContent5, tvHiddenContent6, tvHiddenContent7, tvHiddenContent8, tvHiddenContent9, tvHiddenContent10;
    private Button btnToggle1,btnToggle2,btnToggle3,btnToggle4,btnToggle5,btnToggle6,btnToggle7,btnToggle8,btnToggle9,btnToggle10;
    private boolean isContentVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_interpretation);

        tvHiddenContent1 = findViewById(R.id.tvDIHiddenContent1);
        btnToggle1 = findViewById(R.id.btnDIToggle1);

        btnToggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility1();
            }
        });

        tvHiddenContent2 = findViewById(R.id.tvDIHiddenContent2);
        btnToggle2= findViewById(R.id.btnDIToggle2);

        btnToggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility2();
            }
        });

        tvHiddenContent3 = findViewById(R.id.tvDIHiddenContent3);
        btnToggle3 = findViewById(R.id.btnDIToggle3);

        btnToggle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility3();
            }
        });


        tvHiddenContent4 = findViewById(R.id.tvDIHiddenContent4);
        btnToggle4= findViewById(R.id.btnDIToggle4);

        btnToggle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility4();
            }
        });

        tvHiddenContent5 = findViewById(R.id.tvDIHiddenContent5);
        btnToggle5 = findViewById(R.id.btnDIToggle5);

        btnToggle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility5();
            }
        });

        tvHiddenContent6 = findViewById(R.id.tvDIHiddenContent6);
        btnToggle6 = findViewById(R.id.btnDIToggle6);

        btnToggle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility6();
            }
        });

        tvHiddenContent7 = findViewById(R.id.tvDIHiddenContent7);
        btnToggle7 = findViewById(R.id.btnDIToggle7);

        btnToggle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility7();
            }
        });


        tvHiddenContent8 = findViewById(R.id.tvDIHiddenContent8);
        btnToggle8 = findViewById(R.id.btnDIToggle8);

        btnToggle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility8();
            }
        });

        tvHiddenContent9 = findViewById(R.id.tvDIHiddenContent9);
        btnToggle9 = findViewById(R.id.btnDIDIToggle9);

        btnToggle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility9();
            }
        });




        tvHiddenContent10 = findViewById(R.id.tvDIHiddenContent10);
        btnToggle10 = findViewById(R.id.btnDIToggle10);

        btnToggle10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility10();
            }
        });
    }

    private void toggleContentVisibility1() {
        if (isContentVisible) {
            tvHiddenContent1.setVisibility(View.GONE);
            btnToggle1.setText("Show Solution");
            isContentVisible = false;
        } else {
            tvHiddenContent1.setVisibility(View.VISIBLE);
            btnToggle1.setText("Show Solution");
            isContentVisible = true;
        }
    }




    private void toggleContentVisibility2() {
        if (isContentVisible) {
            tvHiddenContent2.setVisibility(View.GONE);
            btnToggle2.setText("Show Solution");
            isContentVisible = false;
        } else {
            tvHiddenContent2.setVisibility(View.VISIBLE);
            btnToggle2.setText("Show Solution");
            isContentVisible = true;
        }
    }




private void toggleContentVisibility3() {
        if (isContentVisible) {
        tvHiddenContent3.setVisibility(View.GONE);
        btnToggle3.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent3.setVisibility(View.VISIBLE);
        btnToggle3.setText("Show Solution");
        isContentVisible = true;
        }
        }





private void toggleContentVisibility4() {
        if (isContentVisible) {
        tvHiddenContent4.setVisibility(View.GONE);
        btnToggle4.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent4.setVisibility(View.VISIBLE);
        btnToggle4.setText("Show Solution");
        isContentVisible = true;
        }
        }



private void toggleContentVisibility5() {
        if (isContentVisible) {
        tvHiddenContent5.setVisibility(View.GONE);
        btnToggle5.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent5.setVisibility(View.VISIBLE);
        btnToggle5.setText("Show Solution");
        isContentVisible = true;
        }
        }




private void toggleContentVisibility6() {
        if (isContentVisible) {
        tvHiddenContent6.setVisibility(View.GONE);
        btnToggle6.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent6.setVisibility(View.VISIBLE);
        btnToggle6.setText("SShow Solution");
        isContentVisible = true;
        }
        }


private void toggleContentVisibility7() {
        if (isContentVisible) {
        tvHiddenContent7.setVisibility(View.GONE);
        btnToggle7.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent7.setVisibility(View.VISIBLE);
        btnToggle7.setText("Show Solution");
        isContentVisible = true;
        }
        }


private void toggleContentVisibility8() {
        if (isContentVisible) {
        tvHiddenContent8.setVisibility(View.GONE);
        btnToggle8.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent8.setVisibility(View.VISIBLE);
        btnToggle8.setText("Show Solution");
        isContentVisible = true;
        }
        }



private void toggleContentVisibility9() {
        if (isContentVisible) {
        tvHiddenContent9.setVisibility(View.GONE);
        btnToggle9.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent9.setVisibility(View.VISIBLE);
        btnToggle9.setText("Show Solution");
        isContentVisible = true;
        }
        }

private void toggleContentVisibility10() {
        if (isContentVisible) {
        tvHiddenContent10.setVisibility(View.GONE);
        btnToggle10.setText("Show Solution");
        isContentVisible = false;
        } else {
        tvHiddenContent10.setVisibility(View.VISIBLE);
        btnToggle10.setText("Show Solution");
        isContentVisible = true;
        }
        }
}
