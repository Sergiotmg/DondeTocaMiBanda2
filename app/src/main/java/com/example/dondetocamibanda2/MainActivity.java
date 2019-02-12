package com.example.dondetocamibanda2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements Controller.ServerResponse{
    private RecyclerView recyclerView;
    private EventAdpater eventAdapter;
    private TextView txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller=new Controller(this);
        controller.start();
        eventAdapter= new EventAdpater(this);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setAdapter(eventAdapter);

        LinearLayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        txtTitle=findViewById(R.id.txtTitle);


    }



    @Override
    public void onResponse(EventData eventData) {
        //eventAdapter.setData(eventData.getVenueData());
        //txtTitle.setText();

    }

    @Override
    public void onResponseFailed(String response) {
        Toast.makeText(this,response,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
