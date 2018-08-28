package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

final class b {

    /* renamed from: android.support.v4.view.b$1 */
    static class AnonymousClass1 extends AccessibilityDelegate {
        final /* synthetic */ a ub;

        AnonymousClass1(a aVar) {
            this.ub = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.ub.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.ub.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.ub.b(view, accessibilityNodeInfo);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.ub.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.ub.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.ub.sendAccessibilityEvent(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.ub.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public interface a {
        void b(View view, Object obj);

        boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void sendAccessibilityEvent(View view, int i);

        void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent);
    }
}
