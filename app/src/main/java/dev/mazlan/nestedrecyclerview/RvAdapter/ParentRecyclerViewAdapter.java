package dev.mazlan.nestedrecyclerview.RvAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.mazlan.nestedrecyclerview.R;
import dev.mazlan.nestedrecyclerview.model.ChildModel;
import dev.mazlan.nestedrecyclerview.model.ParentModel;

public class ParentRecyclerViewAdapter extends RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder> {
    private ArrayList<ParentModel> parentModelArrayList;
    public Context cxt;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView category;
        public RecyclerView childRecyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);

            category = itemView.findViewById(R.id.Movie_category);
            childRecyclerView = itemView.findViewById(R.id.Child_RV);
        }
    }

    public ParentRecyclerViewAdapter(ArrayList<ParentModel> exampleList, Context context) {
        this.parentModelArrayList = exampleList;
        this.cxt = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return parentModelArrayList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ParentModel currentItem = parentModelArrayList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false);
        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.category.setText(currentItem.movieCategory());
        ArrayList<ChildModel> arrayList = new ArrayList<>();

        // added the first child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category1")) {
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
        }

        // added in second child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category2")) {
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
        }

        // added in third child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category3")) {
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
        }

        // added in fourth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category4")) {
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
        }

        // added in fifth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category5")) {
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
        }

        // added in sixth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Category6")) {
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel( R.drawable.banner,"Movie Name"));
            arrayList.add(new ChildModel(R.drawable.banner,"Movie Name"));
        }

        ChildRecyclerViewAdapter childRecyclerViewAdapter = new ChildRecyclerViewAdapter(arrayList,holder.childRecyclerView.getContext());
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }
}