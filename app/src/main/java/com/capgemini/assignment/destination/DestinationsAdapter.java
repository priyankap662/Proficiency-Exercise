package com.capgemini.assignment.destination;


import android.content.Context;

import com.capgemini.assignment.R;
import com.capgemini.assignment.common.OnListClick;
import com.capgemini.assignment.common.RecyclerListAdapter;
import com.capgemini.assignment.common.RecyclerViewHolder;
import com.capgemini.assignment.databinding.DestinationListItemBinding;
import com.capgemini.assignment.models.Rows;
import com.capgemini.assignment.utils.RandomColor;

import java.util.List;


public class DestinationsAdapter extends RecyclerListAdapter<Rows, DestinationListItemBinding, RecyclerViewHolder> {

    private RandomColor randomColor;

    DestinationsAdapter(Context context, List<Rows> list, OnListClick<Rows> onClickListener) {
        super(context, list, onClickListener);
        randomColor = new RandomColor();
    }

    @Override
    protected int layoutId() {
        return R.layout.destination_list_item;
    }

    @Override
    protected void bindData(DestinationListItemBinding binding, Rows row) {
        binding.image.setImageDrawable(randomColor.getRandomLazyLoadingColor());
        binding.setItem(row);
    }
}