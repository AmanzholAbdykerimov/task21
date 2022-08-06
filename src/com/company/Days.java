package com.company;

public enum Days {
    Monday("Duyshonbu kunu java okuim"),
    Tuesday("Sheishenbi kunu praktika jasaim"),
    Wednesday("Sharshenbi kunu futbolgo baram"),
    Thursday("Beishenbi kunu parkta seildeim"),
    Friday("Juma kunu sabak okuim" ),
    Satyrday("Ishembi kunu dostor menen bolom"),
    Sunday("Jekshembi kunu uido es alam");
    String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    Days(String info){
        this.info=info;
    }
}
