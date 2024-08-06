package com.ismail.turkiyekentlerininsimgeleri;

import java.io.Serializable;

public class sehirBilgileri implements Serializable {

    public String yapiAdi;
    public String sehir;
    public int resim;
    public String konum;
    public String bilgi;

    public sehirBilgileri(String yapiAdi,String sehir,int resim,String konum,String bilgi)
    {
        this.yapiAdi=yapiAdi;
        this.sehir = sehir;
        this.resim = resim;
        this.konum = konum;
        this.bilgi = bilgi;
    }
}
