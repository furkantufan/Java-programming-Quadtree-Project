
package quadtreeproject;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel; 
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *Bu sınıfın amacı bir agaç oluşturmak,oluşturulan ağaca eleman eklemektir.
 *Aynı zamanda  mouse tıklama işlemleri,buton işlemleri bu sınıf yapısı içinde yer almaktadır.
 *
 * 
 */
public class Agac extends javax.swing.JFrame {

Dugum kok;

static Graphics g;
static int eklenecek1;// dügümlerin x koordinatı
static int eklenecek2;// dügümlerin y koordinatı
static int rootX[]=new int[20];// dügümlerin x degerlerini dizide tutar
static int rootY[]=new int[20];// dügümlerin y degerlerini dizide tutar
static int rootBasX[]=new int[20];//bu x1=0 olan. root düğüm
static int rootBasY[]=new int[20];//bu y1=0 olan. root düğüm
static int rootSonX[]=new int[20];//bu x2=512 olan. root düğüm
static int rootSonY[]=new int[20];//bu y2=512 olan. root düğüm
static int rootMerkezX[]=new int[20];//dügümlerin x koordinatlarını dizide tutar. 
static int rootMerkezY[]=new int[20];//düğümlerin y koordinatlarını dizide tutar.
static int bolge=0;// arayüzde eklenecek bölge tanımı 1.2.3.ve 4. olmak üzere 4 tane bölge var
static int tıklama_sayisi=0;//sayac
static int check=0; //mouse tıklamalarını kontrol eder
static int nokta_Renk=0;
static int[] yedekX=new int[20];//bu x2=512 olan. root düğüm
static int[] yedekY=new int[20];//bu y2=512 olan. root düğüm
static int bulunan_sayisi=0;//arama işlemleri sonucunda bulunan eleman sayısı
static int eleman_sayisi=0;//eklenen bütün düğümlerin eleman sayısını tutar.
static int dugum_sayisi=0;
static int enkucukx[]=new int[20];// rootların x degerlerinin en kucuge dogru sıralanmıs hali
static int enkucuky[]=new int[20];//rootların y degerlerinin en kucuge dogru sıralanmıs hali
static int siralama;
static char[] bulunan=new char[20];
String sirala[]=new String[20];
String sirala2[]=new String[20];
String toplam[]=new String[20];
String sayi;
String harf_sira;
Point p; int r; // yarıcap degerini tutar.
static boolean arama=false;
static int bosluk=0;

    
    public Agac() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        jButton1.setLabel("Olustur");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setLabel("Temizle");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Cember");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jButton4.setText("Mouse Random ekle");
        jButton4.setActionCommand("");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3)
                        .addGap(38, 38, 38)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
       

    }                                    

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {                                     
   if(check==0){
   
        eklenecek1=evt.getX();
        eklenecek2=evt.getY();
        rootX[tıklama_sayisi]=eklenecek1;
        rootY[tıklama_sayisi]=eklenecek2;

        char harf=(char)tıklama_sayisi;
        DugumEkle(eklenecek1,eklenecek2,tıklama_sayisi);
        tıklama_sayisi++;
       
   
   }
        
   else if(check==1){
        p = evt.getPoint(); r = 0; repaint();
    }
    
    }                                    

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {                                      
   if(check==0)
   {
    repaint();
   }
   else if(check==1)
    {      
        
    r = (int) Math.round(evt.getPoint().distance(p));//yarıcap degeri alır mouse bırakıldıgında
       
    int i;bulunan_sayisi=0;
    arama=true;
        for(i=0; i<eleman_sayisi;i++)
        {
            enkucukx[i]=rootX[i];
            enkucuky[i]=rootY[i];
        }
        for (i = 0; i < eleman_sayisi; i++) {
        
         double uzaklık=0;
         double yarıcapx=(double)p.x;
         double yarıcapy=(double)p.y;
         double noktax=(double)rootX[i];
         double noktay=(double)rootY[i];
        int x_fark=(int)noktax-((int)yarıcapx+r/2);
        int y_fark=(int)noktay-((int)yarıcapy+r/2);
        uzaklık=Math.sqrt((Math.pow(x_fark, 2) + Math.pow(y_fark, 2)));
         //uzaklık=Math.sqrt((Math.pow(x_fark-r/2, 2) + Math.pow(y_fark-r/2, 2)));
        // uzaklık=Math.sqrt((noktax-yarıcapx)*(noktax-yarıcapx)+(noktay-yarıcapy)*(noktay-yarıcapy));
           if(uzaklık<r/2)
            {
           bulunan[bulunan_sayisi]=(char)(i+65);
            //System.out.println(bulunan+" noktası Cember icindedir--> koordinatlar:("+diziX[i]+","+diziY[i]+")");
            
           yedekX[bulunan_sayisi]=rootX[i];
           yedekY[bulunan_sayisi]=rootY[i];
            //enkucukx[bulunan_sayisi]=yedekX[i];
           // enkucuky[bulunan_sayisi]=yedekY[i];
           bulunan_sayisi++;
            }
            
        }
        enkucukx=yedekX.clone();
        enkucuky=yedekY.clone();
        
        int temp,temp2;   
        for (int x=1; x<enkucukx.length; x++)
        {
            for(int j=0; j<enkucukx.length-x; j++)
            {
                if (enkucukx[j] > enkucukx [j+1])
                {
                    temp = enkucukx [j];
                    enkucukx [j] = enkucukx [j+1];
                    enkucukx [j+1] = temp;
                    
                    temp2 = enkucuky [j];
                    enkucuky [j] = enkucuky [j+1];
                    enkucuky [j+1] = temp2;
                }
            }
        }
       
       
            repaint();  
    }
    }                                     

    
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
    Random rnd = new Random();
    eklenecek1=rnd.nextInt(480);
    eklenecek2=rnd.nextInt(480);
    rootX[tıklama_sayisi]=eklenecek1;
    rootY[tıklama_sayisi]=eklenecek2;
    char harf=(char)tıklama_sayisi;
    DugumEkle(eklenecek1,eklenecek2,tıklama_sayisi);
    tıklama_sayisi++;
   
    repaint();
        
        
        
        
    }                                     

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
      jPanel1.updateUI();
      jPanel1.removeAll();
      tıklama_sayisi=0;
      kok=null;
      r=0;
      dugum_sayisi=0;
     for(int i=0; i<rootX.length;i++)
     {
         rootX[i]=0;
     }
      
    }                                     

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {                                      
        check=1;// mouse tıklandıgnda calısır
    }                                     

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {                                     
        if(check==1)
    {  r = (int) Math.round(evt.getPoint().distance(p));
                    repaint();}
    }                                    

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {                                      
        
        
        check=0;
    }                                     

    @Override
    public void setPreferredSize(Dimension preferredSize) {
        super.setPreferredSize(preferredSize); 
         setPreferredSize(new Dimension(400, 300));
    }

    /**
     *
     * @param x oluşturulan dügümün koordinatlarındaki x degerini temsil eder.
     * @param y oluşturulan dügümün koordinatlarındaki y degerini temsil eder.
     * @param index olusturulan dügümün sırasını temsil eder.
     */
    public void DugumEkle(int x,int y, int index){

    Dugum newDugum= new Dugum(x,y);

    if(kok==null){
    
    kok= newDugum;
    kok.ustDugumX1=0;
    kok.ustDugumY1=0;
    kok.ustDugumX2=512;
    kok.ustDugumY2=512;
    rootBasX[0]=0;   //basx
    rootBasY[0]=0;   //basy
    rootSonX[0]=512;  //sonx
    rootSonY[0]=512;//sony
    rootMerkezX[0]=kok.x;
    rootMerkezY[0]=kok.y;
    eleman_sayisi++;
    }   
    else{
    Dugum odakDugum=kok;
    Dugum ustDugum;
    Dugum parent;
    while(true){
        
        parent=odakDugum;

        if(x>odakDugum.x && y<odakDugum.y){
        
        ustDugum=odakDugum;
        odakDugum=odakDugum.bolge1;
            if(odakDugum==null)
            {
            parent.bolge1=newDugum;
            parent.bolge1.ustDugumX1=ustDugum.x;
            parent.bolge1.ustDugumY1=ustDugum.ustDugumY1;
            parent.bolge1.ustDugumX2=ustDugum.ustDugumX2;
            parent.bolge1.ustDugumY2=ustDugum.y;
            rootBasX[index]=parent.bolge1.ustDugumX1;
            rootBasY[index]=parent.bolge1.ustDugumY1;
            rootSonX[index]=parent.bolge1.ustDugumX2;
            rootSonY[index]=parent.bolge1.ustDugumY2;
            rootMerkezX[index]=ustDugum.x;
            rootMerkezY[index]=ustDugum.y;
            eleman_sayisi++;
            return;
            }
        }
                
            else if(x<odakDugum.x && y< odakDugum.y) {
           
            ustDugum=odakDugum;
            odakDugum=odakDugum.bolge2;
            if(odakDugum==null){
           
            parent.bolge2=newDugum;
            parent.bolge2.ustDugumX1=ustDugum.ustDugumX1;
            parent.bolge2.ustDugumY1=ustDugum.ustDugumY1;
            parent.bolge2.ustDugumX2=ustDugum.x;
            parent.bolge2.ustDugumY2=ustDugum.y;
            rootBasX[index]=parent.bolge2.ustDugumX1;
            rootBasY[index]=parent.bolge2.ustDugumY1;
            rootSonX[index]=parent.bolge2.ustDugumX2;
            rootSonY[index]=parent.bolge2.ustDugumY2;
            rootMerkezX[index]=ustDugum.x;
            rootMerkezY[index]=ustDugum.y;
            eleman_sayisi++;
            return;
            }
            }

            else if(x<odakDugum.x && y> odakDugum.y)
            {
            ustDugum=odakDugum;
            odakDugum=odakDugum.bolge3;
            if(odakDugum==null)
            {
            parent.bolge3=newDugum;
            parent.bolge3.ustDugumX1=ustDugum.ustDugumX1;
            parent.bolge3.ustDugumY1=ustDugum.y;
            parent.bolge3.ustDugumX2=ustDugum.x;
            parent.bolge3.ustDugumY2=ustDugum.ustDugumY2;
            rootBasX[index]=parent.bolge3.ustDugumX1;
            rootBasY[index]=parent.bolge3.ustDugumY1;
            rootSonX[index]=parent.bolge3.ustDugumX2;
            rootSonY[index]=parent.bolge3.ustDugumY2;
            rootMerkezX[index]=ustDugum.x;
            rootMerkezY[index]=ustDugum.y;
            eleman_sayisi++;
            return;
            }
            }

            else if(x>odakDugum.x && y> odakDugum.y)
            {
            ustDugum=odakDugum;
            odakDugum=odakDugum.bolge4;
            if(odakDugum==null)
            {
            parent.bolge4=newDugum;
            parent.bolge4.ustDugumX1=ustDugum.x;
            parent.bolge4.ustDugumY1=ustDugum.y;
            parent.bolge4.ustDugumX2=ustDugum.ustDugumX2;
            parent.bolge4.ustDugumY2=ustDugum.ustDugumY2;
            rootBasX[index]=parent.bolge4.ustDugumX1;
            rootBasY[index]=parent.bolge4.ustDugumY1;
            rootSonX[index]=parent.bolge4.ustDugumX2;
            rootSonY[index]=parent.bolge4.ustDugumY2;
            rootMerkezX[index]=ustDugum.x;
            rootMerkezY[index]=ustDugum.y;
            eleman_sayisi++;
            return;
            }
            }
    }
    }
}
@Override
public void paint(Graphics g)
{
    int x_basla = 0;
    int y_basla=0;
    char harfbasla=65;
    int boslukx=0;
    Color[] colors = { Color.CYAN, Color.MAGENTA, Color.PINK ,Color.green, Color.ORANGE, Color.BLUE, Color.GRAY,Color.YELLOW };
    int colors_index=0;
    String harf= String.valueOf(harfbasla);
    super.paint(g);
    
    if(check==1){
    g.drawOval(p.x, p.y,r,r);
    int x=65;
    char harf2=(char)x;
    g.setColor(Color.red);
    bosluk=50;
    
       if(arama){
       
        sayi=Integer.toString(bulunan_sayisi)+"adet dugum bulundu";
        String mesaj2="Sıralama";
        for (int i = 0; i <bulunan_sayisi; i++) {
        // g.setColor(Color.red);
        g.fillOval(yedekX[i]-8, yedekY[i]-8, 15, 15);
        String deger=String.valueOf(harf2);
        String mesaj=String.valueOf(bulunan[i]+"-"+yedekX[i]+","+yedekY[i]); 
        g.drawString(mesaj, 525,20+bosluk);
        bosluk+=15;   
        arama=false;
        harf2++;     
        }
        
        g.drawString(sayi, 525,40+bosluk);
        g.drawString(mesaj2,685,50);//siralama yazısını yazar.
        int atla=0;      
           
            for (int i = 20-bulunan_sayisi; i <enkucukx.length; i++) {
             sirala[i]=String.valueOf(enkucukx[i]);
               g.drawString(sirala[i]+"-",680,70+atla);
               atla+=12;
               
            }
           int atlay=0;
            for (int j = 20-bulunan_sayisi; j <enkucuky.length; j++) {
             sirala2[j]=String.valueOf(enkucuky[j]);
               g.drawString(sirala2[j]+" ",720,70+atlay);
               atlay+=12;
           }  
       }
       
        
    }
    g.setColor(Color.BLACK);
    
    for(int i=0;i<tıklama_sayisi;i++)
    {
       
        if(i==0){
        x_basla=rootX[i];
        y_basla=rootY[i];

        g.fillOval(rootX[i]-3, rootY[i]-3, 6, 6);
        g.drawString(harf,rootX[i]-9,rootY[i]-9);
        g.drawLine(x_basla, 0, x_basla, 512);
        g.drawLine(0, y_basla, 512, y_basla);
        }
        else{
        g.setColor(colors[(colors_index++) % 6]);
        char harfbasla_2=(char) (harfbasla +(char)i);  
        String harf2=String.valueOf(harfbasla_2);
        g.fillOval(rootX[i]-3, rootY[i]-3, 6, 6);
        g.drawString(harf2,rootX[i]-9,rootY[i]-9);
        g.drawLine(rootBasX[i], rootY[i], rootSonX[i], rootY[i]);
        g.drawLine(rootX[i], rootBasY[i], rootX[i], rootSonY[i]);
        }
    }
}

    /**
     *Jframe arayüz ekranının oluşturulmasını saglar.
     * @param args icerisinde herhangi bir deger tutmamaktadır.
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration                   
}



class Dugum
{
int x,y;
Dugum bolge1;
Dugum bolge2;
Dugum bolge3;
Dugum bolge4;
int ustDugumX1;
int ustDugumY1;
int ustDugumX2;
int ustDugumY2;
int ustMerkezX;
int ustMerkezY;

    Dugum(int x,int y)
    {
    this.x=x;
    this.y=y;
    }
}

