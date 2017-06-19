package com.example.waailsaleh.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt ;
    double accumulator ;
    boolean dotted = false;
    char op ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.screen);
    }
public void Settings(View view){
    txt.setBackgroundColor(99999);
}


    /*
    public double getAcc(){
          return accumulator;
      }
      public boolean getdot(){
          return dotted;
      }
      public char getop()
      {
          return op;
      }
      public void newOrder(View view) {
          startActivity(new Intent(getApplicationContext(), MainActivity.class));
      }
      */
    public void zero(View view){




        txt.append("0");

    }
    public void one(View view){




        txt.append("1");

    }
    public void two(View view){




        txt.append("2");
    }



    public void three(View view){




        txt.append("3");
    }



    public void four(View view) {



        txt.append("4");
    }



    public void five(View view){




        txt.append("5");
    }


    public void six(View view){




        txt.append("6");
    }
    public void seven(View view){




        txt.append("7");
    }
    public void eight(View view){




        txt.append("8");
    }
    public void nine(View view){




        txt.append("9");
    }
    public void dot(View view){



        if(!(txt.getText().toString().contains("."))) {
            txt.append(".");
            dotted = true;
        }
        else
        {
            Toast.makeText(MainActivity.this, "This Number is Already A Double!",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void add (View view){
        accumulator = Double.parseDouble(txt.getText().toString());
        op='+';
        txt.setText("");
    }
    public void minus (View view){
        accumulator = Double.parseDouble(txt.getText().toString());
        op='-';
        txt.setText("");
    }
    public void mult (View view){
        accumulator = Double.parseDouble(txt.getText().toString());
        op='*';
        txt.setText("");
    }
    public void div (View view){
        accumulator = Double.parseDouble(txt.getText().toString());
        op='/';
        txt.setText("");
    }
    public void mod (View view){
        accumulator = Double.parseDouble(txt.getText().toString());
        op='%';
        txt.setText("");
    }
    public void pow (View view){
        accumulator = Double.parseDouble(txt.getText().toString());
        op='^';
        txt.setText("");
    }
    public void root (View view){
        accumulator= Math.sqrt(Double.parseDouble(txt.getText().toString()));
        txt.setText(""+accumulator);
    }

    public void equal (View view){
        switch (op) {
            case '+': txt.setText((accumulator + (Double.parseDouble(txt.getText().toString()))+""));
                break;
            case '-': txt.setText((accumulator - (Double.parseDouble(txt.getText().toString()))+""));
                break;
            case '*': txt.setText((accumulator * (Double.parseDouble(txt.getText().toString()))+""));
                break;
            case '/': txt.setText((accumulator / (Double.parseDouble(txt.getText().toString()))+""));
                break;
            case '%': txt.setText((accumulator % (Double.parseDouble(txt.getText().toString()))+""));
                break;
            case '^': txt.setText(Math.pow(accumulator, (Double.parseDouble(txt.getText().toString())))+"");
                break;

        }
        dotted=true;
    }
    public void del(View view){
        if ((txt.getText().length()==1 )) {
            txt.setText(0+"");
        }




           else{
            String x = txt.getText().toString();
            x = x.substring(0,x.length()-1);
            txt.setText(x+"");
           }
    }
}

