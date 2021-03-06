package com.kjq.common.base.mvvm.base;


import androidx.annotation.NonNull;

/**
 * Create Author：kjq
 * Create Date：2019/01/25
 * Description：多布局ItemViewModel是封装
 */

public class MultiItemViewModel<VM extends BaseViewModel> extends BaseItemViewModel<VM> {
    protected Object multiType;

    public Object getItemType() {
        return multiType;
    }

    public void multiItemType(@NonNull Object multiType) {
        this.multiType = multiType;
    }

    public MultiItemViewModel(@NonNull VM viewModel) {
        super(viewModel);
    }
}
