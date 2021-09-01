package com.example.colourpicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import top.defaults.colorpicker.ColorPickerPopup;

public class MainActivity extends AppCompatActivity {
    TextView header, textview1, textview2, menu1, menu2, menu3;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        header = findViewById(R.id.headerTitle);
        textview1 = findViewById(R.id.textView1);
        textview2 = findViewById(R.id.textView2);
        menu1 = findViewById(R.id.menu1);
        menu2 = findViewById(R.id.menu2);
        menu3 = findViewById(R.id.menu3);
        layout = (ConstraintLayout) findViewById(R.id.parentLayout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerforParentLayout();
            }
        });

        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerforheader();
            }
        });

        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerforTextView1();
            }
        });

        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerforTextView2();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerforMenu1();
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerforMenu2();
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorPickerforMenu3();
            }
        });
    }

    public void ColorPickerforParentLayout() {
        new ColorPickerPopup.Builder(MainActivity.this)
                .initialColor(Color.RED)
                .enableBrightness(true)
                .enableAlpha(true)
                .okTitle("Choose")
                .cancelTitle("Cancel")
                .showIndicator(true)
                .showValue(true)
                .build()
                .show(new ColorPickerPopup.ColorPickerObserver() {
                    @Override
                    public void onColorPicked(int color) {
                        layout.setBackgroundColor(color);
                    }

                    @Override
                    public void onColor(int color, boolean fromUser) {
                        layout.setBackgroundColor(color);
                    }
                });
    }

    public void ColorPickerforheader() {
        new ColorPickerPopup.Builder(MainActivity.this)
                .initialColor(Color.RED)
                .enableBrightness(true)
                .enableAlpha(true)
                .okTitle("Choose")
                .cancelTitle("Cancel")
                .showIndicator(true)
                .showValue(true)
                .build()
                .show(new ColorPickerPopup.ColorPickerObserver() {
                    @Override
                    public void onColorPicked(int color) {
                        header.setTextColor(color);
                    }
                    @Override
                    public void onColor(int color, boolean fromUser) {
                        header.setTextColor(color);
                    }
                });
    }

    public void ColorPickerforTextView1() {
        new ColorPickerPopup.Builder(MainActivity.this)
                .initialColor(Color.RED)
                .enableBrightness(true)
                .enableAlpha(true)
                .okTitle("Choose")
                .cancelTitle("Cancel")
                .showIndicator(true)
                .showValue(true)
                .build()
                .show(new ColorPickerPopup.ColorPickerObserver() {
                    @Override
                    public void onColorPicked(int color) {
                        textview1.setTextColor(color);
                    }
                    @Override
                    public void onColor(int color, boolean fromUser) {
                        textview1.setTextColor(color);
                    }
                });
    }

    public void ColorPickerforTextView2() {
        new ColorPickerPopup.Builder(MainActivity.this)
                .initialColor(Color.RED)
                .enableBrightness(true)
                .enableAlpha(true)
                .okTitle("Choose")
                .cancelTitle("Cancel")
                .showIndicator(true)
                .showValue(true)
                .build()
                .show(new ColorPickerPopup.ColorPickerObserver() {
                    @Override
                    public void onColorPicked(int color) {
                        textview2.setTextColor(color);
                    }
                    @Override
                    public void onColor(int color, boolean fromUser) {
                        textview2.setTextColor(color);
                    }
                });
    }

    public void ColorPickerforMenu1() {
        new ColorPickerPopup.Builder(MainActivity.this)
                .initialColor(Color.RED)
                .enableBrightness(true)
                .enableAlpha(true)
                .okTitle("Choose")
                .cancelTitle("Cancel")
                .showIndicator(true)
                .showValue(true)
                .build()
                .show(new ColorPickerPopup.ColorPickerObserver() {
                    @Override
                    public void onColorPicked(int color) {
                        menu1.setTextColor(color);
                    }
                    @Override
                    public void onColor(int color, boolean fromUser) {
                        menu1.setTextColor(color);
                    }
                });
    }

    public void ColorPickerforMenu2() {
        new ColorPickerPopup.Builder(MainActivity.this)
                .initialColor(Color.RED)
                .enableBrightness(true)
                .enableAlpha(true)
                .okTitle("Choose")
                .cancelTitle("Cancel")
                .showIndicator(true)
                .showValue(true)
                .build()
                .show(new ColorPickerPopup.ColorPickerObserver() {
                    @Override
                    public void onColorPicked(int color) {
                        menu2.setTextColor(color);
                    }
                    @Override
                    public void onColor(int color, boolean fromUser) {
                        menu2.setTextColor(color);
                    }
                });
    }

    public void ColorPickerforMenu3() {
        new ColorPickerPopup.Builder(MainActivity.this)
                .initialColor(Color.RED)
                .enableBrightness(true)
                .enableAlpha(true)
                .okTitle("Choose")
                .cancelTitle("Cancel")
                .showIndicator(true)
                .showValue(true)
                .build()
                .show(new ColorPickerPopup.ColorPickerObserver() {
                    @Override
                    public void onColorPicked(int color) {
                        menu3.setTextColor(color);
                    }
                    @Override
                    public void onColor(int color, boolean fromUser) {
                        menu3.setTextColor(color);
                    }
                });
    }

}