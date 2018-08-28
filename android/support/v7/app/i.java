package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

final class i extends h {
    private final UiModeManager Eu;

    class a extends a {
        a(Callback callback) {
            super(callback);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (i.this.Es) {
                switch (i) {
                    case 0:
                        return a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    i(Context context, Window window, d dVar) {
        super(context, window, dVar);
        this.Eu = (UiModeManager) context.getSystemService("uimode");
    }

    final Callback a(Callback callback) {
        return new a(callback);
    }

    final int aG(int i) {
        if (i == 0 && this.Eu.getNightMode() == 0) {
            return -1;
        }
        return super.aG(i);
    }
}
