package com.kjq.common.ui.designs.popMenu;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseViewHolder<Model extends PopMenuModel> extends RecyclerView.ViewHolder {
    private View mItemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mItemView = itemView;
    }

    protected abstract void notifyData(Model model);

    public View getItemView() {
        return mItemView;
    }
}
