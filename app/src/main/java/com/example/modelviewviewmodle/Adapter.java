package com.example.modelviewviewmodle;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modelviewviewmodle.databinding.SinglerowdesignBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder>{

    List<Student> slist;

    public Adapter(List<Student> slist) {
        this.slist = slist;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SinglerowdesignBinding binding = SinglerowdesignBinding.inflate(inflater, parent,false);
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Student sCurrent= slist.get(position);
        holder.singlerowdesignBinding.setStudentobject(sCurrent);

    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        SinglerowdesignBinding singlerowdesignBinding;
        public viewHolder(@NonNull SinglerowdesignBinding singlerowdesignBinding) {
            super(singlerowdesignBinding.getRoot());
            this.singlerowdesignBinding = singlerowdesignBinding;
        }
    }

}
