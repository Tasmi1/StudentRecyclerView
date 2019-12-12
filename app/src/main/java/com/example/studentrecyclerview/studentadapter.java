package com.example.studentrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class studentadapter extends RecyclerView.Adapter<studentadapter.StudentViewHolder> {

    Context mContext;
    List<students> studentsList;

    public studentadapter(Context mContext, List<students> studentsList) {
        this.mContext = mContext;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_layout, parent, false);

        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, final int position) {
        students Students = studentsList.get(position);
        holder.txtname.setText(Students.getName());
        holder.txtage.setText(Integer.toString(Students.getAge()));
        holder.txtaddress.setText(Students.getAddress());
        holder.txtgender.setText(Students.getGender());
        holder.imggender.setImageResource(Students.getImggender());
        holder.imgdustbin.setImageResource(Students.getImgdustbin());


        // set clicklistener for removing records

        holder.imgdustbin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentsList.remove(position);
                notifyItemRemoved(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }


    public class StudentViewHolder extends RecyclerView.ViewHolder {

        ImageView imggender;
        TextView txtname, txtage, txtaddress, txtgender;
        ImageButton imgdustbin;


        public StudentViewHolder(@NonNull View itemView) {

            super(itemView);
            imggender = itemView.findViewById(R.id.imggender);
            txtname = itemView.findViewById(R.id.txtname);
            txtage = itemView.findViewById(R.id.txtage);
            txtaddress = itemView.findViewById(R.id.txtaddress);
            txtgender = itemView.findViewById(R.id.txtgender);
            imgdustbin = itemView.findViewById(R.id.imgdustbin);


        }

    }


}
