package com.company;

public class Encoder {
    private String alphabet;
    private int shift;

//Алфавит в формате АаБбВв
    public Encoder(String alphabet, int shift) {
        this.alphabet = alphabet;
        this.shift = shift;
    }

    public Encoder(int shift) {
        this.alphabet ="АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХчЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
        this.shift = shift;
    }

}
