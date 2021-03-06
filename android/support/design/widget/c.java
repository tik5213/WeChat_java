package android.support.design.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.a.b;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.design.widget.BottomSheetBehavior.a;
import android.support.v7.app.j;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public final class c extends j {
    private a cL;

    public c(Context context) {
        this(context, (byte) 0);
    }

    private c(Context context, byte b) {
        int i;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(b.bottomSheetDialogTheme, typedValue, true)) {
            i = typedValue.resourceId;
        } else {
            i = h.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.cL = new 2(this);
        dm();
    }

    public final void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    public final void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    private View a(int i, View view, LayoutParams layoutParams) {
        boolean z;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) View.inflate(getContext(), f.design_bottom_sheet_dialog, null);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(e.design_bottom_sheet);
        BottomSheetBehavior.h(frameLayout).cD = this.cL;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        if (VERSION.SDK_INT < 11) {
            z = true;
        } else {
            TypedValue typedValue = new TypedValue();
            z = getContext().getTheme().resolveAttribute(16843611, typedValue, true) ? typedValue.data != 0 : false;
        }
        if (z) {
            coordinatorLayout.findViewById(e.touch_outside).setOnClickListener(new 1(this));
        }
        return coordinatorLayout;
    }
}
