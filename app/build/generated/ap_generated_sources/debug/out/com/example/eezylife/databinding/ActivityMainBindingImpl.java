package com.example.eezylife.databinding;
import com.example.eezylife.R;
import com.example.eezylife.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.eezylife.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(63);
        sIncludes.setIncludes(1, 
            new String[] {"layout_morning_slot", "layout_morning_slot", "layout_morning_slot", "layout_night_slot"},
            new int[] {45, 46, 47, 48},
            new int[] {com.example.eezylife.R.layout.layout_morning_slot,
                com.example.eezylife.R.layout.layout_morning_slot,
                com.example.eezylife.R.layout.layout_morning_slot,
                com.example.eezylife.R.layout.layout_night_slot});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontal, 49);
        sViewsWithIds.put(R.id.topTicket, 50);
        sViewsWithIds.put(R.id.cl_head, 51);
        sViewsWithIds.put(R.id.photo1, 52);
        sViewsWithIds.put(R.id.photo2, 53);
        sViewsWithIds.put(R.id.photo3, 54);
        sViewsWithIds.put(R.id.cl_center, 55);
        sViewsWithIds.put(R.id.accepted, 56);
        sViewsWithIds.put(R.id.declined, 57);
        sViewsWithIds.put(R.id.ticketViewBottom, 58);
        sViewsWithIds.put(R.id.cl_head1, 59);
        sViewsWithIds.put(R.id.accepted_bottom, 60);
        sViewsWithIds.put(R.id.declined_bottom, 61);
        sViewsWithIds.put(R.id.cl_center1, 62);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView10;
    @Nullable
    private final com.example.eezylife.databinding.LayoutMorningSlotBinding mboundView11;
    @Nullable
    private final com.example.eezylife.databinding.LayoutNightSlotBinding mboundView110;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView111;
    @Nullable
    private final com.example.eezylife.databinding.LayoutMorningSlotBinding mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView121;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView13;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView14;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView15;
    @Nullable
    private final com.example.eezylife.databinding.LayoutMorningSlotBinding mboundView16;
    @NonNull
    private final android.widget.LinearLayout mboundView161;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView17;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView18;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView19;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView20;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView21;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView22;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView23;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView24;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView25;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView26;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView27;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView28;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView31;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView32;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView33;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView34;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView38;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView39;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView40;
    @NonNull
    private final android.widget.LinearLayout mboundView41;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView42;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView43;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView44;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 63, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 30
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.LinearLayout) bindings[56]
            , (android.widget.LinearLayout) bindings[60]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[37]
            , (android.widget.LinearLayout) bindings[55]
            , (android.widget.LinearLayout) bindings[62]
            , (android.widget.LinearLayout) bindings[51]
            , (android.widget.LinearLayout) bindings[59]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[57]
            , (android.widget.LinearLayout) bindings[61]
            , (com.hedyhidoury.calendar.horizontallibrary.HorizontalCalendarView) bindings[49]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[52]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[53]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[54]
            , (android.widget.LinearLayout) bindings[0]
            , (com.mreram.ticketview.TicketView) bindings[58]
            , (com.mreram.ticketview.TicketView) bindings[50]
            );
        this.accept.setTag(null);
        this.acceptBottom.setTag(null);
        this.authorName.setTag(null);
        this.decline.setTag(null);
        this.declineBottom.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (androidx.appcompat.widget.AppCompatTextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (com.example.eezylife.databinding.LayoutMorningSlotBinding) bindings[45];
        setContainedBinding(this.mboundView11);
        this.mboundView110 = (com.example.eezylife.databinding.LayoutNightSlotBinding) bindings[48];
        setContainedBinding(this.mboundView110);
        this.mboundView111 = (androidx.appcompat.widget.AppCompatImageView) bindings[11];
        this.mboundView111.setTag(null);
        this.mboundView12 = (com.example.eezylife.databinding.LayoutMorningSlotBinding) bindings[46];
        setContainedBinding(this.mboundView12);
        this.mboundView121 = (android.widget.LinearLayout) bindings[12];
        this.mboundView121.setTag(null);
        this.mboundView13 = (androidx.appcompat.widget.AppCompatTextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (androidx.appcompat.widget.AppCompatTextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (androidx.appcompat.widget.AppCompatImageView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (com.example.eezylife.databinding.LayoutMorningSlotBinding) bindings[47];
        setContainedBinding(this.mboundView16);
        this.mboundView161 = (android.widget.LinearLayout) bindings[16];
        this.mboundView161.setTag(null);
        this.mboundView17 = (androidx.appcompat.widget.AppCompatTextView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (androidx.appcompat.widget.AppCompatTextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (androidx.appcompat.widget.AppCompatImageView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.LinearLayout) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (androidx.appcompat.widget.AppCompatTextView) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView22 = (androidx.appcompat.widget.AppCompatTextView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView23 = (androidx.appcompat.widget.AppCompatImageView) bindings[23];
        this.mboundView23.setTag(null);
        this.mboundView24 = (androidx.appcompat.widget.AppCompatTextView) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView25 = (androidx.appcompat.widget.AppCompatTextView) bindings[25];
        this.mboundView25.setTag(null);
        this.mboundView26 = (androidx.appcompat.widget.AppCompatTextView) bindings[26];
        this.mboundView26.setTag(null);
        this.mboundView27 = (androidx.appcompat.widget.AppCompatTextView) bindings[27];
        this.mboundView27.setTag(null);
        this.mboundView28 = (androidx.appcompat.widget.AppCompatTextView) bindings[28];
        this.mboundView28.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (androidx.appcompat.widget.AppCompatTextView) bindings[31];
        this.mboundView31.setTag(null);
        this.mboundView32 = (androidx.appcompat.widget.AppCompatTextView) bindings[32];
        this.mboundView32.setTag(null);
        this.mboundView33 = (androidx.appcompat.widget.AppCompatTextView) bindings[33];
        this.mboundView33.setTag(null);
        this.mboundView34 = (androidx.appcompat.widget.AppCompatTextView) bindings[34];
        this.mboundView34.setTag(null);
        this.mboundView38 = (androidx.appcompat.widget.AppCompatTextView) bindings[38];
        this.mboundView38.setTag(null);
        this.mboundView39 = (androidx.appcompat.widget.AppCompatTextView) bindings[39];
        this.mboundView39.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView40 = (androidx.appcompat.widget.AppCompatTextView) bindings[40];
        this.mboundView40.setTag(null);
        this.mboundView41 = (android.widget.LinearLayout) bindings[41];
        this.mboundView41.setTag(null);
        this.mboundView42 = (androidx.appcompat.widget.AppCompatTextView) bindings[42];
        this.mboundView42.setTag(null);
        this.mboundView43 = (androidx.appcompat.widget.AppCompatTextView) bindings[43];
        this.mboundView43.setTag(null);
        this.mboundView44 = (androidx.appcompat.widget.AppCompatImageView) bindings[44];
        this.mboundView44.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatTextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatTextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (androidx.appcompat.widget.AppCompatTextView) bindings[9];
        this.mboundView9.setTag(null);
        this.root.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.eezylife.generated.callback.OnClickListener(this, 2);
        mCallback9 = new com.example.eezylife.generated.callback.OnClickListener(this, 9);
        mCallback1 = new com.example.eezylife.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.example.eezylife.generated.callback.OnClickListener(this, 8);
        mCallback7 = new com.example.eezylife.generated.callback.OnClickListener(this, 7);
        mCallback6 = new com.example.eezylife.generated.callback.OnClickListener(this, 6);
        mCallback5 = new com.example.eezylife.generated.callback.OnClickListener(this, 5);
        mCallback4 = new com.example.eezylife.generated.callback.OnClickListener(this, 4);
        mCallback10 = new com.example.eezylife.generated.callback.OnClickListener(this, 10);
        mCallback3 = new com.example.eezylife.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000000L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView16.invalidateAll();
        mboundView110.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        if (mboundView16.hasPendingBindings()) {
            return true;
        }
        if (mboundView110.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.eezylife.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.eezylife.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40000000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView16.setLifecycleOwner(lifecycleOwner);
        mboundView110.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelNoon((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelSelectedDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelEveningTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelComment((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelRestaurantAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelRestaurantName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelRestaurantTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelNight((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelRestaurantItem((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelNoonTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelHostName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModelCommentTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeViewModelCityName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeViewModelMorningTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 14 :
                return onChangeViewModelBarName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeViewModelBarItem((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 16 :
                return onChangeViewModelCommentCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 17 :
                return onChangeViewModelAfterNoonSlotVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 18 :
                return onChangeViewModelEveningSlotVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 19 :
                return onChangeViewModelNightTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 20 :
                return onChangeViewModelNightSlotVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 21 :
                return onChangeViewModelMorningSlotVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 22 :
                return onChangeViewModelMorning((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 23 :
                return onChangeViewModelAfterNoonTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 24 :
                return onChangeViewModelNoonSlotVisible((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 25 :
                return onChangeViewModelAfterNoon((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 26 :
                return onChangeViewModelEvening((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 27 :
                return onChangeViewModelBarAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 28 :
                return onChangeViewModelBarTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 29 :
                return onChangeViewModelCommentAuthor((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelNoon(androidx.databinding.ObservableField<java.lang.String> ViewModelNoon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedDate(androidx.databinding.ObservableField<java.lang.String> ViewModelSelectedDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEveningTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelEveningTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelComment(androidx.databinding.ObservableField<java.lang.String> ViewModelComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantAddress(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantName(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantTime(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNight(androidx.databinding.ObservableField<java.lang.String> ViewModelNight, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantItem(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNoonTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelNoonTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHostName(androidx.databinding.ObservableField<java.lang.String> ViewModelHostName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCommentTime(androidx.databinding.ObservableField<java.lang.String> ViewModelCommentTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCityName(androidx.databinding.ObservableField<java.lang.String> ViewModelCityName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMorningTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelMorningTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarName(androidx.databinding.ObservableField<java.lang.String> ViewModelBarName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarItem(androidx.databinding.ObservableField<java.lang.String> ViewModelBarItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCommentCount(androidx.databinding.ObservableField<java.lang.String> ViewModelCommentCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAfterNoonSlotVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelAfterNoonSlotVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEveningSlotVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelEveningSlotVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNightTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelNightTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNightSlotVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelNightSlotVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMorningSlotVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelMorningSlotVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMorning(androidx.databinding.ObservableField<java.lang.String> ViewModelMorning, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAfterNoonTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelAfterNoonTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNoonSlotVisible(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelNoonSlotVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAfterNoon(androidx.databinding.ObservableField<java.lang.String> ViewModelAfterNoon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEvening(androidx.databinding.ObservableField<java.lang.String> ViewModelEvening, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarAddress(androidx.databinding.ObservableField<java.lang.String> ViewModelBarAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarTime(androidx.databinding.ObservableField<java.lang.String> ViewModelBarTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCommentAuthor(androidx.databinding.ObservableField<java.lang.String> ViewModelCommentAuthor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelCommentGet = null;
        java.lang.String viewModelAfterNoonTempGet = null;
        java.lang.String viewModelCommentTimeGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelNoon = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelSelectedDate = null;
        java.lang.Boolean viewModelEveningSlotVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEveningTemp = null;
        java.lang.Boolean viewModelNoonSlotVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelComment = null;
        java.lang.String viewModelAfterNoonGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantAddress = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantName = null;
        java.lang.String viewModelCommentCountGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantTime = null;
        java.lang.String viewModelEveningGet = null;
        java.lang.String viewModelRestaurantNameGet = null;
        java.lang.String viewModelBarNameGet = null;
        java.lang.Boolean viewModelMorningSlotVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelNight = null;
        java.lang.Boolean viewModelAfterNoonSlotVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantItem = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelNoonTemp = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelHostName = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCommentTime = null;
        java.lang.String viewModelRestaurantItemGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCityName = null;
        int viewModelNightSlotVisibleViewVISIBLEViewGONE = 0;
        int viewModelEveningSlotVisibleViewGONEViewVISIBLE = 0;
        java.lang.String viewModelNightGet = null;
        int viewModelAfterNoonSlotVisibleViewGONEViewVISIBLE = 0;
        java.lang.String viewModelBarItemGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelMorningSlotVisibleGet = false;
        java.lang.String viewModelCommentAuthorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelMorningTemp = null;
        java.lang.String viewModelSelectedDateGet = null;
        int viewModelMorningSlotVisibleViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarName = null;
        java.lang.String viewModelHostNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarItem = null;
        java.lang.Boolean viewModelNightSlotVisibleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCommentCount = null;
        java.lang.String viewModelEveningTempGet = null;
        java.lang.String viewModelMorningTempGet = null;
        int viewModelMorningSlotVisibleViewVISIBLEViewGONE = 0;
        int viewModelNoonSlotVisibleViewVISIBLEViewGONE = 0;
        java.lang.String viewModelCityNameGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelAfterNoonSlotVisible = null;
        int viewModelNoonSlotVisibleViewGONEViewVISIBLE = 0;
        java.lang.String viewModelNoonGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelEveningSlotVisible = null;
        java.lang.String viewModelBarAddressGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelNightTemp = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelNightSlotVisible = null;
        int viewModelEveningSlotVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelMorningSlotVisible = null;
        java.lang.String viewModelRestaurantTimeGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelNoonSlotVisibleGet = false;
        java.lang.String viewModelNightTempGet = null;
        java.lang.String viewModelNoonTempGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelEveningSlotVisibleGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelMorning = null;
        java.lang.String viewModelRestaurantAddressGet = null;
        int viewModelAfterNoonSlotVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelAfterNoonTemp = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelNightSlotVisibleGet = false;
        java.lang.String viewModelMorningGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelNoonSlotVisible = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAfterNoon = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAfterNoonSlotVisibleGet = false;
        java.lang.String viewModelBarTimeGet = null;
        int viewModelNightSlotVisibleViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelEvening = null;
        com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarAddress = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarTime = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCommentAuthor = null;

        if ((dirtyFlags & 0xffffffffL) != 0) {


            if ((dirtyFlags & 0xc0000001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.noon
                        viewModelNoon = viewModel.getNoon();
                    }
                    updateRegistration(0, viewModelNoon);


                    if (viewModelNoon != null) {
                        // read viewModel.noon.get()
                        viewModelNoonGet = viewModelNoon.get();
                    }
            }
            if ((dirtyFlags & 0xc0000002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedDate
                        viewModelSelectedDate = viewModel.getSelectedDate();
                    }
                    updateRegistration(1, viewModelSelectedDate);


                    if (viewModelSelectedDate != null) {
                        // read viewModel.selectedDate.get()
                        viewModelSelectedDateGet = viewModelSelectedDate.get();
                    }
            }
            if ((dirtyFlags & 0xc0000004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eveningTemp
                        viewModelEveningTemp = viewModel.getEveningTemp();
                    }
                    updateRegistration(2, viewModelEveningTemp);


                    if (viewModelEveningTemp != null) {
                        // read viewModel.eveningTemp.get()
                        viewModelEveningTempGet = viewModelEveningTemp.get();
                    }
            }
            if ((dirtyFlags & 0xc0000008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.comment
                        viewModelComment = viewModel.getComment();
                    }
                    updateRegistration(3, viewModelComment);


                    if (viewModelComment != null) {
                        // read viewModel.comment.get()
                        viewModelCommentGet = viewModelComment.get();
                    }
            }
            if ((dirtyFlags & 0xc0000010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantAddress
                        viewModelRestaurantAddress = viewModel.getRestaurantAddress();
                    }
                    updateRegistration(4, viewModelRestaurantAddress);


                    if (viewModelRestaurantAddress != null) {
                        // read viewModel.restaurantAddress.get()
                        viewModelRestaurantAddressGet = viewModelRestaurantAddress.get();
                    }
            }
            if ((dirtyFlags & 0xc0000020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantName
                        viewModelRestaurantName = viewModel.getRestaurantName();
                    }
                    updateRegistration(5, viewModelRestaurantName);


                    if (viewModelRestaurantName != null) {
                        // read viewModel.restaurantName.get()
                        viewModelRestaurantNameGet = viewModelRestaurantName.get();
                    }
            }
            if ((dirtyFlags & 0xc0000040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantTime
                        viewModelRestaurantTime = viewModel.getRestaurantTime();
                    }
                    updateRegistration(6, viewModelRestaurantTime);


                    if (viewModelRestaurantTime != null) {
                        // read viewModel.restaurantTime.get()
                        viewModelRestaurantTimeGet = viewModelRestaurantTime.get();
                    }
            }
            if ((dirtyFlags & 0xc0000080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.night
                        viewModelNight = viewModel.getNight();
                    }
                    updateRegistration(7, viewModelNight);


                    if (viewModelNight != null) {
                        // read viewModel.night.get()
                        viewModelNightGet = viewModelNight.get();
                    }
            }
            if ((dirtyFlags & 0xc0000100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantItem
                        viewModelRestaurantItem = viewModel.getRestaurantItem();
                    }
                    updateRegistration(8, viewModelRestaurantItem);


                    if (viewModelRestaurantItem != null) {
                        // read viewModel.restaurantItem.get()
                        viewModelRestaurantItemGet = viewModelRestaurantItem.get();
                    }
            }
            if ((dirtyFlags & 0xc0000200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.noonTemp
                        viewModelNoonTemp = viewModel.getNoonTemp();
                    }
                    updateRegistration(9, viewModelNoonTemp);


                    if (viewModelNoonTemp != null) {
                        // read viewModel.noonTemp.get()
                        viewModelNoonTempGet = viewModelNoonTemp.get();
                    }
            }
            if ((dirtyFlags & 0xc0000400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hostName
                        viewModelHostName = viewModel.getHostName();
                    }
                    updateRegistration(10, viewModelHostName);


                    if (viewModelHostName != null) {
                        // read viewModel.hostName.get()
                        viewModelHostNameGet = viewModelHostName.get();
                    }
            }
            if ((dirtyFlags & 0xc0000800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.commentTime
                        viewModelCommentTime = viewModel.getCommentTime();
                    }
                    updateRegistration(11, viewModelCommentTime);


                    if (viewModelCommentTime != null) {
                        // read viewModel.commentTime.get()
                        viewModelCommentTimeGet = viewModelCommentTime.get();
                    }
            }
            if ((dirtyFlags & 0xc0001000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cityName
                        viewModelCityName = viewModel.getCityName();
                    }
                    updateRegistration(12, viewModelCityName);


                    if (viewModelCityName != null) {
                        // read viewModel.cityName.get()
                        viewModelCityNameGet = viewModelCityName.get();
                    }
            }
            if ((dirtyFlags & 0xc0002000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.morningTemp
                        viewModelMorningTemp = viewModel.getMorningTemp();
                    }
                    updateRegistration(13, viewModelMorningTemp);


                    if (viewModelMorningTemp != null) {
                        // read viewModel.morningTemp.get()
                        viewModelMorningTempGet = viewModelMorningTemp.get();
                    }
            }
            if ((dirtyFlags & 0xc0004000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barName
                        viewModelBarName = viewModel.getBarName();
                    }
                    updateRegistration(14, viewModelBarName);


                    if (viewModelBarName != null) {
                        // read viewModel.barName.get()
                        viewModelBarNameGet = viewModelBarName.get();
                    }
            }
            if ((dirtyFlags & 0xc0008000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barItem
                        viewModelBarItem = viewModel.getBarItem();
                    }
                    updateRegistration(15, viewModelBarItem);


                    if (viewModelBarItem != null) {
                        // read viewModel.barItem.get()
                        viewModelBarItemGet = viewModelBarItem.get();
                    }
            }
            if ((dirtyFlags & 0xc0010000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.commentCount
                        viewModelCommentCount = viewModel.getCommentCount();
                    }
                    updateRegistration(16, viewModelCommentCount);


                    if (viewModelCommentCount != null) {
                        // read viewModel.commentCount.get()
                        viewModelCommentCountGet = viewModelCommentCount.get();
                    }
            }
            if ((dirtyFlags & 0xc0020000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.afterNoonSlotVisible
                        viewModelAfterNoonSlotVisible = viewModel.getAfterNoonSlotVisible();
                    }
                    updateRegistration(17, viewModelAfterNoonSlotVisible);


                    if (viewModelAfterNoonSlotVisible != null) {
                        // read viewModel.afterNoonSlotVisible.get()
                        viewModelAfterNoonSlotVisibleGet = viewModelAfterNoonSlotVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.afterNoonSlotVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAfterNoonSlotVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAfterNoonSlotVisibleGet);
                if((dirtyFlags & 0xc0020000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAfterNoonSlotVisibleGet) {
                            dirtyFlags |= 0x2000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x1000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.afterNoonSlotVisible.get()) ? View.GONE : View.VISIBLE
                    viewModelAfterNoonSlotVisibleViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAfterNoonSlotVisibleGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.afterNoonSlotVisible.get()) ? View.VISIBLE : View.GONE
                    viewModelAfterNoonSlotVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAfterNoonSlotVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eveningSlotVisible
                        viewModelEveningSlotVisible = viewModel.getEveningSlotVisible();
                    }
                    updateRegistration(18, viewModelEveningSlotVisible);


                    if (viewModelEveningSlotVisible != null) {
                        // read viewModel.eveningSlotVisible.get()
                        viewModelEveningSlotVisibleGet = viewModelEveningSlotVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.eveningSlotVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelEveningSlotVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelEveningSlotVisibleGet);
                if((dirtyFlags & 0xc0040000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelEveningSlotVisibleGet) {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x800000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                            dirtyFlags |= 0x400000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.eveningSlotVisible.get()) ? View.GONE : View.VISIBLE
                    viewModelEveningSlotVisibleViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelEveningSlotVisibleGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.eveningSlotVisible.get()) ? View.VISIBLE : View.GONE
                    viewModelEveningSlotVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelEveningSlotVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0080000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nightTemp
                        viewModelNightTemp = viewModel.getNightTemp();
                    }
                    updateRegistration(19, viewModelNightTemp);


                    if (viewModelNightTemp != null) {
                        // read viewModel.nightTemp.get()
                        viewModelNightTempGet = viewModelNightTemp.get();
                    }
            }
            if ((dirtyFlags & 0xc0100000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nightSlotVisible
                        viewModelNightSlotVisible = viewModel.getNightSlotVisible();
                    }
                    updateRegistration(20, viewModelNightSlotVisible);


                    if (viewModelNightSlotVisible != null) {
                        // read viewModel.nightSlotVisible.get()
                        viewModelNightSlotVisibleGet = viewModelNightSlotVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nightSlotVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelNightSlotVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelNightSlotVisibleGet);
                if((dirtyFlags & 0xc0100000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelNightSlotVisibleGet) {
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nightSlotVisible.get()) ? View.VISIBLE : View.GONE
                    viewModelNightSlotVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelNightSlotVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nightSlotVisible.get()) ? View.GONE : View.VISIBLE
                    viewModelNightSlotVisibleViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelNightSlotVisibleGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc0200000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.morningSlotVisible
                        viewModelMorningSlotVisible = viewModel.getMorningSlotVisible();
                    }
                    updateRegistration(21, viewModelMorningSlotVisible);


                    if (viewModelMorningSlotVisible != null) {
                        // read viewModel.morningSlotVisible.get()
                        viewModelMorningSlotVisibleGet = viewModelMorningSlotVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.morningSlotVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelMorningSlotVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelMorningSlotVisibleGet);
                if((dirtyFlags & 0xc0200000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelMorningSlotVisibleGet) {
                            dirtyFlags |= 0x8000000000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.morningSlotVisible.get()) ? View.GONE : View.VISIBLE
                    viewModelMorningSlotVisibleViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelMorningSlotVisibleGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.morningSlotVisible.get()) ? View.VISIBLE : View.GONE
                    viewModelMorningSlotVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelMorningSlotVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0400000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.morning
                        viewModelMorning = viewModel.getMorning();
                    }
                    updateRegistration(22, viewModelMorning);


                    if (viewModelMorning != null) {
                        // read viewModel.morning.get()
                        viewModelMorningGet = viewModelMorning.get();
                    }
            }
            if ((dirtyFlags & 0xc0800000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.afterNoonTemp
                        viewModelAfterNoonTemp = viewModel.getAfterNoonTemp();
                    }
                    updateRegistration(23, viewModelAfterNoonTemp);


                    if (viewModelAfterNoonTemp != null) {
                        // read viewModel.afterNoonTemp.get()
                        viewModelAfterNoonTempGet = viewModelAfterNoonTemp.get();
                    }
            }
            if ((dirtyFlags & 0xc1000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.noonSlotVisible
                        viewModelNoonSlotVisible = viewModel.getNoonSlotVisible();
                    }
                    updateRegistration(24, viewModelNoonSlotVisible);


                    if (viewModelNoonSlotVisible != null) {
                        // read viewModel.noonSlotVisible.get()
                        viewModelNoonSlotVisibleGet = viewModelNoonSlotVisible.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.noonSlotVisible.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelNoonSlotVisibleGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelNoonSlotVisibleGet);
                if((dirtyFlags & 0xc1000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelNoonSlotVisibleGet) {
                            dirtyFlags |= 0x80000000000L;
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000L;
                            dirtyFlags |= 0x100000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.noonSlotVisible.get()) ? View.VISIBLE : View.GONE
                    viewModelNoonSlotVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelNoonSlotVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.noonSlotVisible.get()) ? View.GONE : View.VISIBLE
                    viewModelNoonSlotVisibleViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelNoonSlotVisibleGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc2000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.afterNoon
                        viewModelAfterNoon = viewModel.getAfterNoon();
                    }
                    updateRegistration(25, viewModelAfterNoon);


                    if (viewModelAfterNoon != null) {
                        // read viewModel.afterNoon.get()
                        viewModelAfterNoonGet = viewModelAfterNoon.get();
                    }
            }
            if ((dirtyFlags & 0xc4000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.evening
                        viewModelEvening = viewModel.getEvening();
                    }
                    updateRegistration(26, viewModelEvening);


                    if (viewModelEvening != null) {
                        // read viewModel.evening.get()
                        viewModelEveningGet = viewModelEvening.get();
                    }
            }
            if ((dirtyFlags & 0xc8000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barAddress
                        viewModelBarAddress = viewModel.getBarAddress();
                    }
                    updateRegistration(27, viewModelBarAddress);


                    if (viewModelBarAddress != null) {
                        // read viewModel.barAddress.get()
                        viewModelBarAddressGet = viewModelBarAddress.get();
                    }
            }
            if ((dirtyFlags & 0xd0000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barTime
                        viewModelBarTime = viewModel.getBarTime();
                    }
                    updateRegistration(28, viewModelBarTime);


                    if (viewModelBarTime != null) {
                        // read viewModel.barTime.get()
                        viewModelBarTimeGet = viewModelBarTime.get();
                    }
            }
            if ((dirtyFlags & 0xe0000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.commentAuthor
                        viewModelCommentAuthor = viewModel.getCommentAuthor();
                    }
                    updateRegistration(29, viewModelCommentAuthor);


                    if (viewModelCommentAuthor != null) {
                        // read viewModel.commentAuthor.get()
                        viewModelCommentAuthorGet = viewModelCommentAuthor.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80000000L) != 0) {
            // api target 1

            this.accept.setOnClickListener(mCallback6);
            this.acceptBottom.setOnClickListener(mCallback8);
            this.decline.setOnClickListener(mCallback7);
            this.declineBottom.setOnClickListener(mCallback9);
            this.mboundView111.setOnClickListener(mCallback2);
            this.mboundView15.setOnClickListener(mCallback3);
            this.mboundView19.setOnClickListener(mCallback4);
            this.mboundView23.setOnClickListener(mCallback5);
            this.mboundView44.setOnClickListener(mCallback10);
            this.mboundView7.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xe0000000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.authorName, viewModelCommentAuthorGet);
        }
        if ((dirtyFlags & 0xc0000200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelNoonTempGet);
            this.mboundView12.setSlotTemp(viewModelNoonTempGet);
        }
        if ((dirtyFlags & 0xc0200000L) != 0) {
            // api target 1

            this.mboundView11.getRoot().setVisibility(viewModelMorningSlotVisibleViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(viewModelMorningSlotVisibleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc0000000L) != 0) {
            // api target 1

            this.mboundView11.setViewModel(viewModel);
            this.mboundView110.setViewModel(viewModel);
            this.mboundView12.setViewModel(viewModel);
            this.mboundView16.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0xc0400000L) != 0) {
            // api target 1

            this.mboundView11.setSlotName(viewModelMorningGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelMorningGet);
        }
        if ((dirtyFlags & 0xc0002000L) != 0) {
            // api target 1

            this.mboundView11.setSlotTemp(viewModelMorningTempGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelMorningTempGet);
        }
        if ((dirtyFlags & 0xc0100000L) != 0) {
            // api target 1

            this.mboundView110.getRoot().setVisibility(viewModelNightSlotVisibleViewVISIBLEViewGONE);
            this.mboundView41.setVisibility(viewModelNightSlotVisibleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc0000080L) != 0) {
            // api target 1

            this.mboundView110.setSlotName(viewModelNightGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView42, viewModelNightGet);
        }
        if ((dirtyFlags & 0xc0080000L) != 0) {
            // api target 1

            this.mboundView110.setSlotTemp(viewModelNightTempGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView43, viewModelNightTempGet);
        }
        if ((dirtyFlags & 0xc1000000L) != 0) {
            // api target 1

            this.mboundView12.getRoot().setVisibility(viewModelNoonSlotVisibleViewVISIBLEViewGONE);
            this.mboundView8.setVisibility(viewModelNoonSlotVisibleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc0000001L) != 0) {
            // api target 1

            this.mboundView12.setSlotName(viewModelNoonGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelNoonGet);
        }
        if ((dirtyFlags & 0xc0020000L) != 0) {
            // api target 1

            this.mboundView121.setVisibility(viewModelAfterNoonSlotVisibleViewGONEViewVISIBLE);
            this.mboundView16.getRoot().setVisibility(viewModelAfterNoonSlotVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc2000000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelAfterNoonGet);
            this.mboundView16.setSlotName(viewModelAfterNoonGet);
        }
        if ((dirtyFlags & 0xc0800000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelAfterNoonTempGet);
            this.mboundView16.setSlotTemp(viewModelAfterNoonTempGet);
        }
        if ((dirtyFlags & 0xc0040000L) != 0) {
            // api target 1

            this.mboundView161.setVisibility(viewModelEveningSlotVisibleViewGONEViewVISIBLE);
            this.mboundView20.setVisibility(viewModelEveningSlotVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc4000000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewModelEveningGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView21, viewModelEveningGet);
        }
        if ((dirtyFlags & 0xc0000004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, viewModelEveningTempGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView22, viewModelEveningTempGet);
        }
        if ((dirtyFlags & 0xc0000002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelSelectedDateGet);
        }
        if ((dirtyFlags & 0xc0000400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView24, viewModelHostNameGet);
        }
        if ((dirtyFlags & 0xc0004000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView25, viewModelBarNameGet);
        }
        if ((dirtyFlags & 0xd0000000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView26, viewModelBarTimeGet);
        }
        if ((dirtyFlags & 0xc0008000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView27, viewModelBarItemGet);
        }
        if ((dirtyFlags & 0xc8000000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView28, viewModelBarAddressGet);
        }
        if ((dirtyFlags & 0xc0001000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelCityNameGet);
        }
        if ((dirtyFlags & 0xc0000020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView31, viewModelRestaurantNameGet);
        }
        if ((dirtyFlags & 0xc0000040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView32, viewModelRestaurantTimeGet);
        }
        if ((dirtyFlags & 0xc0000100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView33, viewModelRestaurantItemGet);
        }
        if ((dirtyFlags & 0xc0000010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView34, viewModelRestaurantAddressGet);
        }
        if ((dirtyFlags & 0xc0000800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView38, viewModelCommentTimeGet);
        }
        if ((dirtyFlags & 0xc0000008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView39, viewModelCommentGet);
        }
        if ((dirtyFlags & 0xc0010000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView40, viewModelCommentCountGet);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView16);
        executeBindingsOn(mboundView110);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel.noon != null
                boolean viewModelNoonJavaLangObjectNull = false;
                // viewModel.noon
                androidx.databinding.ObservableField<java.lang.String> viewModelNoon = null;
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.noon.get()
                java.lang.String viewModelNoonGet = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelNoon = viewModel.getNoon();

                    viewModelNoonJavaLangObjectNull = (viewModelNoon) != (null);
                    if (viewModelNoonJavaLangObjectNull) {


                        viewModelNoonGet = viewModelNoon.get();

                        viewModel.morningSlotExpended(viewModelNoonGet);
                    }
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.declinedClick("rest");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.morning.get()
                java.lang.String viewModelMorningGet = null;
                // viewModel.morning
                androidx.databinding.ObservableField<java.lang.String> viewModelMorning = null;
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.morning != null
                boolean viewModelMorningJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelMorning = viewModel.getMorning();

                    viewModelMorningJavaLangObjectNull = (viewModelMorning) != (null);
                    if (viewModelMorningJavaLangObjectNull) {


                        viewModelMorningGet = viewModelMorning.get();

                        viewModel.morningSlotExpended(viewModelMorningGet);
                    }
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.acceptedClick("rest");
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.declinedClick("bar");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.acceptedClick("bar");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.eveningSlotCollapsed();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.eveningSlotExpended();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel.night.get()
                java.lang.String viewModelNightGet = null;
                // viewModel.night
                androidx.databinding.ObservableField<java.lang.String> viewModelNight = null;
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.night != null
                boolean viewModelNightJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelNight = viewModel.getNight();

                    viewModelNightJavaLangObjectNull = (viewModelNight) != (null);
                    if (viewModelNightJavaLangObjectNull) {


                        viewModelNightGet = viewModelNight.get();

                        viewModel.morningSlotExpended(viewModelNightGet);
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.afterNoon != null
                boolean viewModelAfterNoonJavaLangObjectNull = false;
                // viewModel.afterNoon
                androidx.databinding.ObservableField<java.lang.String> viewModelAfterNoon = null;
                // viewModel
                com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
                // viewModel.afterNoon.get()
                java.lang.String viewModelAfterNoonGet = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelAfterNoon = viewModel.getAfterNoon();

                    viewModelAfterNoonJavaLangObjectNull = (viewModelAfterNoon) != (null);
                    if (viewModelAfterNoonJavaLangObjectNull) {


                        viewModelAfterNoonGet = viewModelAfterNoon.get();

                        viewModel.morningSlotExpended(viewModelAfterNoonGet);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.noon
        flag 1 (0x2L): viewModel.selectedDate
        flag 2 (0x3L): viewModel.eveningTemp
        flag 3 (0x4L): viewModel.comment
        flag 4 (0x5L): viewModel.restaurantAddress
        flag 5 (0x6L): viewModel.restaurantName
        flag 6 (0x7L): viewModel.restaurantTime
        flag 7 (0x8L): viewModel.night
        flag 8 (0x9L): viewModel.restaurantItem
        flag 9 (0xaL): viewModel.noonTemp
        flag 10 (0xbL): viewModel.hostName
        flag 11 (0xcL): viewModel.commentTime
        flag 12 (0xdL): viewModel.cityName
        flag 13 (0xeL): viewModel.morningTemp
        flag 14 (0xfL): viewModel.barName
        flag 15 (0x10L): viewModel.barItem
        flag 16 (0x11L): viewModel.commentCount
        flag 17 (0x12L): viewModel.afterNoonSlotVisible
        flag 18 (0x13L): viewModel.eveningSlotVisible
        flag 19 (0x14L): viewModel.nightTemp
        flag 20 (0x15L): viewModel.nightSlotVisible
        flag 21 (0x16L): viewModel.morningSlotVisible
        flag 22 (0x17L): viewModel.morning
        flag 23 (0x18L): viewModel.afterNoonTemp
        flag 24 (0x19L): viewModel.noonSlotVisible
        flag 25 (0x1aL): viewModel.afterNoon
        flag 26 (0x1bL): viewModel.evening
        flag 27 (0x1cL): viewModel.barAddress
        flag 28 (0x1dL): viewModel.barTime
        flag 29 (0x1eL): viewModel.commentAuthor
        flag 30 (0x1fL): viewModel
        flag 31 (0x20L): null
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nightSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nightSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.eveningSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.eveningSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.afterNoonSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.afterNoonSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.morningSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.morningSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.morningSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.morningSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.noonSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.noonSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.noonSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.noonSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.eveningSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.eveningSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.afterNoonSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.afterNoonSlotVisible.get()) ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nightSlotVisible.get()) ? View.GONE : View.VISIBLE
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nightSlotVisible.get()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}