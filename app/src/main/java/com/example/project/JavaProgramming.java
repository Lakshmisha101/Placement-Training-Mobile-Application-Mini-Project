package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaProgramming extends AppCompatActivity {

    private TextView tvHiddenContent1,tvHiddenContent2,tvHiddenContent3,tvHiddenContent4,tvHiddenContent5,tvHiddenContent6,tvHiddenContent7,tvHiddenContent8,tvHiddenContent9,tvHiddenContent10;
    private Button btnToggle1,btnToggle2,btnToggle3,btnToggle4,btnToggle5,btnToggle6,btnToggle7,btnToggle8,btnToggle9,btnToggle10;
    private boolean isContentVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_programming);
        tvHiddenContent1 = findViewById(R.id.tvArithmeticHiddenContent1);
        btnToggle1= findViewById(R.id.ArithmeticbtnToggle1);

        btnToggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility1();
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


        tvHiddenContent2 = findViewById(R.id.tvArithmeticHiddenContent2);
        btnToggle2= findViewById(R.id.ArithmeticbtnToggle2);

        btnToggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility2();
            }
        });
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

        tvHiddenContent3 = findViewById(R.id.tvArithmeticHiddenContent3);
        btnToggle3= findViewById(R.id.ArithmeticbtnToggle3);

        btnToggle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility3();
            }
        });
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


        tvHiddenContent4 = findViewById(R.id.tvArithmeticHiddenContent4);
        btnToggle4= findViewById(R.id.ArithmeticbtnToggle4);

        btnToggle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility4();
            }
        });
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

        tvHiddenContent5 = findViewById(R.id.tvArithmeticHiddenContent5);
        btnToggle5= findViewById(R.id.ArithmeticbtnToggle5);

        btnToggle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility5();
            }
        });
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

        tvHiddenContent6 = findViewById(R.id.tvArithmeticHiddenContent6);
        btnToggle6= findViewById(R.id.ArithmeticbtnToggle6);

        btnToggle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility6();
            }
        });
    }

    private void toggleContentVisibility6() {
        if (isContentVisible) {
            tvHiddenContent6.setVisibility(View.GONE);
            btnToggle6.setText("Show Solution");
            isContentVisible = false;
        } else {
            tvHiddenContent6.setVisibility(View.VISIBLE);
            btnToggle6.setText("Show Solution");
            isContentVisible = true;
        }


        tvHiddenContent7 = findViewById(R.id.tvArithmeticHiddenContent7);
        btnToggle7= findViewById(R.id.ArithmeticbtnToggle7);

        btnToggle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility7();
            }
        });
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


        tvHiddenContent8 = findViewById(R.id.tvArithmeticHiddenContent8);
        btnToggle8= findViewById(R.id.ArithmeticbtnToggle8);

        btnToggle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility8();
            }
        });
    }

    private void toggleContentVisibility8() {
        if (isContentVisible) {
            tvHiddenContent8.setVisibility(View.GONE);
            btnToggle8.setText("Show Solution");
            isContentVisible = false;
        } else {
            tvHiddenContent8.setVisibility(View.VISIBLE);
            btnToggle9.setText("Show Solution");
            isContentVisible = true;
        }

        tvHiddenContent9 = findViewById(R.id.tvArithmeticHiddenContent9);
        btnToggle9= findViewById(R.id.ArithmeticbtnToggle9);

        btnToggle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility9();
            }
        });
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


        tvHiddenContent10 = findViewById(R.id.tvArithmeticHiddenContent10);
        btnToggle10= findViewById(R.id.ArithmeticbtnToggle10);

        btnToggle10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleContentVisibility10();
            }
        });
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