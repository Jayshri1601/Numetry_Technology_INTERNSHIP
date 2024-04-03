interface Drawable{    
    public void draw();    
}
    
class Demo {  
    public static void main(String[] args) {  
        int w = 20;    
        // arrow operator    
        Drawable d=()->{    
            System.out.println(" Drawing width is  "+w);    
        };    
        d.draw();    
    }  
} 