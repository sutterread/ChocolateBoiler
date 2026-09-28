
public class Boiler {
    private boolean empty;
    private boolean resistorOn;
    private static Boiler instance;
    
    private Boiler(){
        this.empty=true;
        this.resistorOn=false;
    }
    
    public static Boiler getInstance(){
        if(instance==null){
            instance = new Boiler();
        }
        return instance;
    }
    
    public void fillBoiler(){
        if(this.empty && !this.resistorOn){
            System.out.println("\nFilling boiler with chocolate and milk\n");
            this.empty=false;
        }
    }
    
    public void mix(){
        if(!this.empty && !this.resistorOn){
            System.out.println("\nMixing\n");
            this.resistorOn=true;
        }
    }
    
    public void emptyBoiler(){
        if(!this.empty && this.resistorOn){
            System.out.println("\nEmptying boiler\n");
            this.resistorOn=false;
        }
    }
}
