package com.example.relaks.braslet;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Braslet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_braslet);
        //-------------------------
        GraphView graph = (GraphView) findViewById(R.id.view);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);


        //---------------------------
        mHelloTextView=(TextView)findViewById(R.id.textView2);
     //  mgraph =(GraphicalView)findViewById(R.id.view);
        mText=(EditText)findViewById(R.id.editText);
    //   mgraph.isInEditMode();
    //    Intent mgraph = buildIntent();
     //  startActivity(mgraph);

    }
    private TextView mHelloTextView;
    private EditText mText;
    int i=0;
    public void onClick(View view)
    {
      //  mHelloTextView=(TextView)findViewById(R.id.textView2);
       // mHelloTextView.setText("Hi Bomj!");
        mHelloTextView.setText(mText.getText());
        i++;

       // mHelloTextView.setText(i);
    }




}
