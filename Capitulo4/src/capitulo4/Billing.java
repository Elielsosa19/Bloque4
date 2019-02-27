
package capitulo4;

public class Billing {
        private static float IMP;

    
    public Billing(){
        IMP=(float)0.8;
    }

    public float computeBill(Integer vp){
        return vp+(vp*IMP);
    }
    
    public float computeBill(Integer vp,Integer ca){
        return (vp*ca)+((vp*ca)*IMP);
    }
    
    public float computeBill(Integer vp,Integer ca,Integer vc){
        return ((vp*ca)-vc)+IMP*((vp*ca)-vc);
    }
    public static float getIMP() {
        return IMP;
    }

    public static void setIMP(float aIMP) {
        IMP = aIMP;
    }
    

    
}
