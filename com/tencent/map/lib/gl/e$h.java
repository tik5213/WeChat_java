package com.tencent.map.lib.gl;

import android.opengl.GLDebugHelper;
import com.tencent.map.lib.gl.e.l;
import java.io.Writer;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

class e$h {
    EGL10 a;
    EGLDisplay b;
    EGLSurface c;
    EGLConfig d;
    EGLContext e;
    private WeakReference<e> f;

    public e$h(WeakReference<e> weakReference) {
        this.f = weakReference;
    }

    public void a() {
        this.a = (EGL10) EGLContext.getEGL();
        this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.b == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (this.a.eglInitialize(this.b, new int[2])) {
            e eVar = (e) this.f.get();
            if (eVar == null) {
                this.d = null;
                this.e = null;
            } else {
                this.d = e.b(eVar).a(this.a, this.b);
                this.e = e.c(eVar).a(this.a, this.b, this.d);
            }
            if (this.e == null || this.e == EGL10.EGL_NO_CONTEXT) {
                this.e = null;
                a("createContext");
            }
            this.c = null;
            return;
        }
        throw new RuntimeException("eglInitialize failed");
    }

    public boolean b() {
        if (this.a == null) {
            throw new RuntimeException("egl not initialized");
        } else if (this.b == null) {
            throw new RuntimeException("eglDisplay not initialized");
        } else if (this.d == null) {
            throw new RuntimeException("mEglConfig not initialized");
        } else {
            g();
            e eVar = (e) this.f.get();
            if (eVar != null) {
                this.c = e.d(eVar).a(this.a, this.b, this.d, eVar.getHolder());
            } else {
                this.c = null;
            }
            if (this.c == null || this.c == EGL10.EGL_NO_SURFACE) {
                this.a.eglGetError();
                return false;
            } else if (this.a.eglMakeCurrent(this.b, this.c, this.c, this.e)) {
                return true;
            } else {
                a("EGLHelper", "eglMakeCurrent", this.a.eglGetError());
                return false;
            }
        }
    }

    GL c() {
        GL gl = this.e.getGL();
        e eVar = (e) this.f.get();
        if (eVar == null) {
            return gl;
        }
        if (e.e(eVar) != null) {
            gl = e.e(eVar).a(gl);
        }
        if ((e.f(eVar) & 3) == 0) {
            return gl;
        }
        Writer lVar;
        int i = 0;
        if ((e.f(eVar) & 1) != 0) {
            i = 1;
        }
        if ((e.f(eVar) & 2) != 0) {
            lVar = new l();
        } else {
            lVar = null;
        }
        return GLDebugHelper.wrap(gl, i, lVar);
    }

    public int d() {
        if (this.a.eglSwapBuffers(this.b, this.c)) {
            return 12288;
        }
        return this.a.eglGetError();
    }

    public void e() {
        g();
    }

    private void g() {
        if (this.c != null && this.c != EGL10.EGL_NO_SURFACE) {
            this.a.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            e eVar = (e) this.f.get();
            if (eVar != null) {
                e.d(eVar).a(this.a, this.b, this.c);
            }
            this.c = null;
        }
    }

    public void f() {
        if (this.e != null) {
            e eVar = (e) this.f.get();
            if (eVar != null) {
                e.c(eVar).a(this.a, this.b, this.e);
            }
            this.e = null;
        }
        if (this.b != null) {
            this.a.eglTerminate(this.b);
            this.b = null;
        }
    }

    private void a(String str) {
        a(str, this.a.eglGetError());
    }

    public static void a(String str, int i) {
        throw new RuntimeException(b(str, i));
    }

    public static void a(String str, String str2, int i) {
        b(str2, i);
    }

    public static String b(String str, int i) {
        return str + " failed: ";
    }
}
