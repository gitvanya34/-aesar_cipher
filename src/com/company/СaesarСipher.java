package com.company;

public class СaesarСipher {
    private char[] alphabet;
    private char[] message;
    private int shift;


    //Алфавит в формате АаБбВв
    public СaesarСipher(String alphabet, int shift) {
        this.alphabet = alphabet.toCharArray();
        this.shift = shift;
    }

    public СaesarСipher(int shift) {
        String s="АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХчЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
        this.alphabet = s.toCharArray();
        this.shift = shift;
    }
    public void encoder(String msg)
    {
        message=msg.toCharArray();
        for(char с: message)
            с=symbolEncryption(с);
        System.out.print(message);
    }
    public char symbolEncryption(char c)
    {
        int searchSymbol=searchSymbolInAlphabet(c);

        if(searchSymbol==-1)
            return c;
        else if(searchSymbol+shift*2<=(alphabet.length))
            return alphabet[searchSymbol+shift*2];
        else
            return alphabet[ searchSymbol + shift * 2 - alphabet.length];
    }
    public int searchSymbolInAlphabet(char c)
    {
        int i=0;
        for (char symbol:alphabet)
        {
            if(symbol==c)
                return i;
            i++;
        }
        return -1;
    }
}
