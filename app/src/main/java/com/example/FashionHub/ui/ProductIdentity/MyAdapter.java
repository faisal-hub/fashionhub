package com.example.FashionHub.ui.ProductIdentity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.FashionHub.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewhHolder> {
    private List<Product> datalist;
    private MyAdapterItemClickListener listener;


    public MyAdapter(List<Product> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public ViewhHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.activity_product_identity,parent,false);
       ViewhHolder holder=new ViewhHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewhHolder holder, final int position) {
        int id=datalist.get(position).getProduct_id();
        String name=datalist.get(position).getProduct_name();
        String category = datalist.get(position).getProduct_category();
        String description = datalist.get(position).getProduct_description();
        int price = datalist.get(position).getProduct_price();
       // holder.product_category.setText(""+datalist.get(position).getProduct_category());
       // holder.product_description.setText(""+datalist.get(position).getProduct_description());
       // holder.product_price.setText(""+datalist.get(position).getProduct_price());
        holder.cardViewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener!=null)
                {
                    listener.onItemClick(datalist.get(position),position);


                }
            }
        });
        holder.cardViewLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                listener.onItemLongClick(datalist.get(position),position);
                return false;
            }
        });


    }


    @Override
    public int getItemCount() {
        return datalist.size();
    }
    public void setListener(MyAdapterItemClickListener listener) {
        this.listener = listener;
    }

    public interface MyAdapterItemClickListener {
        void onItemClick(Product product, int position);
        public void onItemLongClick(Product item,int position);
    }

    public static class ViewhHolder extends RecyclerView.ViewHolder{

        private TextView product_id;
        private TextView product_name;
        private TextView product_category;
        private TextView product_description;
        private TextView product_price;
        private CardView cardViewLayout;

        public ViewhHolder(@NonNull View itemView) {
            super(itemView);
            product_id = itemView.findViewById(R.id.pro_id);
            product_name = itemView.findViewById(R.id.pro_name);
            product_category = itemView.findViewById(R.id.pro_category);
            product_description = itemView.findViewById(R.id.pro_description);
            product_price = itemView.findViewById(R.id.pro_price);
            cardViewLayout = itemView.findViewById(R.id.cardview);
        }
    }
}
