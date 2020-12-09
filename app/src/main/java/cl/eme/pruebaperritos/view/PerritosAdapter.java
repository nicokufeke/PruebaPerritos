package cl.eme.pruebaperritos.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.eme.pruebaperritos.R;

public class PerritosAdapter extends RecyclerView.Adapter<PerritosAdapter.PerritosVH> {


private final List<String> perritos;

    public PerritosAdapter(List<String> perritos) {
        this.perritos = perritos;
    }


    @NonNull
    @Override
    public PerritosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_perritos, parent, false);
        return new PerritosVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PerritosVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return perritos.size();
    }

    public class PerritosVH extends RecyclerView.ViewHolder {
        public PerritosVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
