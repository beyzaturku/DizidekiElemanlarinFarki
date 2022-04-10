package enbuyukveenkuucgunfarkı;

public class EnBuyukveenKuucgunFarkı {

    
    public static void main(String[] args) {
        
        int[] dizi = {1,8,14,54,25,36,34,100};
        
        for(int i=0; i<dizi.length; i++)
        {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];
        
        for(int i=0; i<dizi.length;i++)
        {
            if(enKucuk > dizi[i])
            {
                enKucuk = dizi[i];
            }
            if(enBuyuk < dizi[i])
            {
                enBuyuk = dizi[i];
            }
            
        }
        System.out.println("Dizinin en büyük elemanı:" + enBuyuk);
        System.out.println("Dizinin en küçük elemanı:" + enKucuk);
        int islem = (enBuyuk-enKucuk);
        System.out.println("En büyük eleman ile en küçük eleman arasındaki fark:" + islem);
    }
    
}
