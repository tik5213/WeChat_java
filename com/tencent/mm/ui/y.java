package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bq.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMNeatTextView;

public final class y {
    public static final int[] tnN = new int[]{16843087, 16843088, 16843379};
    public static final int[] tnO = new int[]{16843379};

    private static final class a implements Factory {
        LayoutInflater layoutInflater;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
            View view = null;
            try {
                if (str.indexOf(".") == -1) {
                    View createView;
                    if (str.equals("WebView")) {
                        createView = createView(str, "android.webkit.", attributeSet);
                    } else {
                        createView = null;
                    }
                    if (createView == null) {
                        createView = createView(str, "android.widget.", attributeSet);
                    }
                    view = createView == null ? createView(str, "android.view.", attributeSet) : createView;
                } else {
                    view = this.layoutInflater.createView(str, null, attributeSet);
                }
                if ((view instanceof ViewStub) && VERSION.SDK_INT >= 21) {
                    ((ViewStub) view).setLayoutInflater(this.layoutInflater);
                }
                if (view == null) {
                    x.w("MicroMsg.MMLayoutInflater", "Inflate view, ClassNotFound " + str);
                } else if (str.equals("TextView") || str.equals("Button") || str.equals("EditText") || str.equals("CheckBox") || str.equals("ImageView") || str.equals("CheckedTextView") || str.equals("com.tencent.mm.ui.widget.MMTextView") || str.equals("com.tencent.mm.ui.widget.MMEditText") || str.equals("com.tencent.mm.ui.widget.MMNeatTextView") || str.equals("com.tencent.mm.ui.base.MMClearEditText") || str.equals("com.tencent.mm.ui.widget.edittext.PasterEditText") || str.equals("com.tenpay.android.wechat.TenpaySecureEditText") || str.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText") || str.equals("com.tencent.mm.ui.tools.MMTruncTextView") || str.equals("com.tencent.mm.plugin.brandservice.ui.base.CatalogView") || str.equals("com.tencent.mm.ui.tools.CustomFitTextView") || str.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText") || str.equals("com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView") || str.equals("com.tencent.mm.plugin.game.ui.GameDropdownView") || str.equals("com.tencent.mm.ui.ScrollAlwaysTextView") || str.equals("com.tencent.mm.ui.base.MMAutoSizeTextView") || str.equals("com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView") || str.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView") || str.equals("com.tencent.mm.plugin.sns.ui.SnsTextView") || str.equals("com.tencent.mm.plugin.sns.ui.MaskTextView") || str.equals("com.tencent.mm.plugin.sns.ui.SnsEditText") || str.equals("com.tencent.mm.kiss.widget.textview.PLSysTextView")) {
                    float f;
                    float fe = com.tencent.mm.bp.a.fe(context);
                    if ((fe != 1.875f && fe != 2.025f) || str.equals("com.tencent.mm.ui.widget.MMTextView") || str.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView") || str.equals("com.tencent.mm.plugin.sns.ui.SnsTextView") || str.equals("com.tencent.mm.plugin.sns.ui.MaskTextView") || str.equals("com.tencent.mm.ui.widget.MMNeatTextView")) {
                        f = fe;
                    } else {
                        f = 1.625f;
                    }
                    TextView textView;
                    TypedArray obtainStyledAttributes;
                    int i;
                    int resourceId;
                    if (str.equals("TextView") || str.equals("com.tencent.mm.ui.widget.MMTextView")) {
                        textView = (TextView) view;
                        textView.setTextSize(1, (f * textView.getTextSize()) / com.tencent.mm.bp.a.getDensity(textView.getContext()));
                        context.getAssets();
                        e.cgF();
                        if (e.cgG()) {
                            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.tnN);
                            for (i = 0; i < y.tnN.length; i++) {
                                resourceId = obtainStyledAttributes.getResourceId(i, 0);
                                if (resourceId != 0) {
                                    if (y.tnN[i] == 16843379) {
                                        textView.setContentDescription(context.getString(resourceId));
                                    } else if (y.tnN[i] == 16843088) {
                                        textView.setHint(context.getString(resourceId));
                                    } else {
                                        textView.setText(context.getString(resourceId));
                                    }
                                }
                            }
                            obtainStyledAttributes.recycle();
                        }
                    } else if (str.equals("Button")) {
                        Button button = (Button) view;
                        button.setTextSize(1, (f * button.getTextSize()) / com.tencent.mm.bp.a.getDensity(button.getContext()));
                        context.getAssets();
                        e.cgF();
                        if (e.cgG()) {
                            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.tnN);
                            for (i = 0; i < y.tnN.length; i++) {
                                resourceId = obtainStyledAttributes.getResourceId(i, 0);
                                if (resourceId != 0) {
                                    if (y.tnN[i] == 16843379) {
                                        button.setContentDescription(context.getString(resourceId));
                                    } else if (y.tnN[i] == 16843088) {
                                        button.setHint(context.getString(resourceId));
                                    } else {
                                        button.setText(context.getString(resourceId));
                                    }
                                }
                            }
                            obtainStyledAttributes.recycle();
                        }
                    } else if (str.equals("EditText") || str.equals("com.tencent.mm.ui.widget.MMEditText") || str.equals("com.tencent.mm.ui.base.MMClearEditText") || str.equals("com.tencent.mm.ui.widget.edittext.PasterEditText") || str.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText") || str.equals("com.tenpay.android.wechat.TenpaySecureEditText") || str.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText") || str.equals("com.tencent.mm.plugin.sns.ui.SnsEditText")) {
                        EditText editText = (EditText) view;
                        editText.setTextSize(1, (f * editText.getTextSize()) / com.tencent.mm.bp.a.getDensity(editText.getContext()));
                        context.getAssets();
                        e.cgF();
                        if (e.cgG()) {
                            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.tnN);
                            for (i = 0; i < y.tnN.length; i++) {
                                resourceId = obtainStyledAttributes.getResourceId(i, 0);
                                if (resourceId != 0) {
                                    if (y.tnN[i] == 16843379) {
                                        editText.setContentDescription(context.getString(resourceId));
                                    } else if (y.tnN[i] == 16843088) {
                                        editText.setHint(context.getString(resourceId));
                                    } else {
                                        editText.setText(context.getString(resourceId));
                                    }
                                }
                            }
                            obtainStyledAttributes.recycle();
                        }
                    } else if (str.equals("CheckBox")) {
                        CheckBox checkBox = (CheckBox) view;
                        checkBox.setTextSize(1, (f * checkBox.getTextSize()) / com.tencent.mm.bp.a.getDensity(checkBox.getContext()));
                        context.getAssets();
                        e.cgF();
                        if (e.cgG()) {
                            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.tnN);
                            for (i = 0; i < y.tnN.length; i++) {
                                resourceId = obtainStyledAttributes.getResourceId(i, 0);
                                if (resourceId != 0) {
                                    if (y.tnN[i] == 16843379) {
                                        checkBox.setContentDescription(context.getString(resourceId));
                                    } else if (y.tnN[i] == 16843088) {
                                        checkBox.setHint(context.getString(resourceId));
                                    } else {
                                        checkBox.setText(context.getString(resourceId));
                                    }
                                }
                            }
                            obtainStyledAttributes.recycle();
                        }
                    } else if (str.equals("ImageView")) {
                        ImageView imageView = (ImageView) view;
                        context.getAssets();
                        e.cgF();
                        if (e.cgG()) {
                            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.tnO);
                            i = 0;
                            while (i < y.tnO.length) {
                                resourceId = obtainStyledAttributes.getResourceId(i, 0);
                                if (resourceId != 0 && y.tnO[i] == 16843379) {
                                    imageView.setContentDescription(context.getString(resourceId));
                                }
                                i++;
                            }
                            obtainStyledAttributes.recycle();
                        }
                    } else if (str.equals("com.tencent.mm.ui.widget.MMNeatTextView")) {
                        MMNeatTextView mMNeatTextView = (MMNeatTextView) view;
                        mMNeatTextView.setTextSize(1, (f * mMNeatTextView.getTextSize()) / com.tencent.mm.bp.a.getDensity(mMNeatTextView.getContext()));
                    } else {
                        textView = (TextView) view;
                        textView.setTextSize(1, (f * textView.getTextSize()) / com.tencent.mm.bp.a.getDensity(textView.getContext()));
                    }
                }
            } catch (ClassNotFoundException e) {
                x.w("MicroMsg.MMLayoutInflater", "[cpan] class not found. name:%s. Use default Inflate.", str);
            } catch (InflateException e2) {
                x.w("MicroMsg.MMLayoutInflater", "[cpan] Inflate failed. name:%s. Use default Inflate.", str);
            }
            return view;
        }

        private View createView(String str, String str2, AttributeSet attributeSet) {
            View view = null;
            try {
                return this.layoutInflater.createView(str, str2, attributeSet);
            } catch (InflateException e) {
                return view;
            } catch (ClassNotFoundException e2) {
                return view;
            }
        }
    }

    public static LayoutInflater b(LayoutInflater layoutInflater) {
        com.tencent.mm.bp.a.fe(layoutInflater.getContext());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(layoutInflater.getContext());
        Factory aVar = new a();
        aVar.layoutInflater = cloneInContext;
        cloneInContext.setFactory(aVar);
        return cloneInContext;
    }

    public static LayoutInflater gq(Context context) {
        com.tencent.mm.bp.a.fe(context);
        LayoutInflater cloneInContext = LayoutInflater.from(context).cloneInContext(context);
        Factory aVar = new a();
        aVar.layoutInflater = cloneInContext;
        cloneInContext.setFactory(aVar);
        return cloneInContext;
    }
}
