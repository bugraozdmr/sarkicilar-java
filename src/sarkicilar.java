import java.util.ArrayList;

public class sarkicilar {
    private ArrayList<String> arrayList=new ArrayList<String>();

    public void sarkici_ekle(String a){

        System.out.println(a+" listeye eklendi.");
        arrayList.add(a.toLowerCase());
    }
    public void sarkici_sil(String a){
        if(kontrol(a)!=-1){
            arrayList.remove(a);
            System.out.println(a+" listeden silindi.");
        }else System.out.println("Böyle bir şarkıcı yok.");
    }
    public void sarkici_duzenle(String a,String b){
        if(kontrol(a)!=-1){
            arrayList.set(arrayList.indexOf(a),b);
        }else System.out.println("Böyle bir şarkıcı yok.");
    }
    //kontrol methodu codun kemiği
    public int kontrol(String a){
        int k=arrayList.indexOf(a.toLowerCase());
        if(k!=-1) return 1;
        else return -1;
    }
    public void sarkici_yaz(){
        if (arrayList.size()==0) System.out.println("Henüz şarkıcı yok...");
        for (int i=0;i<arrayList.size();i++){
            System.out.println((i+1)+". şarkıcı :"+arrayList.get(i));
        }
    }
    public void sarkıcı_ara(String a){
        if (kontrol(a)!=-1){
            System.out.println(arrayList.get(arrayList.indexOf(a))+" isimli şarkıcı "+(arrayList.indexOf(a)+1)+". sırada.");
        }else System.out.println("şarkıcı yok...");
    }
}
