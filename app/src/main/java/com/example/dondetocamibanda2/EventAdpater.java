package com.example.dondetocamibanda2;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class EventAdpater extends RecyclerView.Adapter<EventAdpater.EventViewHolder> {
    private List<EventData> datosEvento;
    private  List<VenueData> datosLocal;
    private  List<ArtistData> datosArtista;
    private List<Definitions> definitions;
    private Bandsintown bandsintown;
    private LayoutInflater mInflater;
    private Context context;
    // constructor
    public EventAdpater(Context context) {//context no se deberia
        mInflater = LayoutInflater.from(context);// si hay 20 creara 20
        //this.datosLocal = local;
        //this.datosEvento = evento;
        this.context=context;//no necesaria ,podemos eliminar arriva private Context context
    }

    class EventViewHolder extends  RecyclerView.ViewHolder {
        public final TextView txtDate;
        public final TextView txtCountry;
        public final TextView txtCity;
        public final TextView txtVenue;


        public EventViewHolder( View itemView) {
            super(itemView);
            txtCity=itemView.findViewById(R.id.txtCity);
            txtCountry=itemView.findViewById(R.id.txtCountry);
            txtDate=itemView.findViewById(R.id.txtDate);
            txtVenue=itemView.findViewById(R.id.txtVenue);
        }
    }


    @NonNull
    @Override
    public EventAdpater.EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mItemView=mInflater.inflate(R.layout.event_item,viewGroup,false);
        return new EventViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        EventData currentE=datosEvento.get(position);
        VenueData currentV=datosLocal.get(position);

        holder.txtDate.setText(currentE.getDatetime());

        holder.txtVenue.setText(currentV.getName());
        holder.txtCountry.setText(currentV.getCountry());
        holder.txtCity.setText(currentV.getCity());


    }

    @Override
    public int getItemCount() {
        if(datosLocal==null) return 0;
        return datosEvento.size();
    }

    public  void setData(List<VenueData> newList2,List<EventData> newList,List<Definitions> newList4,List<ArtistData> newList3){
        datosEvento=newList;//la de aqui es la que le acabamos de pasar
        datosLocal=newList2;//l
        datosArtista=newList3;//l
        definitions=newList4;//l
        //para avisar de que hemos cmabiado nuestros datos
        // notificar que nuestro set de datos ha cambiado
        notifyDataSetChanged();
    }


}
