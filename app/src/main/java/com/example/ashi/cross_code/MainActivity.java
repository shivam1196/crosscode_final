package com.example.ashi.cross_code;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.concurrent.TimeUnit;
public class MainActivity extends AppCompatActivity {
    ToggleButton t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39;
    ToggleButton t41,t42,t43,t44,t45,t46,t47,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,t68,t69,t70,t71,t72,t73,t74,t75,t76,t77,t78,t79,t80;
    ToggleButton t81,t82,t83,t84,t85,t86,t87,t88,t89,t90,t91,t92,t93,t94,t95,t96,t97,t98,t99,t100,t101,t102,t103,t104,t105,t106,t107,t108,t109,t110,t111,t112,t113,t114,t115,t116,t117,t118,t119;
    RadioGroup l1;
    Button submit;
    TextView mTextView;
    boolean[] questions;
    private static final String FORMAT = "%02d:%02d:%02d";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        questions=new boolean[16];
        mTextView=findViewById(R.id.txtTime);
        l1=findViewById(R.id.numbers);
        final CountDownTimer countDownTimer = new CountDownTimer(1800000,1000) {
            @Override
            public void onTick(long l) {
                mTextView.setText(" "+""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(l),
                        TimeUnit.MILLISECONDS.toMinutes(l) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(l)),
                        TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(l))));
            }

            @Override
            public void onFinish()
            {
                Toast.makeText(MainActivity.this, mTextView.getText().toString(), Toast.LENGTH_SHORT).show();
                if(t1.getTextOff().toString().equals("A")&&t2.getTextOff().toString().equals("D")&&t3.getTextOff().toString().equals("O")&&t4.getTextOff().toString().equals("B")&&t5.getTextOff().toString().equals("E")&&t6.getTextOff().toString().equals("A")&&t7.getTextOff().toString().equals("C")&&t8.getTextOff().toString().equals("R")&&t9.getTextOff().toString().equals("O")&&t10.getTextOff().toString().equals("B")&&t11.getTextOff().toString().equals("A")&&t12.getTextOff().toString().equals("T")&&t13.getTextOff().toString().equals("R")&&t14.getTextOff().toString().equals("E")&&t15.getTextOff().toString().equals("A")&&t16.getTextOff().toString().equals("D")&&t17.getTextOff().toString().equals("E")&&t18.getTextOff().toString().equals("R")&&t19.getTextOff().toString().equals("D")&&t20.getTextOff().toString().equals("C"))
                {
                    questions[1]=true;
                }
                if(t13.getTextOff().toString().equals("R")&&t21.getTextOff().toString().equals("O")&&t22.getTextOff().toString().equals("B")&&t23.getTextOff().toString().equals("E")&&t24.getTextOff().toString().equals("R")&&t25.getTextOff().toString().equals("T")&&t26.getTextOff().toString().equals("E")&&t27.getTextOff().toString().equals("L")&&t28.getTextOff().toString().equals("L")&&t29.getTextOff().toString().equals("I")&&t30.getTextOff().toString().equals("O")&&t31.getTextOff().toString().equals("T")&&t32.getTextOff().toString().equals("K")&&t33.getTextOff().toString().equals("A")&&t34.getTextOff().toString().equals("H")&&t35.getTextOff().toString().equals("N"))
                {
                    questions[2]=true;
                }
                if(t36.getTextOff().toString().equals("C")&&t39.getTextOff().toString().equals("L")&&t56.getTextOff().toString().equals("I")&&t68.getTextOff().toString().equals("P")&&t70.getTextOff().toString().equals("B")&&t80.getTextOff().toString().equals("O")&&t92.getTextOff().toString().equals("A")&&t97.getTextOff().toString().equals("R")&&t98.getTextOff().toString().equals("D"))
                {
                    questions[3]=true;
                }
                if(t37.getTextOff().toString().equals("R")&&t51.getTextOff().toString().equals("A")&&t66.getTextOff().toString().equals("M")&&t75.getTextOff().toString().equals("A")&&t77.getTextOff().toString().equals("C"))
                {
                    questions[4]=true;
                }
                if(t38.getTextOff().toString().equals("D")&&t54.getTextOff().toString().equals("E")&&t67.getTextOff().toString().equals("S")&&t69.getTextOff().toString().equals("K")&&t78.getTextOff().toString().equals("T")&&t84.getTextOff().toString().equals("O")&&t100.getTextOff().toString().equals("P"))
                {
                    questions[5]=true;
                }
                if(t23.getTextOff().toString().equals("E")&&t41.getTextOff().toString().equals("X")&&t42.getTextOff().toString().equals("T")&&t43.getTextOff().toString().equals("R")&&t44.getTextOff().toString().equals("A")&&t45.getTextOff().toString().equals("N")&&t46.getTextOff().toString().equals("E")&&t47.getTextOff().toString().equals("T"))
                {
                    questions[6]=true;
                }
                if(t50.getTextOff().toString().equals("H")&&t51.getTextOff().toString().equals("A")&&t52.getTextOff().toString().equals("C")&&t53.getTextOff().toString().equals("K")&&t54.getTextOff().toString().equals("E")&&t55.getTextOff().toString().equals("R"))
                {
                    questions[7]=true;
                }
                if(t25.getTextOff().toString().equals("T")&&t57.getTextOff().toString().equals("Y")&&t58.getTextOff().toString().equals("P")&&t59.getTextOff().toString().equals("E")&&t60.getTextOff().toString().equals("W")&&t61.getTextOff().toString().equals("R")&&t62.getTextOff().toString().equals("I")&&t63.getTextOff().toString().equals("T")&&t64.getTextOff().toString().equals("E")&&t65.getTextOff().toString().equals("R"))
                {
                    questions[8]=true;
                }
                if(t60.getTextOff().toString().equals("W")&&t71.getTextOff().toString().equals("Y")&&t81.getTextOff().toString().equals("S")&&t95.getTextOff().toString().equals("I")&&t101.getTextOff().toString().equals("W")&&t102.getTextOff().toString().equals("Y")&&t103.getTextOff().toString().equals("G"))
                {
                    questions[9]=true;
                }
                if(t63.getTextOff().toString().equals("T")&&t72.getTextOff().toString().equals("W")&&t82.getTextOff().toString().equals("E")&&t96.getTextOff().toString().equals("E")&&t104.getTextOff().toString().equals("T")&&t105.getTextOff().toString().equals("S"))
                {
                    questions[10]=true;
                }
                if(t73.getTextOff().toString().equals("S")&&t74.getTextOff().toString().equals("P")&&t75.getTextOff().toString().equals("A")&&t76.getTextOff().toString().equals("M"))
                {
                    questions[11]=true;
                }
                if(t79.getTextOff().toString().equals("R")&&t89.getTextOff().toString().equals("S")&&t99.getTextOff().toString().equals("I"))
                {
                    questions[12]=true;
                }
                if(t83.getTextOff().toString().equals("N")&&t84.getTextOff().toString().equals("O")&&t85.getTextOff().toString().equals("N")&&t86.getTextOff().toString().equals("C")&&t87.getTextOff().toString().equals("O")&&t88.getTextOff().toString().equals("N")&&t89.getTextOff().toString().equals("S")&&t90.getTextOff().toString().equals("U")&&t91.getTextOff().toString().equals("M")&&t92.getTextOff().toString().equals("A")&&t93.getTextOff().toString().equals("B")&&t28.getTextOff().toString().equals("L")&&t94.getTextOff().toString().equals("E"))
                {
                    questions[13]=true;
                }
                if(t112.getTextOff().toString().equals("S")&&t113.getTextOff().toString().equals("O")&&t114.getTextOff().toString().equals("U")&&t115.getTextOff().toString().equals("N")&&t116.getTextOff().toString().equals("D")&&t117.getTextOff().toString().equals("C")&&t33.getTextOff().toString().equals("A")&&t118.getTextOff().toString().equals("R")&&t119.getTextOff().toString().equals("D"))
                {
                    questions[14]=true;
                }
                if(t107.getTextOff().toString().equals("S")&&t108.getTextOff().toString().equals("U")&&t109.getTextOff().toString().equals("R")&&t110.getTextOff().toString().equals("F")&&t111.getTextOff().toString().equals("I")&&t35.getTextOff().toString().equals("N")&&t105.getTextOff().toString().equals("G"))
                {
                    questions[15]=true;
                }
                Intent i=new Intent(MainActivity.this,result.class);
                i.putExtra("result",questions);
                startActivity(i);
            }
        }.start();
        t1=findViewById(R.id.toggle0);
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t1.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t1.setText(number);
                            t1.setTextOff(number);
                            t1.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t2=findViewById(R.id.toggle1);
        t2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t2.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t2.setText(number);
                            t2.setTextOff(number);
                            t2.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t3=findViewById(R.id.toggle2);
        t3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t3.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t3.setText(number);
                            t3.setTextOff(number);
                            t3.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t4=findViewById(R.id.toggle3);
        t4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t4.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t4.setText(number);
                            t4.setTextOff(number);
                            t4.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t5=findViewById(R.id.toggle4);
        t5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t5.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t5.setText(number);
                            t5.setTextOff(number);
                            t5.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t6=findViewById(R.id.toggle5);
        t6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t6.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t6.setText(number);
                            t6.setTextOff(number);
                            t6.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t7=findViewById(R.id.toggle6);
        t7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t7.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t7.setText(number);
                            t7.setTextOff(number);
                            t7.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t8=findViewById(R.id.toggle7);
        t8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t8.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t8.setText(number);
                            t8.setTextOff(number);
                            t8.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t9=findViewById(R.id.toggle8);
        t9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t9.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t9.setText(number);
                            t9.setTextOff(number);
                            t9.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t10=findViewById(R.id.toggle9);
        t10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t10.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t10.setText(number);
                            t10.setTextOff(number);
                            t10.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t11=findViewById(R.id.toggle10);
        t11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t11.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t11.setText(number);
                            t11.setTextOff(number);
                            t11.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t12=findViewById(R.id.toggle11);
        t12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t12.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t12.setText(number);
                            t12.setTextOff(number);
                            t12.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t13=findViewById(R.id.toggle12);
        t13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t13.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t13.setText(number);
                            t13.setTextOff(number);
                            t13.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t14=findViewById(R.id.toggle13);
        t14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t14.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t14.setText(number);
                            t14.setTextOff(number);
                            t14.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t15=findViewById(R.id.toggle14);
        t15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t15.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t15.setText(number);
                            t15.setTextOff(number);
                            t15.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t16=findViewById(R.id.toggle15);
        t16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t16.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t16.setText(number);
                            t16.setTextOff(number);
                            t16.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t17=findViewById(R.id.toggle16);
        t17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t17.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t17.setText(number);
                            t17.setTextOff(number);
                            t17.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t18=findViewById(R.id.toggle17);
        t18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t18.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t18.setText(number);
                            t18.setTextOff(number);
                            t18.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t19=findViewById(R.id.toggle18);
        t19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t19.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t19.setText(number);
                            t19.setTextOff(number);
                            t19.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t20=findViewById(R.id.toggle19);
        t20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t20.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t20.setText(number);
                            t20.setTextOff(number);
                            t20.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t21=findViewById(R.id.toggle20);
        t21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t21.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t21.setText(number);
                            t21.setTextOff(number);
                            t21.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t22=findViewById(R.id.toggle21);
        t22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t22.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t22.setText(number);
                            t22.setTextOff(number);
                            t22.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t23=findViewById(R.id.toggle22);
        t23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t23.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t23.setText(number);
                            t23.setTextOff(number);
                            t23.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });

        t24=findViewById(R.id.toggle23);
        t24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t24.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t24.setText(number);
                            t24.setTextOff(number);
                            t24.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t25=findViewById(R.id.toggle24);
        t25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t25.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t25.setText(number);
                            t25.setTextOff(number);
                            t25.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t26=findViewById(R.id.toggle25);
        t26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t26.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t26.setText(number);
                            t26.setTextOff(number);
                            t26.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t27=findViewById(R.id.toggle26);
        t27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t27.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t27.setText(number);
                            t27.setTextOff(number);
                            t27.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t28=findViewById(R.id.toggle27);
        t28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t28.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t28.setText(number);
                            t28.setTextOff(number);
                            t28.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t29=findViewById(R.id.toggle28);
        t29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t29.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t29.setText(number);
                            t29.setTextOff(number);
                            t29.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t30=findViewById(R.id.toggle29);
        t30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t30.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t30.setText(number);
                            t30.setTextOff(number);
                            t30.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t31=findViewById(R.id.toggle30);
        t31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t31.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t31.setText(number);
                            t31.setTextOff(number);
                            t31.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t32=findViewById(R.id.toggle31);
        t32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t32.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t32.setText(number);
                            t32.setTextOff(number);
                            t32.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t33=findViewById(R.id.toggle32);
        t33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t33.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t33.setText(number);
                            t33.setTextOff(number);
                            t33.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t34=findViewById(R.id.toggle33);
        t34.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t34.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t34.setText(number);
                            t34.setTextOff(number);
                            t34.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t35=findViewById(R.id.toggle34);
        t35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t35.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t35.setText(number);
                            t35.setTextOff(number);
                            t35.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t36=findViewById(R.id.toggle35);
        t36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t36.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t36.setText(number);
                            t36.setTextOff(number);
                            t36.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t37=findViewById(R.id.toggle36);
        t37.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t37.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t37.setText(number);
                            t37.setTextOff(number);
                            t37.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t38=findViewById(R.id.toggle37);
        t38.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t38.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t38.setText(number);
                            t38.setTextOff(number);
                            t38.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t39=findViewById(R.id.toggle38);
        t39.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t39.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t39.setText(number);
                            t39.setTextOff(number);
                            t39.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        /*t40=findViewById(R.id.toggle39);
        t40.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t40.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t40.setText(number);
                            t40.setTextOff(number);
                            t40.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });*/
        t41=findViewById(R.id.toggle40);
        t41.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t41.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t41.setText(number);
                            t41.setTextOff(number);
                            t41.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t42=findViewById(R.id.toggle41);
        t42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t42.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t42.setText(number);
                            t42.setTextOff(number);
                            t42.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t43=findViewById(R.id.toggle42);
        t43.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t43.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t43.setText(number);
                            t43.setTextOff(number);
                            t43.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t44=findViewById(R.id.toggle43);
        t44.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t44.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t44.setText(number);
                            t44.setTextOff(number);
                            t44.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t45=findViewById(R.id.toggle44);
        t45.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t45.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t45.setText(number);
                            t45.setTextOff(number);
                            t45.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t46=findViewById(R.id.toggle45);
        t46.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t46.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t46.setText(number);
                            t46.setTextOff(number);
                            t46.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t47=findViewById(R.id.toggle46);
        t47.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t47.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t47.setText(number);
                            t47.setTextOff(number);
                            t47.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        //t48=findViewById(R.id.toggle47);
        //t49=findViewById(R.id.toggle48);
        t50=findViewById(R.id.toggle49);
        t50.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t50.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t50.setText(number);
                            t50.setTextOff(number);
                            t50.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t51=findViewById(R.id.toggle50);
        t51.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t51.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t51.setText(number);
                            t51.setTextOff(number);
                            t51.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t52=findViewById(R.id.toggle51);
        t52.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t52.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t52.setText(number);
                            t52.setTextOff(number);
                            t52.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t53=findViewById(R.id.toggle52);
        t53.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t53.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t53.setText(number);
                            t53.setTextOff(number);
                            t53.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t54=findViewById(R.id.toggle53);
        t54.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t54.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t54.setText(number);
                            t54.setTextOff(number);
                            t54.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t55=findViewById(R.id.toggle54);
        t55.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t55.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t55.setText(number);
                            t55.setTextOff(number);
                            t55.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t56=findViewById(R.id.toggle55);
        t56.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t56.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t56.setText(number);
                            t56.setTextOff(number);
                            t56.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t57=findViewById(R.id.toggle56);
        t57.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t57.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t57.setText(number);
                            t57.setTextOff(number);
                            t57.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t58=findViewById(R.id.toggle57);
        t58.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t58.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t58.setText(number);
                            t58.setTextOff(number);
                            t58.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t59=findViewById(R.id.toggle58);
        t59.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t59.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t59.setText(number);
                            t59.setTextOff(number);
                            t59.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t60=findViewById(R.id.toggle59);
        t60.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t60.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t60.setText(number);
                            t60.setTextOff(number);
                            t60.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t61=findViewById(R.id.toggle60);
        t61.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t61.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t61.setText(number);
                            t61.setTextOff(number);
                            t61.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t62=findViewById(R.id.toggle61);
        t62.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t62.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t62.setText(number);
                            t62.setTextOff(number);
                            t62.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t63=findViewById(R.id.toggle62);
        t63.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t63.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t63.setText(number);
                            t63.setTextOff(number);
                            t63.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t64=findViewById(R.id.toggle63);
        t64.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t64.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t64.setText(number);
                            t64.setTextOff(number);
                            t64.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t65=findViewById(R.id.toggle64);
        t65.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t65.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t65.setText(number);
                            t65.setTextOff(number);
                            t65.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t66=findViewById(R.id.toggle65);
        t66.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t66.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t66.setText(number);
                            t66.setTextOff(number);
                            t66.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t67=findViewById(R.id.toggle66);
        t67.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t67.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t67.setText(number);
                            t67.setTextOff(number);
                            t67.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t68=findViewById(R.id.toggle67);
        t68.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t68.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t68.setText(number);
                            t68.setTextOff(number);
                            t68.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t69=findViewById(R.id.toggle68);
        t69.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t69.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t69.setText(number);
                            t69.setTextOff(number);
                            t69.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t70=findViewById(R.id.toggle69);
        t70.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t70.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t70.setText(number);
                            t70.setTextOff(number);
                            t70.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t71=findViewById(R.id.toggle70);
        t71.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t71.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t71.setText(number);
                            t71.setTextOff(number);
                            t71.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t72=findViewById(R.id.toggle71);
        t72.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t72.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t72.setText(number);
                            t72.setTextOff(number);
                            t72.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t73=findViewById(R.id.toggle72);
        t73.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t73.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t73.setText(number);
                            t73.setTextOff(number);
                            t73.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t74=findViewById(R.id.toggle73);
        t74.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t74.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t74.setText(number);
                            t74.setTextOff(number);
                            t74.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t75=findViewById(R.id.toggle74);
        t75.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t75.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t75.setText(number);
                            t75.setTextOff(number);
                            t75.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t76=findViewById(R.id.toggle75);
        t76.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t76.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t76.setText(number);
                            t76.setTextOff(number);
                            t76.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t77=findViewById(R.id.toggle76);
        t77.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t77.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t77.setText(number);
                            t77.setTextOff(number);
                            t77.setChecked(false);


                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t78=findViewById(R.id.toggle77);
        t78.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t78.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t78.setText(number);
                            t78.setTextOff(number);
                            t78.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t79=findViewById(R.id.toggle78);
        t79.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t79.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t79.setText(number);
                            t79.setTextOff(number);
                            t79.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t80=findViewById(R.id.toggle79);
        t80.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t80.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t80.setText(number);
                            t80.setTextOff(number);
                            t80.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t81=findViewById(R.id.toggle80);
        t81.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t81.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t81.setText(number);
                            t81.setTextOff(number);
                            t81.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t82=findViewById(R.id.toggle81);
        t82.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t82.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t82.setText(number);
                            t82.setTextOff(number);
                            t82.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t83=findViewById(R.id.toggle82);
        t83.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t83.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t83.setText(number);
                            t83.setTextOff(number);
                            t83.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t84=findViewById(R.id.toggle83);
        t84.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t84.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t84.setText(number);
                            t84.setTextOff(number);
                            t84.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t85=findViewById(R.id.toggle84);
        t85.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t85.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t85.setText(number);
                            t85.setTextOff(number);
                            t85.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t86=findViewById(R.id.toggle85);
        t86.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t86.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t86.setText(number);
                            t86.setTextOff(number);
                            t86.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t87=findViewById(R.id.toggle86);
        t87.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t87.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t87.setText(number);
                            t87.setTextOff(number);
                            t87.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t88=findViewById(R.id.toggle87);
        t88.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t88.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t88.setText(number);
                            t88.setTextOff(number);
                            t88.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t89=findViewById(R.id.toggle88);
        t89.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t89.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t89.setText(number);
                            t89.setTextOff(number);
                            t89.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t90=findViewById(R.id.toggle89);
        t90.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t90.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t90.setText(number);
                            t90.setTextOff(number);
                            t90.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t91=findViewById(R.id.toggle90);
        t91.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t91.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t91.setText(number);
                            t91.setTextOff(number);
                            t91.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t92=findViewById(R.id.toggle91);
        t92.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t92.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t92.setText(number);
                            t92.setTextOff(number);
                            t92.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t93=findViewById(R.id.toggle92);
        t93.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t93.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t93.setText(number);
                            t93.setTextOff(number);
                            t93.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t94=findViewById(R.id.toggle93);
        t94.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t94.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t94.setText(number);
                            t94.setTextOff(number);
                            t94.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t95=findViewById(R.id.toggle94);
        t95.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t95.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t95.setText(number);
                            t95.setTextOff(number);
                            t95.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t96=findViewById(R.id.toggle95);
        t96.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t96.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t96.setText(number);
                            t96.setTextOff(number);
                            t96.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t97=findViewById(R.id.toggle96);
        t97.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t97.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t97.setText(number);
                            t97.setTextOff(number);
                            t97.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t98=findViewById(R.id.toggle97);
        t98.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t98.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t98.setText(number);
                            t98.setTextOff(number);
                            t98.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t99=findViewById(R.id.toggle98);
        t99.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t99.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t99.setText(number);
                            t99.setTextOff(number);
                            t99.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t100=findViewById(R.id.toggle99);
        t100.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t100.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t100.setText(number);
                            t100.setTextOff(number);
                            t100.setChecked(false);

                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t101=findViewById(R.id.toggle100);
        t101.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t101.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t101.setText(number);
                            t101.setTextOff(number);
                            t101.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t102=findViewById(R.id.toggle101);
        t102.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t102.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t102.setText(number);
                            t102.setTextOff(number);
                            t102.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t103=findViewById(R.id.toggle102);
        t103.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t103.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t103.setText(number);
                            t103.setTextOff(number);
                            t103.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t104=findViewById(R.id.toggle103);
        t104.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t104.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t104.setText(number);
                            t104.setTextOff(number);
                            t104.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t105=findViewById(R.id.toggle104);
        t105.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t105.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t105.setText(number);
                            t105.setTextOff(number);
                            t105.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t106=findViewById(R.id.toggle105);
        t106.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t106.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t106.setText(number);
                            t106.setTextOff(number);
                            t106.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t107=findViewById(R.id.toggle106);
        t107.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t107.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t107.setText(number);
                            t107.setTextOff(number);
                            t107.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t108=findViewById(R.id.toggle107);
        t108.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t108.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t108.setText(number);
                            t108.setTextOff(number);
                            t108.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t109=findViewById(R.id.toggle108);
        t109.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t109.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t109.setText(number);
                            t109.setTextOff(number);
                            t109.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t110=findViewById(R.id.toggle109);
        t110.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t110.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t110.setText(number);
                            t110.setTextOff(number);
                            t110.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t111=findViewById(R.id.toggle110);
        t111.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t111.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t111.setText(number);
                            t111.setTextOff(number);
                            t111.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t112=findViewById(R.id.toggle111);
        t112.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t112.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t112.setText(number);
                            t112.setTextOff(number);
                            t112.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t113=findViewById(R.id.toggle112);
        t113.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t113.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t113.setText(number);
                            t113.setTextOff(number);
                            t113.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t114=findViewById(R.id.toggle113);
        t114.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t114.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t114.setText(number);
                            t114.setTextOff(number);
                            t114.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t115=findViewById(R.id.toggle114);
        t115.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t115.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t115.setText(number);
                            t115.setTextOff(number);
                            t115.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t116=findViewById(R.id.toggle115);
        t116.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t116.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t116.setText(number);
                            t116.setTextOff(number);
                            t116.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t117=findViewById(R.id.toggle116);
        t117.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t117.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t117.setText(number);
                            t117.setTextOff(number);
                            t117.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t118=findViewById(R.id.toggle117);
        t118.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t118.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t118.setText(number);
                            t118.setTextOff(number);
                            t118.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        t119=findViewById(R.id.toggle118);
        t119.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(t119.isChecked())
                {
                    l1.setVisibility(View.VISIBLE);
                    l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton rb =findViewById(i);
                            String number=rb.getText().toString();
                            t119.setText(number);
                            t119.setTextOff(number);
                            t119.setChecked(false);
                        }
                    });
                }
                else
                {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, mTextView.getText().toString(), Toast.LENGTH_SHORT).show();
                if(t1.getTextOff().toString().equals("A")&&t2.getTextOff().toString().equals("D")&&t3.getTextOff().toString().equals("O")&&t4.getTextOff().toString().equals("B")&&t5.getTextOff().toString().equals("E")&&t6.getTextOff().toString().equals("A")&&t7.getTextOff().toString().equals("C")&&t8.getTextOff().toString().equals("R")&&t9.getTextOff().toString().equals("O")&&t10.getTextOff().toString().equals("B")&&t11.getTextOff().toString().equals("A")&&t12.getTextOff().toString().equals("T")&&t13.getTextOff().toString().equals("R")&&t14.getTextOff().toString().equals("E")&&t15.getTextOff().toString().equals("A")&&t16.getTextOff().toString().equals("D")&&t17.getTextOff().toString().equals("E")&&t18.getTextOff().toString().equals("R")&&t19.getTextOff().toString().equals("D")&&t20.getTextOff().toString().equals("C"))
                {
                    questions[1]=true;
                }
                if(t13.getTextOff().toString().equals("R")&&t21.getTextOff().toString().equals("O")&&t22.getTextOff().toString().equals("B")&&t23.getTextOff().toString().equals("E")&&t24.getTextOff().toString().equals("R")&&t25.getTextOff().toString().equals("T")&&t26.getTextOff().toString().equals("E")&&t27.getTextOff().toString().equals("L")&&t28.getTextOff().toString().equals("L")&&t29.getTextOff().toString().equals("I")&&t30.getTextOff().toString().equals("O")&&t31.getTextOff().toString().equals("T")&&t32.getTextOff().toString().equals("K")&&t33.getTextOff().toString().equals("A")&&t34.getTextOff().toString().equals("H")&&t35.getTextOff().toString().equals("N"))
                {
                    questions[2]=true;
                }
                if(t36.getTextOff().toString().equals("C")&&t39.getTextOff().toString().equals("L")&&t56.getTextOff().toString().equals("I")&&t68.getTextOff().toString().equals("P")&&t70.getTextOff().toString().equals("B")&&t80.getTextOff().toString().equals("O")&&t92.getTextOff().toString().equals("A")&&t97.getTextOff().toString().equals("R")&&t98.getTextOff().toString().equals("D"))
                {
                    questions[3]=true;
                }
                if(t37.getTextOff().toString().equals("R")&&t51.getTextOff().toString().equals("A")&&t66.getTextOff().toString().equals("M")&&t75.getTextOff().toString().equals("A")&&t77.getTextOff().toString().equals("C"))
                {
                    questions[4]=true;
                }
                if(t38.getTextOff().toString().equals("D")&&t54.getTextOff().toString().equals("E")&&t67.getTextOff().toString().equals("S")&&t69.getTextOff().toString().equals("K")&&t78.getTextOff().toString().equals("T")&&t84.getTextOff().toString().equals("O")&&t100.getTextOff().toString().equals("P"))
                {
                    questions[5]=true;
                }
                if(t23.getTextOff().toString().equals("E")&&t41.getTextOff().toString().equals("X")&&t42.getTextOff().toString().equals("T")&&t43.getTextOff().toString().equals("R")&&t44.getTextOff().toString().equals("A")&&t45.getTextOff().toString().equals("N")&&t46.getTextOff().toString().equals("E")&&t47.getTextOff().toString().equals("T"))
                {
                    questions[6]=true;
                }
                if(t50.getTextOff().toString().equals("H")&&t51.getTextOff().toString().equals("A")&&t52.getTextOff().toString().equals("C")&&t53.getTextOff().toString().equals("K")&&t54.getTextOff().toString().equals("E")&&t55.getTextOff().toString().equals("R"))
                {
                    questions[7]=true;
                }
                if(t25.getTextOff().toString().equals("T")&&t57.getTextOff().toString().equals("Y")&&t58.getTextOff().toString().equals("P")&&t59.getTextOff().toString().equals("E")&&t60.getTextOff().toString().equals("W")&&t61.getTextOff().toString().equals("R")&&t62.getTextOff().toString().equals("I")&&t63.getTextOff().toString().equals("T")&&t64.getTextOff().toString().equals("E")&&t65.getTextOff().toString().equals("R"))
                {
                    questions[8]=true;
                }
                if(t60.getTextOff().toString().equals("W")&&t71.getTextOff().toString().equals("Y")&&t81.getTextOff().toString().equals("S")&&t95.getTextOff().toString().equals("I")&&t101.getTextOff().toString().equals("W")&&t102.getTextOff().toString().equals("Y")&&t103.getTextOff().toString().equals("G"))
                {
                    questions[9]=true;
                }
                if(t63.getTextOff().toString().equals("T")&&t72.getTextOff().toString().equals("W")&&t82.getTextOff().toString().equals("E")&&t96.getTextOff().toString().equals("E")&&t104.getTextOff().toString().equals("T")&&t105.getTextOff().toString().equals("S"))
                {
                    questions[10]=true;
                }
                if(t73.getTextOff().toString().equals("S")&&t74.getTextOff().toString().equals("P")&&t75.getTextOff().toString().equals("A")&&t76.getTextOff().toString().equals("M"))
                {
                    questions[11]=true;
                }
                if(t79.getTextOff().toString().equals("R")&&t89.getTextOff().toString().equals("S")&&t99.getTextOff().toString().equals("I"))
                {
                    questions[12]=true;
                }
                if(t83.getTextOff().toString().equals("N")&&t84.getTextOff().toString().equals("O")&&t85.getTextOff().toString().equals("N")&&t86.getTextOff().toString().equals("C")&&t87.getTextOff().toString().equals("O")&&t88.getTextOff().toString().equals("N")&&t89.getTextOff().toString().equals("S")&&t90.getTextOff().toString().equals("U")&&t91.getTextOff().toString().equals("M")&&t92.getTextOff().toString().equals("A")&&t93.getTextOff().toString().equals("B")&&t28.getTextOff().toString().equals("L")&&t94.getTextOff().toString().equals("E"))
                {
                    questions[13]=true;
                }
                if(t112.getTextOff().toString().equals("S")&&t113.getTextOff().toString().equals("O")&&t114.getTextOff().toString().equals("U")&&t115.getTextOff().toString().equals("N")&&t116.getTextOff().toString().equals("D")&&t117.getTextOff().toString().equals("C")&&t33.getTextOff().toString().equals("A")&&t118.getTextOff().toString().equals("R")&&t119.getTextOff().toString().equals("D"))
                {
                    questions[14]=true;
                }
                if(t107.getTextOff().toString().equals("S")&&t108.getTextOff().toString().equals("U")&&t109.getTextOff().toString().equals("R")&&t110.getTextOff().toString().equals("F")&&t111.getTextOff().toString().equals("I")&&t35.getTextOff().toString().equals("N")&&t105.getTextOff().toString().equals("G"))
                {
                    questions[15]=true;
                }
                Intent i=new Intent(MainActivity.this,result.class);
                i.putExtra("result",questions);
                startActivity(i);
            }
        });
        }

    }

