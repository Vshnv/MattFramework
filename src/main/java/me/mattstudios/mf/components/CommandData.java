package me.mattstudios.mf.components;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CommandData {

    private Method method;

    private boolean def;
    private Class firstParam;
    private List<Class> params;

    private String permission;

    public CommandData() {
        params = new ArrayList<>();
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public boolean isDef() {
        return def;
    }

    public void setDef(boolean def) {
        this.def = def;
    }

    public Class getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(Class firstParam) {
        this.firstParam = firstParam;
    }

    public List<Class> getParams() {
        return params;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public boolean hasPermission() {
        return permission != null;
    }

    public String getPermission() {
        return permission;
    }
}
