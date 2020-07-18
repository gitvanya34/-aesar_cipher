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
        String s="АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";//АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя
        this.alphabet = s.toCharArray();
        this.shift = shift;
    }
    public void encoder(String msg)
    {
        message=msg.toCharArray();
//        for(char с: message)
//            с=symbolEncryption(с);
        for(int i=0;i<message.length;i++)
            message[i]=symbolEncryption(message[i]);
        System.out.println("-------------------");
        System.out.println(message);
        System.out.println("-------------------");
    }
    public char symbolEncryption(char c)
    {
        int searchSymbol=searchSymbolInAlphabet(c);

        if(searchSymbol==-1)
            return c;
        else if(searchSymbol+shift*2<(alphabet.length))
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

    public void  decoder(String msg)
    {
       shift=1;
        message=msg.toCharArray();

//        char[] message1;
//        System.arraycopy(message,message1);

        for( int k=0;k<alphabet.length;k++)
        {
            for (int i = 0; i < message.length; i++) {
                message[i]=symbolEncryption(message[i]);
            }
            System.out.println(message);
        }
    }

}
