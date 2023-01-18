public class Role {
    private String therolename;
    public Role(String therolename){
        this.therolename = therolename;
    }
    
    
    public String getRoletherolename(){
        return therolename;
    }
    
    
    
    @Override
    public String toString() {
        return String.format("%s", therolename);
    }
}