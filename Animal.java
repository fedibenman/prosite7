class Animal{
    public String family ; 
    public String name ; 
    public int aga ; 
    public boolean isMammal ;
    


    Animal (String family, String name, int age, boolean isMammal){
        this.family = family ; 
        this.name = name ; 
        this.aga = age ; 
        this.isMammal = isMammal ; 
    }



    public String toString(){
        return family + " " + name + " " + aga + " " + isMammal ;
    }


}