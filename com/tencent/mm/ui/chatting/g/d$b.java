package com.tencent.mm.ui.chatting.g;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R;
import com.tencent.mm.ui.chatting.a.b.a;

class d$b extends a {
    TextView eCn;
    ImageView gmn;
    final /* synthetic */ d tYl;

    public d$b(d dVar, View view) {
        this.tYl = dVar;
        super(view);
        this.gmn = (ImageView) view.findViewById(R.h.fav_icon);
        this.eCm.setSingleLine(false);
        this.eCm.setMaxLines(2);
        this.eCn = (TextView) view.findViewById(R.h.fav_detail);
    }
}
