package com.example.demo.dao.entities;

import java.io.Serializable;

public class FunctionList implements Serializable {
    private String fnGroupNo;

    private String fnNo;

    private String fnPath;

    private Short fnSort;

    private String fnDesc;

    private static final long serialVersionUID = 1L;

    public String getFnGroupNo() {
        return fnGroupNo;
    }

    public void setFnGroupNo(String fnGroupNo) {
        this.fnGroupNo = fnGroupNo == null ? null : fnGroupNo.trim();
    }

    public String getFnNo() {
        return fnNo;
    }

    public void setFnNo(String fnNo) {
        this.fnNo = fnNo == null ? null : fnNo.trim();
    }

    public String getFnPath() {
        return fnPath;
    }

    public void setFnPath(String fnPath) {
        this.fnPath = fnPath == null ? null : fnPath.trim();
    }

    public Short getFnSort() {
        return fnSort;
    }

    public void setFnSort(Short fnSort) {
        this.fnSort = fnSort;
    }

    public String getFnDesc() {
        return fnDesc;
    }

    public void setFnDesc(String fnDesc) {
        this.fnDesc = fnDesc == null ? null : fnDesc.trim();
    }
}