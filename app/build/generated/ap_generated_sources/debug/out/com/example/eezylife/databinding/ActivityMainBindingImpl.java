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
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontal, 30);
        sViewsWithIds.put(R.id.topTicket, 31);
        sViewsWithIds.put(R.id.cl_head, 32);
        sViewsWithIds.put(R.id.photo1, 33);
        sViewsWithIds.put(R.id.photo2, 34);
        sViewsWithIds.put(R.id.photo3, 35);
        sViewsWithIds.put(R.id.cl_center, 36);
        sViewsWithIds.put(R.id.accepted, 37);
        sViewsWithIds.put(R.id.declined, 38);
        sViewsWithIds.put(R.id.ticketViewBottom, 39);
        sViewsWithIds.put(R.id.cl_head1, 40);
        sViewsWithIds.put(R.id.accepted_bottom, 41);
        sViewsWithIds.put(R.id.declined_bottom, 42);
        sViewsWithIds.put(R.id.cl_center1, 43);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView10;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView11;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView12;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView13;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView14;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView15;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView16;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView17;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView20;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView21;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView22;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView23;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView27;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView28;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView29;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView7;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView8;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 44, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 23
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[41]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[43]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.LinearLayout) bindings[42]
            , (com.hedyhidoury.calendar.horizontallibrary.HorizontalCalendarView) bindings[30]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[33]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[34]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[35]
            , (android.widget.LinearLayout) bindings[0]
            , (com.mreram.ticketview.TicketView) bindings[39]
            , (com.mreram.ticketview.TicketView) bindings[31]
            );
        this.accept.setTag(null);
        this.acceptBottom.setTag(null);
        this.authorName.setTag(null);
        this.decline.setTag(null);
        this.declineBottom.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (androidx.appcompat.widget.AppCompatTextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (androidx.appcompat.widget.AppCompatTextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (androidx.appcompat.widget.AppCompatTextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (androidx.appcompat.widget.AppCompatTextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (androidx.appcompat.widget.AppCompatTextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (androidx.appcompat.widget.AppCompatTextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (androidx.appcompat.widget.AppCompatTextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (androidx.appcompat.widget.AppCompatTextView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (androidx.appcompat.widget.AppCompatTextView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (androidx.appcompat.widget.AppCompatTextView) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView22 = (androidx.appcompat.widget.AppCompatTextView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView23 = (androidx.appcompat.widget.AppCompatTextView) bindings[23];
        this.mboundView23.setTag(null);
        this.mboundView27 = (androidx.appcompat.widget.AppCompatTextView) bindings[27];
        this.mboundView27.setTag(null);
        this.mboundView28 = (androidx.appcompat.widget.AppCompatTextView) bindings[28];
        this.mboundView28.setTag(null);
        this.mboundView29 = (androidx.appcompat.widget.AppCompatTextView) bindings[29];
        this.mboundView29.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatTextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatTextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatTextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatTextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (androidx.appcompat.widget.AppCompatTextView) bindings[9];
        this.mboundView9.setTag(null);
        this.root.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.eezylife.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.example.eezylife.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.example.eezylife.generated.callback.OnClickListener(this, 4);
        mCallback3 = new com.example.eezylife.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000000L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
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
            mDirtyFlags |= 0x800000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMorningTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelBarName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelBarItem((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelNoon((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelSelectedDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelEveningTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelComment((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelCommentCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelRestaurantAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelRestaurantName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelRestaurantTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModelRestaurantItem((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeViewModelNoonTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeViewModelHostName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 14 :
                return onChangeViewModelMorning((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeViewModelCommentTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 16 :
                return onChangeViewModelAfterNoonTemp((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 17 :
                return onChangeViewModelCityName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 18 :
                return onChangeViewModelAfterNoon((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 19 :
                return onChangeViewModelEvening((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 20 :
                return onChangeViewModelBarAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 21 :
                return onChangeViewModelBarTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 22 :
                return onChangeViewModelCommentAuthor((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMorningTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelMorningTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarName(androidx.databinding.ObservableField<java.lang.String> ViewModelBarName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarItem(androidx.databinding.ObservableField<java.lang.String> ViewModelBarItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNoon(androidx.databinding.ObservableField<java.lang.String> ViewModelNoon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedDate(androidx.databinding.ObservableField<java.lang.String> ViewModelSelectedDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEveningTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelEveningTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelComment(androidx.databinding.ObservableField<java.lang.String> ViewModelComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCommentCount(androidx.databinding.ObservableField<java.lang.String> ViewModelCommentCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantAddress(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantName(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantTime(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRestaurantItem(androidx.databinding.ObservableField<java.lang.String> ViewModelRestaurantItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNoonTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelNoonTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHostName(androidx.databinding.ObservableField<java.lang.String> ViewModelHostName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMorning(androidx.databinding.ObservableField<java.lang.String> ViewModelMorning, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCommentTime(androidx.databinding.ObservableField<java.lang.String> ViewModelCommentTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAfterNoonTemp(androidx.databinding.ObservableField<java.lang.String> ViewModelAfterNoonTemp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCityName(androidx.databinding.ObservableField<java.lang.String> ViewModelCityName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAfterNoon(androidx.databinding.ObservableField<java.lang.String> ViewModelAfterNoon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEvening(androidx.databinding.ObservableField<java.lang.String> ViewModelEvening, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarAddress(androidx.databinding.ObservableField<java.lang.String> ViewModelBarAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBarTime(androidx.databinding.ObservableField<java.lang.String> ViewModelBarTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCommentAuthor(androidx.databinding.ObservableField<java.lang.String> ViewModelCommentAuthor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400000L;
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
        java.lang.String viewModelCommentAuthorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelMorningTemp = null;
        java.lang.String viewModelSelectedDateGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarName = null;
        java.lang.String viewModelCommentGet = null;
        java.lang.String viewModelAfterNoonTempGet = null;
        java.lang.String viewModelHostNameGet = null;
        java.lang.String viewModelCommentTimeGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarItem = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelNoon = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelSelectedDate = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEveningTemp = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelComment = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCommentCount = null;
        java.lang.String viewModelEveningTempGet = null;
        java.lang.String viewModelMorningTempGet = null;
        java.lang.String viewModelAfterNoonGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantAddress = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantName = null;
        java.lang.String viewModelCityNameGet = null;
        java.lang.String viewModelCommentCountGet = null;
        java.lang.String viewModelNoonGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantTime = null;
        java.lang.String viewModelEveningGet = null;
        java.lang.String viewModelBarAddressGet = null;
        java.lang.String viewModelRestaurantNameGet = null;
        java.lang.String viewModelBarNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelRestaurantItem = null;
        java.lang.String viewModelRestaurantTimeGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelNoonTemp = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelHostName = null;
        java.lang.String viewModelNoonTempGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelMorning = null;
        java.lang.String viewModelRestaurantAddressGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCommentTime = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAfterNoonTemp = null;
        java.lang.String viewModelRestaurantItemGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCityName = null;
        java.lang.String viewModelMorningGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAfterNoon = null;
        java.lang.String viewModelBarTimeGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEvening = null;
        com.example.eezylife.viewmodel.MainViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarAddress = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelBarTime = null;
        java.lang.String viewModelBarItemGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCommentAuthor = null;

        if ((dirtyFlags & 0x1ffffffL) != 0) {


            if ((dirtyFlags & 0x1800001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.morningTemp
                        viewModelMorningTemp = viewModel.getMorningTemp();
                    }
                    updateRegistration(0, viewModelMorningTemp);


                    if (viewModelMorningTemp != null) {
                        // read viewModel.morningTemp.get()
                        viewModelMorningTempGet = viewModelMorningTemp.get();
                    }
            }
            if ((dirtyFlags & 0x1800002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barName
                        viewModelBarName = viewModel.getBarName();
                    }
                    updateRegistration(1, viewModelBarName);


                    if (viewModelBarName != null) {
                        // read viewModel.barName.get()
                        viewModelBarNameGet = viewModelBarName.get();
                    }
            }
            if ((dirtyFlags & 0x1800004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barItem
                        viewModelBarItem = viewModel.getBarItem();
                    }
                    updateRegistration(2, viewModelBarItem);


                    if (viewModelBarItem != null) {
                        // read viewModel.barItem.get()
                        viewModelBarItemGet = viewModelBarItem.get();
                    }
            }
            if ((dirtyFlags & 0x1800008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.noon
                        viewModelNoon = viewModel.getNoon();
                    }
                    updateRegistration(3, viewModelNoon);


                    if (viewModelNoon != null) {
                        // read viewModel.noon.get()
                        viewModelNoonGet = viewModelNoon.get();
                    }
            }
            if ((dirtyFlags & 0x1800010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedDate
                        viewModelSelectedDate = viewModel.getSelectedDate();
                    }
                    updateRegistration(4, viewModelSelectedDate);


                    if (viewModelSelectedDate != null) {
                        // read viewModel.selectedDate.get()
                        viewModelSelectedDateGet = viewModelSelectedDate.get();
                    }
            }
            if ((dirtyFlags & 0x1800020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eveningTemp
                        viewModelEveningTemp = viewModel.getEveningTemp();
                    }
                    updateRegistration(5, viewModelEveningTemp);


                    if (viewModelEveningTemp != null) {
                        // read viewModel.eveningTemp.get()
                        viewModelEveningTempGet = viewModelEveningTemp.get();
                    }
            }
            if ((dirtyFlags & 0x1800040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.comment
                        viewModelComment = viewModel.getComment();
                    }
                    updateRegistration(6, viewModelComment);


                    if (viewModelComment != null) {
                        // read viewModel.comment.get()
                        viewModelCommentGet = viewModelComment.get();
                    }
            }
            if ((dirtyFlags & 0x1800080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.commentCount
                        viewModelCommentCount = viewModel.getCommentCount();
                    }
                    updateRegistration(7, viewModelCommentCount);


                    if (viewModelCommentCount != null) {
                        // read viewModel.commentCount.get()
                        viewModelCommentCountGet = viewModelCommentCount.get();
                    }
            }
            if ((dirtyFlags & 0x1800100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantAddress
                        viewModelRestaurantAddress = viewModel.getRestaurantAddress();
                    }
                    updateRegistration(8, viewModelRestaurantAddress);


                    if (viewModelRestaurantAddress != null) {
                        // read viewModel.restaurantAddress.get()
                        viewModelRestaurantAddressGet = viewModelRestaurantAddress.get();
                    }
            }
            if ((dirtyFlags & 0x1800200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantName
                        viewModelRestaurantName = viewModel.getRestaurantName();
                    }
                    updateRegistration(9, viewModelRestaurantName);


                    if (viewModelRestaurantName != null) {
                        // read viewModel.restaurantName.get()
                        viewModelRestaurantNameGet = viewModelRestaurantName.get();
                    }
            }
            if ((dirtyFlags & 0x1800400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantTime
                        viewModelRestaurantTime = viewModel.getRestaurantTime();
                    }
                    updateRegistration(10, viewModelRestaurantTime);


                    if (viewModelRestaurantTime != null) {
                        // read viewModel.restaurantTime.get()
                        viewModelRestaurantTimeGet = viewModelRestaurantTime.get();
                    }
            }
            if ((dirtyFlags & 0x1800800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.restaurantItem
                        viewModelRestaurantItem = viewModel.getRestaurantItem();
                    }
                    updateRegistration(11, viewModelRestaurantItem);


                    if (viewModelRestaurantItem != null) {
                        // read viewModel.restaurantItem.get()
                        viewModelRestaurantItemGet = viewModelRestaurantItem.get();
                    }
            }
            if ((dirtyFlags & 0x1801000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.noonTemp
                        viewModelNoonTemp = viewModel.getNoonTemp();
                    }
                    updateRegistration(12, viewModelNoonTemp);


                    if (viewModelNoonTemp != null) {
                        // read viewModel.noonTemp.get()
                        viewModelNoonTempGet = viewModelNoonTemp.get();
                    }
            }
            if ((dirtyFlags & 0x1802000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hostName
                        viewModelHostName = viewModel.getHostName();
                    }
                    updateRegistration(13, viewModelHostName);


                    if (viewModelHostName != null) {
                        // read viewModel.hostName.get()
                        viewModelHostNameGet = viewModelHostName.get();
                    }
            }
            if ((dirtyFlags & 0x1804000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.morning
                        viewModelMorning = viewModel.getMorning();
                    }
                    updateRegistration(14, viewModelMorning);


                    if (viewModelMorning != null) {
                        // read viewModel.morning.get()
                        viewModelMorningGet = viewModelMorning.get();
                    }
            }
            if ((dirtyFlags & 0x1808000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.commentTime
                        viewModelCommentTime = viewModel.getCommentTime();
                    }
                    updateRegistration(15, viewModelCommentTime);


                    if (viewModelCommentTime != null) {
                        // read viewModel.commentTime.get()
                        viewModelCommentTimeGet = viewModelCommentTime.get();
                    }
            }
            if ((dirtyFlags & 0x1810000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.afterNoonTemp
                        viewModelAfterNoonTemp = viewModel.getAfterNoonTemp();
                    }
                    updateRegistration(16, viewModelAfterNoonTemp);


                    if (viewModelAfterNoonTemp != null) {
                        // read viewModel.afterNoonTemp.get()
                        viewModelAfterNoonTempGet = viewModelAfterNoonTemp.get();
                    }
            }
            if ((dirtyFlags & 0x1820000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cityName
                        viewModelCityName = viewModel.getCityName();
                    }
                    updateRegistration(17, viewModelCityName);


                    if (viewModelCityName != null) {
                        // read viewModel.cityName.get()
                        viewModelCityNameGet = viewModelCityName.get();
                    }
            }
            if ((dirtyFlags & 0x1840000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.afterNoon
                        viewModelAfterNoon = viewModel.getAfterNoon();
                    }
                    updateRegistration(18, viewModelAfterNoon);


                    if (viewModelAfterNoon != null) {
                        // read viewModel.afterNoon.get()
                        viewModelAfterNoonGet = viewModelAfterNoon.get();
                    }
            }
            if ((dirtyFlags & 0x1880000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.evening
                        viewModelEvening = viewModel.getEvening();
                    }
                    updateRegistration(19, viewModelEvening);


                    if (viewModelEvening != null) {
                        // read viewModel.evening.get()
                        viewModelEveningGet = viewModelEvening.get();
                    }
            }
            if ((dirtyFlags & 0x1900000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barAddress
                        viewModelBarAddress = viewModel.getBarAddress();
                    }
                    updateRegistration(20, viewModelBarAddress);


                    if (viewModelBarAddress != null) {
                        // read viewModel.barAddress.get()
                        viewModelBarAddressGet = viewModelBarAddress.get();
                    }
            }
            if ((dirtyFlags & 0x1a00000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.barTime
                        viewModelBarTime = viewModel.getBarTime();
                    }
                    updateRegistration(21, viewModelBarTime);


                    if (viewModelBarTime != null) {
                        // read viewModel.barTime.get()
                        viewModelBarTimeGet = viewModelBarTime.get();
                    }
            }
            if ((dirtyFlags & 0x1c00000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.commentAuthor
                        viewModelCommentAuthor = viewModel.getCommentAuthor();
                    }
                    updateRegistration(22, viewModelCommentAuthor);


                    if (viewModelCommentAuthor != null) {
                        // read viewModel.commentAuthor.get()
                        viewModelCommentAuthorGet = viewModelCommentAuthor.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1000000L) != 0) {
            // api target 1

            this.accept.setOnClickListener(mCallback1);
            this.acceptBottom.setOnClickListener(mCallback3);
            this.decline.setOnClickListener(mCallback2);
            this.declineBottom.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x1c00000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.authorName, viewModelCommentAuthorGet);
        }
        if ((dirtyFlags & 0x1800010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelSelectedDateGet);
        }
        if ((dirtyFlags & 0x1800020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelEveningTempGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewModelEveningTempGet);
        }
        if ((dirtyFlags & 0x1880000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelEveningGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelEveningGet);
        }
        if ((dirtyFlags & 0x1802000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelHostNameGet);
        }
        if ((dirtyFlags & 0x1800002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelBarNameGet);
        }
        if ((dirtyFlags & 0x1a00000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, viewModelBarTimeGet);
        }
        if ((dirtyFlags & 0x1800004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, viewModelBarItemGet);
        }
        if ((dirtyFlags & 0x1900000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewModelBarAddressGet);
        }
        if ((dirtyFlags & 0x1820000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelCityNameGet);
        }
        if ((dirtyFlags & 0x1800200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView20, viewModelRestaurantNameGet);
        }
        if ((dirtyFlags & 0x1800400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView21, viewModelRestaurantTimeGet);
        }
        if ((dirtyFlags & 0x1800800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView22, viewModelRestaurantItemGet);
        }
        if ((dirtyFlags & 0x1800100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView23, viewModelRestaurantAddressGet);
        }
        if ((dirtyFlags & 0x1808000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView27, viewModelCommentTimeGet);
        }
        if ((dirtyFlags & 0x1800040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView28, viewModelCommentGet);
        }
        if ((dirtyFlags & 0x1800080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView29, viewModelCommentCountGet);
        }
        if ((dirtyFlags & 0x1804000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelMorningGet);
        }
        if ((dirtyFlags & 0x1800001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelMorningTempGet);
        }
        if ((dirtyFlags & 0x1800008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelNoonGet);
        }
        if ((dirtyFlags & 0x1801000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelNoonTempGet);
        }
        if ((dirtyFlags & 0x1840000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelAfterNoonGet);
        }
        if ((dirtyFlags & 0x1810000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelAfterNoonTempGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
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
            case 1: {
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
            case 4: {
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
            case 3: {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.morningTemp
        flag 1 (0x2L): viewModel.barName
        flag 2 (0x3L): viewModel.barItem
        flag 3 (0x4L): viewModel.noon
        flag 4 (0x5L): viewModel.selectedDate
        flag 5 (0x6L): viewModel.eveningTemp
        flag 6 (0x7L): viewModel.comment
        flag 7 (0x8L): viewModel.commentCount
        flag 8 (0x9L): viewModel.restaurantAddress
        flag 9 (0xaL): viewModel.restaurantName
        flag 10 (0xbL): viewModel.restaurantTime
        flag 11 (0xcL): viewModel.restaurantItem
        flag 12 (0xdL): viewModel.noonTemp
        flag 13 (0xeL): viewModel.hostName
        flag 14 (0xfL): viewModel.morning
        flag 15 (0x10L): viewModel.commentTime
        flag 16 (0x11L): viewModel.afterNoonTemp
        flag 17 (0x12L): viewModel.cityName
        flag 18 (0x13L): viewModel.afterNoon
        flag 19 (0x14L): viewModel.evening
        flag 20 (0x15L): viewModel.barAddress
        flag 21 (0x16L): viewModel.barTime
        flag 22 (0x17L): viewModel.commentAuthor
        flag 23 (0x18L): viewModel
        flag 24 (0x19L): null
    flag mapping end*/
    //end
}