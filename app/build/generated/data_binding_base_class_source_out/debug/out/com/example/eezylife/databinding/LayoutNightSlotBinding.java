// Generated by data binding compiler. Do not edit!
package com.example.eezylife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.eezylife.R;
import com.example.eezylife.viewmodel.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutNightSlotBinding extends ViewDataBinding {
  @Bindable
  protected String mSlotName;

  @Bindable
  protected String mSlotTemp;

  @Bindable
  protected MainViewModel mViewModel;

  protected LayoutNightSlotBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setSlotName(@Nullable String slotName);

  @Nullable
  public String getSlotName() {
    return mSlotName;
  }

  public abstract void setSlotTemp(@Nullable String slotTemp);

  @Nullable
  public String getSlotTemp() {
    return mSlotTemp;
  }

  public abstract void setViewModel(@Nullable MainViewModel viewModel);

  @Nullable
  public MainViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static LayoutNightSlotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_night_slot, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutNightSlotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutNightSlotBinding>inflateInternal(inflater, R.layout.layout_night_slot, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutNightSlotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_night_slot, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutNightSlotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutNightSlotBinding>inflateInternal(inflater, R.layout.layout_night_slot, null, false, component);
  }

  public static LayoutNightSlotBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutNightSlotBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutNightSlotBinding)bind(component, view, R.layout.layout_night_slot);
  }
}
