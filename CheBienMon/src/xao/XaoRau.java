package xao;

import chin.IInfo;

public class XaoRau implements IInfo {

    @Override
    public String getInfo() {
        return value.get("xao");
    }
}
